# Application Performance Monitoring (APM)

A tiny in-process measurement wraps a simulated operation with a monotonic clock and reports whether a duration was captured.

## Trade-offs

APM correlates traces, metrics, profiles, and errors to locate performance issues; instrumentation must manage privacy, sampling, and overhead.

## Run the example and test

```sh
./gradlew :observability:run --args=apm
./gradlew :observability:test --tests 'com.absolutebonkers.observability.apm.ApplicationPerformanceTest'
```

- [Runnable Java 21 example](../observability/src/main/java/com/absolutebonkers/observability/apm/ApplicationPerformanceDemo.java)
- [Focused JUnit test](../observability/src/test/java/com/absolutebonkers/observability/apm/ApplicationPerformanceTest.java)
- [Primary reference](https://opentelemetry.io/docs/concepts/signals/)

## Further primary references

- OpenTelemetry signals — [documentation](https://opentelemetry.io/docs/concepts/signals/)
