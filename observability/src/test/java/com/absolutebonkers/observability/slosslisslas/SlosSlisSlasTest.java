package com.absolutebonkers.observability.slosslisslas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SlosSlisSlasTest {
    @Test
    void demonstratesSlosSlisSlas() {
        String result = SlosSlisSlasDemo.run();
        assertTrue(result.contains("availability-sli=99.95"));
        assertTrue(result.contains("error-budget-allowed=10"));
        assertTrue(result.contains("error-budget-remaining=5"));
    }
}
