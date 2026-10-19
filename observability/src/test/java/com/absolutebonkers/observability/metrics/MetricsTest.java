package com.absolutebonkers.observability.metrics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MetricsTest {
    @Test
    void demonstratesMetrics() {
        assertTrue(MetricsDemo.run().contains("http_requests_total=12"));
    }
}
