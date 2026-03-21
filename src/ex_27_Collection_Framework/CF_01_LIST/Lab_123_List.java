package ex_27_Collection_Framework.CF_01_LIST;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Lab_123_List {
    static void main(String[] args) {
        List fruits = List.of("apple", "mango", "banana", "guava" , "apple", "cherry", 100);

        System.out.println(fruits);

        //List mylist = new List(); //not possible because List is an interface

        List mylist1 = new ArrayList(); //Dynamic Dispatch

        ArrayList mylist2 = new ArrayList(); // ArrayList implements List

        mylist1.add("Pankhuri");
        mylist1.add(123);

        mylist2.add("new");
        mylist2.add(200);

        System.out.println(mylist1);
        System.out.println(mylist2);
    }
}
