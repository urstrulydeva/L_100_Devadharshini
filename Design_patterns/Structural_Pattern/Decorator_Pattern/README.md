# Decorator Pattern — HTTP Client (Java)

Like putting on costumes to get extra powers: the same HTTP client can wear
**Retry**, **Logging**, and **Metrics** outfits without changing who it is.

Use **Decorator** to compose cross-cutting concerns (observability, resilience,
security) around a stable interface. Avoids inheritance explosion; each concern
is testable and reorderable at runtime.

## Files
- `HttpClient.java` — core interface
- `SimpleHttpClient.java` — minimal implementation
- `FlakyHttpClient.java` — deterministic failures to show retries
- `HttpClientDecorator.java` — base decorator
- `LoggingClient.java` — logs requests/responses/errors
- `MetricsClient.java` — measures latency
- `RetryClient.java` — retries transient failures
- `DecoratorMain.java` — demo entrypoint

## Run
```bash
javac *.java
java DecoratorMain
