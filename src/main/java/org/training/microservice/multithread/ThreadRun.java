package org.training.microservice.multithread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class ThreadRun {
    public static void main(String[] args) {
        long delta = System.currentTimeMillis();
        List<CounterThread> counterThreadsLoc = new ArrayList<>();
        CountDownLatch countDownLatchLoc = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            CounterThread counterThreadLoc = new CounterThread(countDownLatchLoc);
            counterThreadLoc.start();
            counterThreadsLoc.add(counterThreadLoc);
        }

        try {
            countDownLatchLoc.await();
            System.out.println("Delta : " + (System.currentTimeMillis() - delta));
        } catch (InterruptedException eParam) {
            throw new RuntimeException(eParam);
        }
        long total = 0;
        for (CounterThread counterThreadLoc : counterThreadsLoc) {
            total += counterThreadLoc.getCounter();
        }

        System.out.println("Counter : " + total);
        System.out.println("ATomic Counter : " + CounterThread.acounter);
        System.out.println("sCounter : " + CounterThread.scounter);
    }
}
