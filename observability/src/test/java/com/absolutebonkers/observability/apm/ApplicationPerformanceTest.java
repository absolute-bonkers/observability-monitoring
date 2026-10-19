package com.absolutebonkers.observability.apm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ApplicationPerformanceTest {
    @Test
    void demonstratesApplicationPerformance() {
        assertTrue(ApplicationPerformanceDemo.run().contains("checksum=499500"));
    }
}
