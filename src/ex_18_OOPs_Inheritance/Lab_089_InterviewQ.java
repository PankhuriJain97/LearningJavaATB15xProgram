package ex_18_OOPs_Inheritance;

public class Lab_089_InterviewQ {
    public static void main(String[] args) {
        Animal a = new Dog2();
        Animal b = new Animal();
        b.sound();
        a.sound();
    }
}


class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog2 extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
