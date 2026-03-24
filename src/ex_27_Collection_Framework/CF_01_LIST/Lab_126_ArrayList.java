package ex_27_Collection_Framework.CF_01_LIST;

import java.util.*;

public class Lab_126_ArrayList {
    static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();

        List mylist1 = new ArrayList(5);//allowed with initial capacity

        myList.add(123);
        myList.add(100);
        myList.add(125);
        myList.add(126);
        myList.add(11);
        myList.add(128);
        myList.add(145);
        myList.add(130);
        myList.add(400);
        myList.add(123);

        System.out.println(myList.size());
        System.out.println(myList.isEmpty());
        System.out.println(myList.contains(128));
        System.out.println(myList.contains("128"));
        System.out.println(myList.indexOf(123));
        System.out.println(myList.lastIndexOf(123));

        System.out.println(myList);
        Collections.sort(myList);
        System.out.println("---------------------------");
        System.out.println(myList);

        for(int i = 0; i<myList.size(); i++)
        {
            System.out.println(myList.get(i));
        }

        System.out.println("-----------------------------");

        for (Object obj : myList)
        {
            System.out.println(obj);
        }

        System.out.println("-----------");

        Iterator obj = myList.iterator();
        while(obj.hasNext())
        {
            System.out.println(obj.next());
        }





    }
}
