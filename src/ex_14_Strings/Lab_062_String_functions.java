package ex_14_Strings;

public class Lab_062_String_functions {

    static void main(String[] args) {

        String name = "pankhuri";

        System.out.println(name.length());//counts the length of string --> starts from 1

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase()); // this will not create a new string since original is
        // already in lower case
        System.out.println(name.concat("jain"));

    }

}
