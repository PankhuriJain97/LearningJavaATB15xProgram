package ex_15_String_Builder_and_Buffer_funcs;

public class Lab_067_String_Builder {
    static void main(String[] args) {

        StringBuilder name = new StringBuilder("Pankhuri");

        System.out.println(name);

        System.out.println(name.reverse()); //this will change the value of name since strings are mutable.
        System.out.println(name); // this will print reversed value.We dont need to reassign

        System.out.println(name.append(" Jain")); // reversed + appended String

    }
}
