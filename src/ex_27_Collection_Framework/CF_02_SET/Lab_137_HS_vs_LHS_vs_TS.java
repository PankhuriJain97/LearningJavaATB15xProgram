package ex_27_Collection_Framework.CF_02_SET;

import java.util.*;

public class Lab_137_HS_vs_LHS_vs_TS {
    static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        //random order
        hs.add("apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon");
        hs.add(null);
        hs.add(null);
        //hs.add(123);
        System.out.println(hs);
        System.out.println(" ---------------------------");


        Set<String> lhs = new LinkedHashSet<>();
        // LinkedList mechanism to store the element,
        // order will maintain, no duplicates

        lhs.add("Dpple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("waterMelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());


        System.out.println(" ---------------------------");
        Set ts = new TreeSet();
        // Black and Red Tree mechanism to store the element.
        // Natural Sorting order is maintained.
        ts.add("Dapple");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("WaterMelon");
        ts.add("WaterMelon");
       // ts.add(null); not allowed
        //ts.add(123); different types of data types are not allowed
        System.out.println(ts);
        //ts.add(123);
        //ts.add(null);
    }
}
