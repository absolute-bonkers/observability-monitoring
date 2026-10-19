package com.absolutebonkers.observability.distributedtracing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DistributedTracingTest {
    @Test
    void demonstratesDistributedTracing() {
        assertTrue(DistributedTracingDemo.run().contains("spans=http-server -> db-query"));
    }
}
