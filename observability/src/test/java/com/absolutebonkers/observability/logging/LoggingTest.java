package com.absolutebonkers.observability.logging;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LoggingTest {
    @Test
    void demonstratesLogging() {
        assertTrue(LoggingDemo.run().contains("structured=true"));
    }
}
