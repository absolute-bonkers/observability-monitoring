package com.absolutebonkers.observability.healthcheckendpoints;



public final class HealthChecksDemo {
    private HealthChecksDemo() {}

    public static String run() {
        boolean processRunning = true;
                boolean databaseAvailable = false;
                boolean live = processRunning;
                boolean ready = processRunning && databaseAvailable;
                return "live=" + live + ", ready=" + ready;
    }

    public static void main(String[] args) { System.out.println(run()); }
}
