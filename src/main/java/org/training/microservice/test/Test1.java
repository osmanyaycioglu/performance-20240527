package org.training.microservice.test;

import org.training.microservice.Employee;

public class Test1 {
    public static void main(String[] args) {
        for (int i = 0; i < 200_000_000; i++) {
            create(i);
            if (i % 10_000 == 0){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException eParam) {
                }
            }
        }
        try {
            Thread.sleep(100_000);
        } catch (InterruptedException eParam) {
        }

    }

    public static void create(int index){
        Employee employeeLoc = new Employee();
        employeeLoc.setWeight(100);
        employeeLoc.setAge(54);
        employeeLoc.setName("name kdsjbhfkdsjhfkjsdhf sdkfjhsdkfjhsdf sdkfhskjdfjhskdjfn sdfkshdfksjhdfkjsdbf skdjfhskdjfhskdjfhksdfh" + index);
        employeeLoc.setSurname("surname");
    }
}
