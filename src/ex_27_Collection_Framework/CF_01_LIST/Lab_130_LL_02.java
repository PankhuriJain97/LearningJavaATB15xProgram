package ex_27_Collection_Framework.CF_01_LIST;

import java.util.*;

public class Lab_130_LL_02 {
    static void main(String[] args) {

        LinkedList<String> mylist = new LinkedList<>();

        // Adding elements
        mylist.add("Apple");
        mylist.add("Banana");
        mylist.add("Cherry");
        mylist.addFirst("Mango");  // adds at beginning
        mylist.addLast("Grapes"); // adds at end

        System.out.println(mylist);

        System.out.println(mylist.getFirst());
        System.out.println(mylist.getLast());
        System.out.println(mylist.get(2));
        System.out.println(mylist.remove(1));

        System.out.println(mylist);
        System.out.println(mylist.size());
        System.out.println(mylist.isEmpty());
        System.out.println(mylist.contains("Grapes"));
    }
}
