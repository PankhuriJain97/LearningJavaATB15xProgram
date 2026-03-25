package ex_27_Collection_Framework.CF_01_LIST;
import java.util.*;

public class Lab_131_LL_Example {
    // Requirement where we want to modify the collection
    // many times, then we always use the linkedlist.
    static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        String input = "Y";
        String name = null;
        List<String> mylist = new LinkedList();

        while(input.equalsIgnoreCase("Y"))
        {
            System.out.println("enter name");
            name = obj.next();
            mylist.add(name);

            System.out.println("Do you want to add more? (Y/N)");
            input = obj.next();
        }

        System.out.println(mylist);
        obj.close();

    }
}
