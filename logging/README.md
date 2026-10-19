# Logging (Structured Logging, ELK Stack)

The example constructs a small JSON event with a stable Elastic Common Schema field name; it does not write to a file or send data to Elasticsearch, Logstash, or Kibana.

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
