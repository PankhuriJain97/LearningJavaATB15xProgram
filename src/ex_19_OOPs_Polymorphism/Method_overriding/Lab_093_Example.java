package ex_19_OOPs_Polymorphism.Method_overriding;

public class Lab_093_Example {
    static void main(String[] args) {

        CommonToAll c1 = new CommonToAll();

        FireFox f1 = new FireFox();
        Chrome cr = new Chrome();

        //Dynamic Dispatch
        CommonToAll c2 = new Chrome();
        CommonToAll c3 = new FireFox();

        c1.browser();
        f1.browser();
        cr.browser();
        c2.browser();
        c3.browser();

    }
}

class CommonToAll{

    void browser()
    {
        System.out.println("Starting IE");
    }
}

class Chrome extends CommonToAll{

    @Override
    void browser() {
        System.out.println("starting Chrome");
    }
}

class FireFox extends CommonToAll
{
    @Override
    void browser() {
        System.out.println("starting FireFox");
    }
}