package ex_14_Strings;

public class Lab_063_String_Interview_Q {

    static void main(String[] args) {

        //only one string is created in SCP
        String s1 = "Hello";
        String s2 = "Hello";

        //3 strings are created in Heap area(Object area)
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        String s5 = new String("hello");

        System.out.println(s1 == s2); // true because pointing to same string
        System.out.println(s3 == s4); // false --> different strings in same area
        System.out.println(s4 == s5); // false --> different strings in same area

        System.out.println(s1 == s3); //false --> different areas

        //to check only value we need to use equals function

        System.out.println(s1.equals(s3)); //true because same value --> checks only value
        System.out.println(s3.equals(s5)); // false
        System.out.println(s3.equalsIgnoreCase(s5)); //true --> ignores case
    }
}
