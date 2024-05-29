package org.training.microservice.thread.method;

import java.util.UUID;

public class MyMethodRun {

    public void method1(String stringParam){
        UUID uuidLoc = UUID.randomUUID();
        method2(stringParam + uuidLoc.toString());

    }

    public void method2(String stringParam){
        UUID uuidLoc = UUID.randomUUID();
        method3(stringParam + uuidLoc.toString());

    }
    public void method3(String stringParam){
        UUID uuidLoc = UUID.randomUUID();
        method4(stringParam + uuidLoc.toString());

    }
    public void method4(String stringParam){
        UUID uuidLoc = UUID.randomUUID();
        method5(stringParam + uuidLoc.toString());

    }
    public void method5(String stringParam){
        UUID uuidLoc = UUID.randomUUID();
        method6(stringParam + uuidLoc.toString());

    }
    public void method6(String stringParam){
        UUID uuidLoc = UUID.randomUUID();
    }

}
