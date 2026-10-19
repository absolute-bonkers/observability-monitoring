# SLOs, SLIs, SLAs

A simple availability SLI is compared with an SLO target, and the remaining error budget is calculated for the period.

## Trade-offs

SLIs measure outcomes, SLOs set internal reliability targets, and SLAs are external commitments with consequences; select indicators users can understand.

## Run the example and test

```sh
./gradlew :observability:run --args=service-objectives
./gradlew :observability:test --tests 'com.absolutebonkers.observability.slosslisslas.SlosSlisSlasTest'
```

- [Runnable Java 21 example](../observability/src/main/java/com/absolutebonkers/observability/slosslisslas/SlosSlisSlasDemo.java)
- [Focused JUnit test](../observability/src/test/java/com/absolutebonkers/observability/slosslisslas/SlosSlisSlasTest.java)
- [Primary reference](https://sre.google/sre-book/service-level-objectives/)

## Further primary references

- Service Level Objectives — [Google SRE book](https://sre.google/sre-book/service-level-objectives/)
