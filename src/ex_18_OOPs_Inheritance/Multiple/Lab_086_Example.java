package ex_18_OOPs_Inheritance.Multiple;

public class Lab_086_Example extends Parent1 //,Parent2 // not allowed{
{
    public static void main(String [] args)
    {
        // Creating instance of Test
        Lab_086_Example t = new Lab_086_Example();

        t.fun();
    }
}


// First Parent Class
class Parent1{

    void fun() { System.out.println("Parent1");

    }
}

// Second Parent Class
class Parent2{

    void fun() { System.out.println("Parent2");

    }
}


