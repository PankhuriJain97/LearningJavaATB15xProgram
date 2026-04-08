package ex_27_Collection_Framework.CF_04_MAP;

import java.util.*;

public class Lab_143_HM_vs_LHM_vs_TM {
    public static void main(String[] args) {

        //random order
        Map m1 = new HashMap();

        // Map is key - value
        // name : pramod,
        // rollno : 1
        // phone : 9876543210
        m1.put("name", "pramod");
        m1.put("rollno", 1);
        m1.put("phone", 987654321);
        System.out.println(m1);


        //order is insertion order
        Map m2 = new LinkedHashMap();
        m2.put("name","pramod");
        m2.put("rollno",1);
        m2.put("phone",987654321);
        System.out.println(m2);



        //natural ordering - by keys
        Map m3 = new TreeMap();
        // Map is key - value
        // name : pramod,
        // rollno : 1
        // phone : 9876543210
        m3.put("name","pramod");
        m3.put("rollno",1);
        m3.put("phone",987654321);
        System.out.println(m3);


    }
}
