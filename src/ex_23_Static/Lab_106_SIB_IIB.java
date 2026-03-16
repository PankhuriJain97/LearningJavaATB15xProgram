package ex_23_Static;

public class Lab_106_SIB_IIB {
    public static void main(String[] args) {
        A a = new A();
    }
}


class A{
    // SIB
    static {
        System.out.println("Called only Once when Class is loaded");
        System.out.println("You can write a code reading a excel, file, , database file");
    }
    //IIB
    {
        System.out.println("IIB");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation

    }

    static int a = 10;

    static void m1() {
        System.out.println("static function");
    }
}
