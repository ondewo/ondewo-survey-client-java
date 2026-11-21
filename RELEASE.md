# Release History

*****************

## Release ONDEWO SURVEY Java Client 2.1.1

### New Features

* [[OND236-120]](https://ondewo.atlassian.net/browse/OND236-120) Keycloak authentication in the new package `com.ondewo.survey.auth`: `ClientConfig` gains `keycloakUrl`, `realm`, `clientId`, `username`, `password`, `tokenExpirationInS`, `keycloakVerifySsl` and `refreshToken`, validated all-or-nothing and redacted in `toString()`; `GrpcChannels` attaches `authorization: Bearer <token>` to every call when Keycloak is configured, and nothing otherwise.
* [[OND236-120]](https://ondewo.atlassian.net/browse/OND236-120) Offline-token start-up: with `refreshToken` set, `KeycloakTokenProvider` starts with one `grant_type=refresh_token` exchange and never sends a password grant, not even as a fallback. One shared provider per credential set (SHA-256 keyed, weakly held, never a closed one), plus `CallCredentials`, an interceptor and `attachTo` for any stub. `KeycloakTimings` takes the backoff exponent cap (`maxRetryExponent`, default 6).
* [[OND236-120]](https://ondewo.atlassian.net/browse/OND236-120) Tests: the cross-SDK Keycloak test catalogue (T01-T62) plus edge cases; the 100 % coverage gate is kept.

### Bug Fixes

* [[OND236-120]](https://ondewo.atlassian.net/browse/OND236-120) Keycloak token refresh: a failed refresh no longer ends the refresh. Every failure kind (a 5xx from a proxy, a DNS or connection failure, a restarting Keycloak, a dead offline session) is retried with full-jitter exponential backoff, 5 s doubling up to 300 s and measured from the moment the failure was recorded; the daemon refresh thread and the lazy per-call refresh share that backoff. A success resets the backoff.
* [[OND236-120]](https://ondewo.atlassian.net/browse/OND236-120) A token that is still valid keeps being served when its refresh fails inside the 30 s expiry leeway; only an EXPIRED token raises, and it raises `KeycloakAuthenticationException` whatever failed underneath (transport error, non-2xx status, a body that is not JSON or not a JSON object, a missing `access_token`, a non-numeric `expires_in`), with the original error kept as its cause. A malformed response changes no provider state. Concurrent callers share one in-flight refresh, so an outage costs one token request, not one per call.
* [[OND236-120]](https://ondewo.atlassian.net/browse/OND236-120) A token response without an `access_token` is reported by its field names only, never by its values (a token response is credential material), and a quoted Keycloak error body is cut at 500 characters.
* [[OND236-120]](https://ondewo.atlassian.net/browse/OND236-120) The field names of a response without an `access_token` are quoted as python quotes them (`['expires_in', 'refresh_token']`).

### Improvements

* [[OND236-120]](https://ondewo.atlassian.net/browse/OND236-120) The same Keycloak behaviour as every ONDEWO SDK (the python SDKs are the reference, ondewo-survey-client-python 2.1.1 ships the same fixes): the token request is bounded by a 10 s timeout, durations use a monotonic clock, the `tokenExpirationInS` window is armed on both start-up paths, each failed refresh logs one WARNING with the attempt number, the retry delay and how long the current token stays valid, and the first success afterwards one INFO. No credential appears in any log line, error or rendering of the configuration.
* Tracking API Version [2.1.0](https://github.com/ondewo/ondewo-survey-api/releases/tag/2.1.0) ( [Documentation](https://ondewo.github.io/ondewo-survey-api/) ), generated with ondewo-proto-compiler 5.17.0: the generated code is unchanged from 2.1.0

*****************

## Release ONDEWO SURVEY Java Client 2.1.0

### Improvements

* Tracking API Version [2.1.0](https://github.com/ondewo/ondewo-survey-api/releases/tag/2.1.0) ( [Documentation](https://ondewo.github.io/ondewo-survey-api/) )
* Generated with ondewo-proto-compiler 5.17.0 (protoc 35.1). New runtime floors: protobuf-java 4.35.1, grpc-java 1.85.1 and proto-google-common-protos 2.82.0.

*****************

## Release ONDEWO SURVEY Java Client 2.0.1

### New Features

* TLS and mutual TLS helper in the hand-written package `com.ondewo.survey.channel` (kept by a
  regeneration): `ClientConfig` (`host`, `port`, `grpcCert`, `grpcClientCert`, `grpcClientKey`,
  `useSecureChannel`, default `true`) and `GrpcChannels.newChannel(config)` /
  `GrpcChannels.newChannelBuilder(config)`. One channel serves every stub of the client.
  * The certificate fields take **PEM content, not file paths**. Non-PEM material (typically a path) or an
    encrypted / non-PKCS#8 key is refused with `IllegalArgumentException` before any connection is
    attempted. An empty `grpcCert` means the JVM trust store.
  * `grpcClientCert` and `grpcClientKey` are both-or-neither: setting only one makes
    `ClientConfig.Builder.build()` throw. Both empty means plain server-authenticated TLS.
  * `useSecureChannel(false)` with a client identity throws instead of silently dropping it. A plaintext
    channel logs a `WARNING` naming `host:port` through `java.util.logging`; the logging configuration of
    the application is never touched.
  * `ClientConfig.toString()` shows `grpcClientKey` as `***REDACTED***` (empty when unset) and the
    certificates only as their length; no error message renders a PEM, the key or a whole config.
  * A bare IPv6 literal host is bracketed (`::1` -> `[::1]:50051`); PEMs with CRLF line endings work.
* Channel defaults aligned with the ONDEWO Python clients where grpc-java exposes them: keepalive timeout
  20 s, `keepAliveWithoutCalls(false)`, `maxInboundMessageSize(Integer.MAX_VALUE)`.
  * Keepalive time is **5 minutes**, not the Python clients' 30 s: grpc-java has no
    `http2.max_pings_without_data`, so a 30 s ping on a silent stream is answered by a default grpc-core
    server with a `too_many_pings` GOAWAY (measured against a grpcio 1.81 server). Pair a server that
    permits faster pings with a shorter `keepAliveTime` on the builder.
  * Not available in grpc-java and documented as gaps: `http2.max_pings_without_data`,
    `max_reconnect_backoff_ms` (grpc-java's backoff caps at 120 s), and no retry policy is configured
    (only gRPC's transparent retries).

### Improvements

* Still tracking API Version [2.0.0](https://github.com/ondewo/ondewo-survey-api/releases/tag/2.0.0)
* The stubs are generated by the [ONDEWO proto compiler](https://github.com/ondewo/ondewo-proto-compiler) `5.15.2` (was `5.15.1`).
* README section "TLS, mutual TLS and certificates": modes, loading PEMs from files, a test PKI with openssl,
  channel defaults, security notes and troubleshooting.

### Tests

* `ClientConfigTest` and `GrpcChannelsTest`: real TLS handshakes against a loopback Netty server with a PKI
  generated at test time (BouncyCastle, test scope only; no key is committed) - TLS with a custom CA, mutual
  TLS, CRLF PEMs, IPv6 `[::1]`, empty identity = plain TLS; missing client certificate, client from an
  unrelated CA and wrong CA end in `UNAVAILABLE`; half pair, plaintext with identity, insecure warning and
  redaction edge cases. The 100 % JaCoCo gate now also covers `com/ondewo/survey/channel/**`.
* `ReleaseNotesTest` pins the `RELEASE.md` heading spelling and the `*****` separator the GitHub release
  body is sliced by, and that the current version has non-empty notes.

*****************

## Release ONDEWO SURVEY Java Client 2.0.0

### New Features

* Initial release of the ONDEWO SURVEY (Survey) gRPC client for Java. The library
  is generated from the protobuf definitions of [ondewo-survey-api](https://github.com/ondewo/ondewo-survey-api)
  by the `ondewo-java-proto-compiler` image of the
  [ONDEWO proto compiler](https://github.com/ondewo/ondewo-proto-compiler) release
  `5.15.1`: `protoc --java_out` for the message classes, `protoc-gen-grpc-java` for the
  service stubs, and a rendered `pom.xml` that pins the gRPC, protobuf and
  `proto-google-common-protos` versions the stubs were generated against. The packaged artifact is
  `com.ondewo:ondewo-survey-client-java`, compiled with `maven.compiler.release=11`, and ships a
  sources jar alongside the binary jar.
* `make build` regenerates the whole client from the pinned submodules - api protos and proto
  compiler - and `make test` verifies that every `.proto` produced java code before running
  `mvn verify`: the JUnit 5 suite over the **committed** stubs (4 generated java files, 2 gRPC
  services) plus the JaCoCo gate. Both run in CI on JDK 11 and JDK 21, unconditionally - a
  missing or truncated client turns the run red instead of skipping a step.
* Adds the one hand-written class of this client, `com/ondewo/survey/auth/BearerToken.java`, which wraps the
  `authorization: Bearer <token>` header every ONDEWO server expects and decorates any generated
  stub with it. Coverage is measured over the hand-written sources only and the build fails below
  100% instruction, branch and method coverage.

*****************
