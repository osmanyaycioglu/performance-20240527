package org.training.microservice.thread.method;

public class Runner {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MyRunnerThread myRunnerThreadLoc = new MyRunnerThread();
            myRunnerThreadLoc.setName("Runner-" + i);
            myRunnerThreadLoc.start();
        }


    }
}
