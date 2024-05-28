package org.training.microservice;

public class StringBenchMark {
    public static void main(String[] args) {
        int number = 1000;
        for (int i = 0; i < 1_000_000; i++) {
            String stringLoc = "osman" + i;
            String formatLoc  = String.format("osman %d",
                                              i);
        }
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException eParam) {
            throw new RuntimeException(eParam);
        }

        System.gc();
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException eParam) {
            throw new RuntimeException(eParam);
        }
        long deltaNano = System.nanoTime();

        String stringLoc = "osman" + number;
        System.out.println("Delta Nano : " + (System.nanoTime() - deltaNano));

        long delta = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            String stringLoc2 = "osman" + i;
            // String formatLoc  = String.format("osman %d",
            //                                  i);
        }
        System.out.println("Delta : " + (System.currentTimeMillis() - delta));


    }
}
