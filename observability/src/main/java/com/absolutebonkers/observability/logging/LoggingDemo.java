package com.absolutebonkers.observability.logging;



public final class LoggingDemo {
    private LoggingDemo() {}

    public static String run() {
        String json = "{\"level\":\"INFO\",\"event\":\"checkout.completed\",\"order_id\":\"demo-42\"}";
                return "structured=" + (json.startsWith("{") && json.contains("order_id")) + ", event=checkout.completed";
    }

    public static void main(String[] args) { System.out.println(run()); }
}
