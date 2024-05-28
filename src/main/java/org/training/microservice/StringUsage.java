package org.training.microservice;

import java.util.function.Supplier;

public class StringUsage {

    public static void main(String[] args) {
        int a = 100;
        String deneme = "yay";

        if (deneme == new String("yay")){
            System.out.println("Heyooo eşit.");
        }

        String stringLoc = "osman" + a + " devam " + deneme + " son";
        stringLoc += "test";

        String stringLoc1 = "for loop";
        for (int i = 0; i < 1_000; i++) {
            stringLoc1 += " index : " + i;

        }
        int number  = 11;
        Supplier<String> supplierLoc = () -> "index : " + number;
        StringBuilder builderLoc = new StringBuilder(100_000);
        for (int i = 0; i < 1_000; i++) {
            builderLoc.append("index : ").append(i);
        }

    }

    public static void method(int test,Supplier<String> supplierParam){
        if (test > 100){
            String stringLoc = supplierParam.get();
        }

    }
}
