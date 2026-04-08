package ex_27_Collection_Framework.CF_04_MAP;

import java.util.*;
public class Lab_144_Iteration {
    static void main(String[] args) {
        Map<String,String> student1 = new HashMap();
//        student1.put("name","Diwakar");
        student1.put("name","Pramod");
        student1.put("phone","976543210");
        student1.put("address","BLR");
        student1.put("home_address","BTM");


        System.out.println(student1);
        System.out.println(student1.getOrDefault("role_no",null));

        Map<String,String> student2 = new LinkedHashMap<>();
        student2.put("name","Diwakar");
        student2.put("phone","976543210");
        student2.put("address","DEL");
        student2.put("home_address","RG");

        System.out.println(student2);





    }
}
