package ex_17_OOPs;

public class Lab_082_Constructor_Overloading {

    static void main(String[] args) {

        Puppy p1 = new Puppy(); //this will call default constructor
        Puppy p2 = new Puppy("Bruno");
        Puppy p3 = new Puppy(10, "goldie");

        System.out.println(p2.name);
        System.out.println(p3.age + p3.breed);

    }
}

class Puppy {

    String name;
    int age;
    String breed;
    Puppy()
    {
        System.out.println("Default");
    }

    Puppy(String dogname) // overloading
    {
        this.name = dogname;
    }

    Puppy(int givenage, String gbreed)  //overloading
    {
        this.age = givenage;
        this.breed = gbreed;
    }
}
