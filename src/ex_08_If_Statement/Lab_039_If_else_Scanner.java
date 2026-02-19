package ex_08_If_Statement;

import java.util.Scanner;

public class Lab_039_If_else_Scanner {

    static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int age = obj.nextInt();

        if(age>25)
        {
            System.out.println("you can drink");
        }
        else
            System.out.println("you cannot drink");
    }
}
