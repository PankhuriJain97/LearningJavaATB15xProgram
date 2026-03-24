package ex_27_Collection_Framework.CF_01_LIST;

import java.util.*;

public class Lab_128_Nested_ArrayList {
    static void main(String[] args) {

        List l1 = new ArrayList();
        List l2 = new ArrayList();
        List l3 = new ArrayList();

        l1.add("apple");
        l1.add("mango");
        l1.add("banana");

        l2.add("red");
        l2.add("orange");
        l2.add("black");

        l3.add(l1);
        l3.add(l2);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

        System.out.println(l3.get(1));


    }
}
