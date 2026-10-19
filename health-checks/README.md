# Health Check Endpoints

Separate liveness from readiness: a healthy process can be live while temporarily not ready to accept traffic. The local example models the two boolean decisions; it does not start an HTTP endpoint or probe a real dependency.

## Trade-offs

Keep liveness checks local and cheap to avoid restart cascades; readiness can include critical dependencies, with timeouts and degraded-mode policy.

## Run the example and test

```sh
./gradlew :observability:run --args=health-checks
./gradlew :observability:test --tests 'com.absolutebonkers.observability.healthcheckendpoints.HealthChecksTest'
```

- [Runnable Java 21 example](../observability/src/main/java/com/absolutebonkers/observability/healthcheckendpoints/HealthChecksDemo.java)
- [Focused JUnit test](../observability/src/test/java/com/absolutebonkers/observability/healthcheckendpoints/HealthChecksTest.java)
- [Primary reference](https://kubernetes.io/docs/concepts/configuration/liveness-readiness-startup-probes/)

## Further primary references

- Kubernetes probes — [documentation](https://kubernetes.io/docs/concepts/configuration/liveness-readiness-startup-probes/)
