package ex_27_Collection_Framework.CF_01_LIST;

import java.util.*;

public class Lab_129_Linked_list {
    static void main(String[] args) {

        List mylist = new LinkedList();

        mylist.add("first");
        mylist.add(2);
        mylist.add("third");
        mylist.add(true);

        System.out.println(mylist);

        // LL vs AL
        // List of WebElement
        // Scenario 1 prone to modification - LL
        // Scenario 2 prone to accessing element - AL
    }
}
