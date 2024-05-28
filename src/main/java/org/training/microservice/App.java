package org.training.microservice;

import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    
    public static void main( String[] args )
    {
        Employee employeeLoc = new Employee();
        Employee employeeLoc2 = employeeLoc;

        Employee eLoc = new Employee();
        eLoc.setName("osman");
        eLoc.setAge(54);
        eLoc.setWeight(90);
        for (int i = 0; i < 1_000; i++) {
            int iLoc = callMe("osm" + i);
            System.out.println("Sonuç " + iLoc);
        }

//        logger.debug("yaratılan : " + employeeLoc2);
//        logger.debug("yaratılan : {} " , employeeLoc2);
//
//        if (logger.isDebugEnabled()){
//            logger.debug("[App][main]-> " + employeeLoc2);
//        }

    }

    public static int callMe(String stringParam){
        if (stringParam.length() < 6 ){
            return 0;
        }
        return stringParam.length();
    }
}
