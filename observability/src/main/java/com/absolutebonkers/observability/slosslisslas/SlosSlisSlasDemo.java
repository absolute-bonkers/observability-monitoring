package com.absolutebonkers.observability.slosslisslas;

import java.util.Locale;

public final class SlosSlisSlasDemo {
    private SlosSlisSlasDemo() {}

    public static String run() {
        long totalRequests = 10_000;
                long successfulRequests = 9_995;
                double sli = successfulRequests * 100.0 / totalRequests;
                double budgetEvents = totalRequests * (1.0 - 0.999);
                return "availability-sli=" + String.format(Locale.ROOT, "%.2f", sli) + "%, error-budget-events=" + (int) budgetEvents;
    }

    public static void main(String[] args) { System.out.println(run()); }
}
