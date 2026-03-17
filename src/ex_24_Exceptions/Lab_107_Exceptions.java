package ex_24_Exceptions;

import java.io.FileInputStream;

public class Lab_107_Exceptions {
    static void main(String[] args) {

        //Unchecked Exceptions
        System.out.println("start");

        //java.lang.ArrayIndexOutOfBoundsException if no input is given
        //java.lang.NumberFormatException.forInputString if input value is not integer
        int num = Integer.parseInt(args[0]);

        //java.lang.ArithmeticException / by zero if input is 0
        int out = 100/num;

        System.out.println(out);
        System.out.println("end");

        String val = null;
        //val.trim(); //java.lang.NullPointerException


        //Checked Exceptions

        //java.io.FileNotFoundException
        //FileInputStream input = new FileInputStream("C://new.txt");

    }
}
