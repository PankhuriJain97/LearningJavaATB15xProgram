package ex_17_OOPs;

public class Lab_083_Constructor_Chaining {
    static void main(String[] args) {

        Doggo p1 = new Doggo(); //this will call default constructor
        Doggo p2 = new Doggo("Bruno");
        Doggo p3 = new Doggo(10, "goldie");

        System.out.println(p2.name);
        System.out.println(p3.age + p3.breed);
        System.out.println(p3.name);

    }
}

class Doggo {

    String name;
    int age;
    String breed;
    Doggo()
    {
        System.out.println("Default");
    }

    Doggo(String dogname) // overloading
    {
        this.name = dogname;
    }

    Doggo(int givenage, String gbreed)  //overloading
    {
        this("shepherd"); //constructor chaining
        this.age = givenage;
        this.breed = gbreed;

    }
}

