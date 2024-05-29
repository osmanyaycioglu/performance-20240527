package org.training.microservice.thread.method;

public class MyRunnerThread extends Thread {
    @Override
    public void run() {
        MyMethodRun myMethodRunLoc = new MyMethodRun();
        while (true) {
            try {
                myMethodRunLoc.method1("osman");
            } catch (Exception exp) {
                exp.printStackTrace();
            }

        }
    }
}
