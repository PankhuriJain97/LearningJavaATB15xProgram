package ex_19_OOPs_Polymorphism.Method_overloading;

import java.sql.SQLOutput;

public class Lab_090_method_overloading {
    static void main(String[] args) {

        Calculator c1 = new Calculator();

        System.out.println(c1.add(5,10));
        System.out.println(c1.add(5,10,15));
        System.out.println(c1.add(10.00,20.5));
        System.out.println(c1.add("pankhuri", "jain"));

    }
}

class Calculator{

    int add(int a, int b)
    {
        return a+b;
    }

    int add(int a, int b, int c)
    {
        return a+b+c;
    }

    double add(double a, double b)
    {
        return a+b;
    }

    String add(String a, String b)
    {
        return a + b;
    }
}
