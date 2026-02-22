package ex_13_Functions;

public class Lab_058_User_Defined {

    static void main(String[] args) {
        func_1(); //call

        int num = func_2();
        System.out.println(num);

        func_3(3,4);

        int sum = func_4(3,4);
        System.out.println(sum);
    }


    //without return type and without parameters
    static void func_1()
    {
        System.out.println("first function");
    }

    //with return type and without parameters
    static int func_2()
    {
        System.out.println("second function");
        return 10;
    }

    //without return type but with paramters (most common)
    static void func_3(int p1, int p2)
    {
        System.out.println("third function " + p1 + ", " + p2 );
    }

    //with return type with paramters

    static int func_4(int num1, int num2)
    {
        System.out.println("fourth function");
        return num1 + num2;
    }
}
