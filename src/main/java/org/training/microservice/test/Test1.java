package org.training.microservice.test;

import org.training.microservice.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Test1 {

//    private static Map<String, Employee> stringEmployeeMap = new ConcurrentHashMap<>(5_000_000,
//                                                                                     0.9f,
//                                                                                     1_000);
    private static Map<String, Employee> stringEmployeeMap = new HashMap<>();
    private static long counter = 0;
    private static boolean decrease = false;
    private static long decCounter = 0;

    public static void main(String[] args) {

        Scanner scannerLoc = new Scanner(System.in);
        System.out.println("Başlıyalım mı?");
        String nextLoc = scannerLoc.next();


        for (int i = 0; i < 10_000; i++) {
            counter++;
            create(i);
            if (i % 10_000 == 0) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException eParam) {
                }
            }
        }
        try {
            Thread.sleep(1_200_000);
        } catch (InterruptedException eParam) {
        }

    }

    public static void create(int index) {
        if (counter % 10_000 == 0) {
            System.out.println("Counter : " + counter + " Size : " + stringEmployeeMap.size());
        }
        Employee employeeLoc = new Employee();
        employeeLoc.setWeight(100);
        employeeLoc.setAge(54);
        employeeLoc.setName(
                "name"
                + index);
        employeeLoc.setSurname("surname");
        if (stringEmployeeMap.size() < 4_000_000 && !decrease){
            if (counter % 3 == 0){
                stringEmployeeMap.put(employeeLoc.getName(), employeeLoc);
            }
        }
        if (stringEmployeeMap.size() >= 3_999_999) {
            decrease = true;
        }
        if (decrease) {
            if (counter % 5 == 0) {
                stringEmployeeMap.put(employeeLoc.getName(), employeeLoc);
            }

            if (counter % 2 == 0) {
                decCounter++;
                stringEmployeeMap.remove("name" +decCounter);
            }
            if (stringEmployeeMap.size() < 100){
                decrease = false;
            }
        }
    }
}
