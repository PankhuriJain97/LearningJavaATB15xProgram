package Programs_Interview;

import java.util.Scanner;

public class P6_Grade_Calculator {
    static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num1 = user_input("enter you first num = ");
        int num2 = user_input("enter you second num = ");

        System.out.println("What operation do you want to perform? +,*,/,-,%");

        char select = obj.next().charAt(0);
        switch (select)
        {
            case '+' -> System.out.println("sum is = " + add(num1,num2));
            case '-' -> System.out.println("sub is = " + sub(num1,num2));
            case '/' -> System.out.println("div is = " + div(num1,num2));
            case '*' -> System.out.println("mult is = " + mult(num1,num2));
            case '%' -> System.out.println("mod is = " + mod(num1,num2));
            default -> {
                System.out.println("invalid input");
            }
        }

        obj.close();
    }

    static int user_input(String prompt)
    {
        System.out.println(prompt);
        Scanner obj = new Scanner(System.in);
        if(obj.hasNextInt())
        {
            return obj.nextInt();
        }
        else
        {
            System.out.println("Input only number");
            System.exit(0);
            return 0;
        }

    }

    static int add(int num1, int num2)
    {
        return num1 +num2;
    }

    static int sub(int num1, int num2)
    {
        return num1 - num2;
    }
    static double div(int num1, int num2)
    {
        if(num2 == 0)
        {
            System.out.println("Exception");
            System.exit(0);
            return 0.0;
        }
        else {
            return (double) num1 / num2;
        }

    }

    static int mult(int num1, int num2)
    {
        return num1*num2;
    }

    static int mod(int num1, int num2)
    {
        return num1%num2;
    }

}
