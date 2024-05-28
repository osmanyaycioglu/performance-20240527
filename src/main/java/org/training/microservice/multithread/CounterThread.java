package org.training.microservice.multithread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;

public class CounterThread extends Thread {

    public long       counter = 0;
    public static AtomicLong acounter = new AtomicLong();
    public static long       scounter = 0;
    private CountDownLatch countDownLatch;

    public CounterThread(final CountDownLatch countDownLatchParam) {
        countDownLatch = countDownLatchParam;
    }

    public static synchronized void increase(){
        scounter++;
    }

    @Override
    public void run() {

        for (int i = 0; i < 2_000_000; i++) {
            counter++;
            // acounter.incrementAndGet();
            // increase();
        }
        countDownLatch.countDown();
    }

    public long getCounter() {
        return counter;
    }
}
