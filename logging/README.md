# Logging (Structured Logging, ELK Stack)

A small structured event records stable fields that can be indexed and queried by a log pipeline such as Elasticsearch, Logstash, and Kibana.

## Trade-offs

Structured logs improve search and correlation; redact personal/sensitive data, bound cardinality, preserve timestamps, and keep logging volume/cost under control.

## Run the example and test

```sh
./gradlew :observability:run --args=logging
./gradlew :observability:test --tests 'com.absolutebonkers.observability.logging.LoggingTest'
```

- [Runnable Java 21 example](../observability/src/main/java/com/absolutebonkers/observability/logging/LoggingDemo.java)
- [Focused JUnit test](../observability/src/test/java/com/absolutebonkers/observability/logging/LoggingTest.java)
- [Primary reference](https://www.elastic.co/guide/en/ecs/current/ecs-reference.html)

## Further primary references

- Elastic Common Schema — [reference](https://www.elastic.co/guide/en/ecs/current/ecs-reference.html); Elastic Stack — [overview](https://www.elastic.co/elastic-stack)
