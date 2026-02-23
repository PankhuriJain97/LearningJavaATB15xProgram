package ex_14_Strings;

public class Lab_060_String_Immutable {
    static void main(String[] args) {
        String name = "Pankhuri";
        boolean result = name.contains("a");

        System.out.println(result);

        //Strings are immutable in nature

        name.toUpperCase(); //this will create new string
        System.out.println(name); //will still print Pankhuri because we have not assigned the value

        String new_name = name.toUpperCase();
        System.out.println(new_name);
        System.out.println(name);

        String s1 = "Hello";
        s1 = s1.concat("World");

        System.out.println(s1); // now s1 value will be newly created string HelloWorld
        //Hello is still present in memory just not being used
    }
}
