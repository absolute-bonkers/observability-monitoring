package com.absolutebonkers.observability.alertingstrategies;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AlertingStrategiesTest {
    @Test
    void demonstratesAlertingStrategies() {
        assertTrue(AlertingStrategiesDemo.run().contains("page=true"));
    }
}
