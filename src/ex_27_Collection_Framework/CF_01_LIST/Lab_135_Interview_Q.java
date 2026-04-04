package ex_27_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab_135_Interview_Q {

    //reverse arraylist
    static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        myList.add(1);
        myList.add(2);
        myList.add(3);

        System.out.println(myList);

        Collections.sort(myList,Collections.reverseOrder());

        System.out.println(myList);


    }
}
