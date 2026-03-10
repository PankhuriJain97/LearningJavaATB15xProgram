package ex_19_OOPs_Polymorphism.Method_overriding;

public class Lab_092_method_overriding {
    static void main(String[] args) {

        Father f1 = new Father();
        Father f2 = new Son(); //Dynamic Dispatch

        Son s1 = new Son();

        f1.home();
        f2.home();

        s1.home();

    }
}

class Father{

    void home()
    {
        System.out.println("father's home");
    }
}

class Son extends Father{
    @Override
    void home() {
        System.out.println("Son's home");
    }
}
