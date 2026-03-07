package ex_17_OOPs;

public class Lab_081_Param_Constructor {
    static void main(String[] args) {

        Cat c1 = new Cat();
        Cat c2 = new Cat("Tom");
        Cat c3 = new Cat("Tommy");
        Cat c4 = new Cat("Billu");

        System.out.println(c2.name);
        System.out.println(c3.name);

    }
}

class Cat{

    String name;

    Cat()
    {
        System.out.println("Default Constructor");
    }

    Cat(String given_name)   //Parameterized constructor
    {
        this.name = given_name;
        System.out.println(this.name);
    }

    void print()
    {
        System.out.println(this.name);
    }


}
