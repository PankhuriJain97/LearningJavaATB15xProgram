package ex_22_OOPs_Abstraction;

public class Lab_098_Abstraction {

    static void main(String[] args) {
        Son s1 = new Son();

        s1.loan2();
        s1.loan1();
    }

}

abstract class Father{

    //concrete method --> complete
    void loan1 ()
    {
        System.out.println("this is a normal method in father");
    }

    //abstract method --> incomplete
    abstract void loan2();
}

class Son extends Father{

    @Override
    void loan2() {
        System.out.println("overriden complete method in child");
    }

}
