package com.absolutebonkers.observability.healthcheckendpoints;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HealthChecksTest {
    @Test
    void demonstratesHealthChecks() {
        assertTrue(HealthChecksDemo.run().contains("live=true"));
    }
}
