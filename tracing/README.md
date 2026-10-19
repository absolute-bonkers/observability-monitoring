# Distributed Tracing (Jaeger, Zipkin, OpenTelemetry)

The example prints a synthetic trace ID and parent/child span names. It illustrates trace structure only; it does not create SDK spans, propagate context, or export traces.

## Trade-offs

Tracing reveals cross-service latency and causal paths, but sampling, context propagation, privacy, and instrumentation overhead require explicit design.

## Run the example and test

```sh
./gradlew :observability:run --args=tracing
./gradlew :observability:test --tests 'com.absolutebonkers.observability.distributedtracing.DistributedTracingTest'
```

- [Runnable Java 21 example](../observability/src/main/java/com/absolutebonkers/observability/distributedtracing/DistributedTracingDemo.java)
- [Focused JUnit test](../observability/src/test/java/com/absolutebonkers/observability/distributedtracing/DistributedTracingTest.java)
- [Primary reference](https://opentelemetry.io/docs/concepts/signals/traces/)

## Further primary references

- OpenTelemetry traces — [documentation](https://opentelemetry.io/docs/concepts/signals/traces/); W3C Trace Context — [recommendation](https://www.w3.org/TR/trace-context/)
