package org.training.microservice;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListUsage {

    private List<String> myMultithreadList1 = new Vector<>();
    private List<String> myMultithreadList2 = Collections.synchronizedList(new ArrayList<>());
    private List<String> myMultithreadList3 = new CopyOnWriteArrayList<>();


    public static void main(String[] args) {
        // List<String> stringsLoc = new ArrayList<>(1_100_000);
        List<String> stringsLoc = new LinkedList<>();
        int          number     = 1000;
        for (int i = 0; i < 1_000_000; i++) {
            stringsLoc.add("osman" + i);
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

        long         delta       = System.currentTimeMillis();
        //List<String> stringsLoc2 = new ArrayList<>(1_100_000);
        List<String> stringsLoc2 = new LinkedList<>();
        for (int i = 0; i < 1_000_000; i++) {
            stringsLoc2.add("osman"+i);
        }
        System.out.println("Add Delta : " + (System.currentTimeMillis() - delta));
        delta       = System.currentTimeMillis();
        for (int i = 0; i < 1_000; i++) {
            String stringLoc1 = stringsLoc2.get(i);
        }
        System.out.println("Get Delta : " + (System.currentTimeMillis() - delta));
        delta       = System.currentTimeMillis();
        for (String sLoc : stringsLoc2) {

        }
        System.out.println("Iterate Delta : " + (System.currentTimeMillis() - delta));

        delta       = System.currentTimeMillis();
        boolean osman1Loc = stringsLoc2.contains("osman999999");
        System.out.println("Contains Delta : " + (System.currentTimeMillis() - delta) + " " + osman1Loc);
        stringsLoc2.containsAll(List.of("osman1","osman2"));
        // stringsLoc2.retainAll(List.of("osman1","osman2"));
        // stringsLoc2.removeAll(List.of("osman1","osman2"));

        delta       = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            stringsLoc2.remove(0);
        }
        System.out.println("Remove Delta : " + (System.currentTimeMillis() - delta));
    }
}
