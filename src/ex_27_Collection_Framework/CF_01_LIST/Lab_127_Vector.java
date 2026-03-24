package ex_27_Collection_Framework.CF_01_LIST;

import java.util.*;

public class Lab_127_Vector {
    static void main(String[] args) {

        Vector vec = new Vector();

        vec.add(123);
        vec.add(124);
        vec.add("Pankhuri");
        vec.add("Jain");

        System.out.println(vec);
        System.out.println(vec.size());
        System.out.println(vec.contains("Pankhuri"));
        vec.remove(1);
        System.out.println(vec);
    }
}
