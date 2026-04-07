package ex_27_Collection_Framework.CF_04_MAP;

import java.util.HashMap;
import java.util.*;

public class Lab_142_Map_02 {
    static void main(String[] args) {

        Map m1 = new HashMap();
        Map m2 = new LinkedHashMap();
        Map m3 = new TreeMap();

        Map m4 = new Hashtable();


        //to create with specific data type
        Map<String,Integer> marks = new HashMap<>();

        marks.put("Pankhuri", 100);
        marks.put("Abc", 90);
        marks.put("Shivani", 85);
        marks.put("Pankh", 100);
        marks.put("xyz", 15);

        System.out.println(marks); //random order
    }
}
