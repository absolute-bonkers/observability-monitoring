package com.absolutebonkers.observability.apm;



public final class ApplicationPerformanceDemo {
    private ApplicationPerformanceDemo() {}

    public static String run() {
        long started = System.nanoTime();
                long checksum = 0;
                for (int i = 0; i < 1_000; i++) checksum += i;
                long elapsedNanos = System.nanoTime() - started;
                return "operation=demo-work, measured=" + (elapsedNanos >= 0) + ", checksum=" + checksum;
    }

    public static void main(String[] args) { System.out.println(run()); }
}
