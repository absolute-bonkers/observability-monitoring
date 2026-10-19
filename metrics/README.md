# Metrics (Prometheus, Grafana)

A counter and simple latency sample demonstrate metric types that Prometheus can scrape and Grafana can visualize.

## Trade-offs

Metrics summarize behavior efficiently, but labels must have bounded cardinality; dashboards need units, meaningful aggregation, and context.

## Run the example and test

```sh
./gradlew :observability:run --args=metrics
./gradlew :observability:test --tests 'com.absolutebonkers.observability.metrics.MetricsTest'
```

- [Runnable Java 21 example](../observability/src/main/java/com/absolutebonkers/observability/metrics/MetricsDemo.java)
- [Focused JUnit test](../observability/src/test/java/com/absolutebonkers/observability/metrics/MetricsTest.java)
- [Primary reference](https://prometheus.io/docs/concepts/metric_types/)

## Further primary references

- Prometheus metric types — [documentation](https://prometheus.io/docs/concepts/metric_types/); Grafana dashboards — [documentation](https://grafana.com/docs/grafana/latest/dashboards/)
