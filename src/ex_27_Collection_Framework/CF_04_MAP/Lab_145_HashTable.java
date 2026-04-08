package ex_27_Collection_Framework.CF_04_MAP;

import java.util.Hashtable;
import java.util.*;

public class Lab_145_HashTable {
    static void main(String[] args) {
        // Null values and keys are not allowed in Hashtable
        // Hashtable K,V - Synchronised, Slow and Legacy Class - Thread Safe
        // T1, T2 - they will use one by one.

        Map HM = new Hashtable();

        //HM.put(null,null); //null not allowed
        //HM.put("id1", null); //not allowed

        HM.put("id1", 1);
        HM.put("id2", 2);

        System.out.println(HM);

    }
}
