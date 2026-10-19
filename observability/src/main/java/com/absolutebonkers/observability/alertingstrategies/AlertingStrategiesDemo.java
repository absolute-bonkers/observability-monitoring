package com.absolutebonkers.observability.alertingstrategies;



public final class AlertingStrategiesDemo {
    private AlertingStrategiesDemo() {}

    public static String run() {
        int[] errorRates = {2, 9, 10, 11};
                int consecutiveHigh = 0;
                for (int rate : errorRates) consecutiveHigh = rate > 8 ? consecutiveHigh + 1 : 0;
                boolean page = consecutiveHigh >= 3;
                return "consecutive-high=" + consecutiveHigh + ", page=" + page;
    }

    public static void main(String[] args) { System.out.println(run()); }
}
