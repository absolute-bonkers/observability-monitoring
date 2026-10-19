# Alerting Strategies

A consecutive-window rule requires three high observations before paging, suppressing a single transient spike.

## Trade-offs

Alert on user impact and actionable symptoms; use deduplication, grouping, inhibition, and escalation while preventing noisy flapping.

## Run the example and test

```sh
./gradlew :observability:run --args=alerting
./gradlew :observability:test --tests 'com.absolutebonkers.observability.alertingstrategies.AlertingStrategiesTest'
```

- [Runnable Java 21 example](../observability/src/main/java/com/absolutebonkers/observability/alertingstrategies/AlertingStrategiesDemo.java)
- [Focused JUnit test](../observability/src/test/java/com/absolutebonkers/observability/alertingstrategies/AlertingStrategiesTest.java)
- [Primary reference](https://sre.google/sre-book/monitoring-distributed-systems/)

## Further primary references

- Google SRE monitoring — [chapter](https://sre.google/sre-book/monitoring-distributed-systems/)
