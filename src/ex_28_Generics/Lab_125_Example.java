package ex_28_Generics;

import java.util.ArrayList;
import java.util.List;

public class Lab_125_Example {
    static void main(String[] args) {

        List<String> mylist = new ArrayList<>();

        mylist.add("Pankhuri");
        //mylist.add(123); // this is now not allowed

        String s1 = mylist.get(0); // removes need of tycasting

        System.out.println(mylist);
        System.out.println(s1);
    }
}
