package com.absolutebonkers.observability.runner;

public final class Main {
    private Main() {}
    public static void main(String[] args) {
        if (args.length != 1) throw new IllegalArgumentException("Pass a topic slug; see README.md");
        String output = switch (args[0]) {
            case "logging" -> com.absolutebonkers.observability.logging.LoggingDemo.run();
            case "metrics" -> com.absolutebonkers.observability.metrics.MetricsDemo.run();
            case "tracing" -> com.absolutebonkers.observability.distributedtracing.DistributedTracingDemo.run();
            case "alerting" -> com.absolutebonkers.observability.alertingstrategies.AlertingStrategiesDemo.run();
            case "service-objectives" -> com.absolutebonkers.observability.slosslisslas.SlosSlisSlasDemo.run();
            case "health-checks" -> com.absolutebonkers.observability.healthcheckendpoints.HealthChecksDemo.run();
            case "apm" -> com.absolutebonkers.observability.apm.ApplicationPerformanceDemo.run();
            default -> throw new IllegalArgumentException("Unknown topic: " + args[0]);
        };
        System.out.println(output);
    }
}
