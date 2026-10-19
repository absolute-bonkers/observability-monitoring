package com.absolutebonkers.observability.distributedtracing;



public final class DistributedTracingDemo {
    private DistributedTracingDemo() {}

    public static String run() {
        String traceId = "trace-demo-001";
                String parentSpan = "http-server";
                String childSpan = "db-query";
                return "trace=" + traceId + ", spans=" + parentSpan + " -> " + childSpan;
    }

    public static void main(String[] args) { System.out.println(run()); }
}
