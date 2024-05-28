package org.training.microservice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class SetUsage {

    private Set<String> strings = ConcurrentHashMap.newKeySet();

    public static void main(String[] args) {
        Set<String> stringsLoc = new HashSet<>();
        int         number     = 1000;
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
        Set<String> stringsLoc2 = new HashSet<>();
        for (int i = 0; i < 1_000_000; i++) {
            stringsLoc2.add("osman"+i);
        }
        System.out.println("Add Delta : " + (System.currentTimeMillis() - delta));
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
