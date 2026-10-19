package com.absolutebonkers.observability.slosslisslas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SlosSlisSlasTest {
    @Test
    void demonstratesSlosSlisSlas() {
        assertTrue(SlosSlisSlasDemo.run().contains("availability-sli=99.95"));
    }
}
