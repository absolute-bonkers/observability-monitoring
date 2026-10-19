package com.absolutebonkers.observability.metrics;



public final class MetricsDemo {
    private MetricsDemo() {}

    public static String run() {
        long requestsTotal = 12;
                double requestDurationSeconds = 0.24;
                return "http_requests_total=" + requestsTotal + ", duration_seconds=" + requestDurationSeconds;
    }

    public static void main(String[] args) { System.out.println(run()); }
}
