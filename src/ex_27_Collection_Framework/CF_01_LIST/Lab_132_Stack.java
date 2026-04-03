package ex_27_Collection_Framework.CF_01_LIST;

import java.util.Stack;

public class Lab_132_Stack {
    static void main(String[] args) {

        Stack st1 = new Stack();

        st1.add("Pankhuri");
        st1.add("jain");
        st1.add("shivani");
        st1.add("Ritu");
        st1.add("bruno");

        System.out.println(st1);
        System.out.println(st1.size());
        System.out.println(st1.peek()); //peek looks at the first element in the stack without removing it
        System.out.println(st1.pop()); //it will remove the top element
        System.out.println(st1);
        st1.push("new"); //pushes the element into top of the stack
        System.out.println(st1);
        System.out.println(st1.search("jain"));
        System.out.println(st1.search("new"));

    }

}
