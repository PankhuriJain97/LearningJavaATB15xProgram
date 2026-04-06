package ex_27_Collection_Framework.CF_02_SET;

import java.util.HashSet;
import java.util.Set;

public class Lab_136_Hashset {

    static void main(String[] args) {

        Set hs = new HashSet(); // we can give initial capacity

        hs.add("Pankhuri");
        hs.add("jain");
        hs.add("jain");//this will be ignored since this is duplicate

        hs.add("Jain"); //allowed since equals() does not ignore case
        hs.add("apple");

        System.out.println(hs);

        for(Object obj : hs)
        {
            System.out.println(obj);
        }
    }
}
