package ex_24_Exceptions;

import java.util.Scanner;

public class Lab_110_Try_Catch_Finally {

    /*
    code in the finally block will always execute irrespective of
    whether the try catch block catches an exception or not
    */

    static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        int num = obj.nextInt();

        int div = 0;

        try{
            div = 100/num;
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("this will always execute");
            obj.close();
        }

        System.out.println(div);
    }
}
