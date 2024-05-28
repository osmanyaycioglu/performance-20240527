package org.training.microservice;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapUsage {
    public static void main(String[] args) {
        Map<String,String> mapLoc = new HashMap<>();
        Map<String,String> concurrentMap = new ConcurrentHashMap<>(1_000_000,0.9f,1_000);
        Map<String,String> mapLoc2 = new Hashtable<>();


    }
}
