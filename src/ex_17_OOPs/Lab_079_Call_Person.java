package ex_17_OOPs;

public class Lab_079_Call_Person {
    static void main(String[] args) {

        Person p1 = new Person();

        p1.name = "Pankhuri";

        Person p2 = new Person();

        p2.name = "Deepak";

        Person p3; //not an object //pointing to null area

        new Person(); //This is an object but with no reference
    }
}
