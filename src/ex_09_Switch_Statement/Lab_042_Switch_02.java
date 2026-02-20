package ex_09_Switch_Statement;

import java.util.Scanner;

public class Lab_042_Switch_02 {
    static void main(String[] args) {

        // Q - what is the output if user enters 3
        // program ends without any error
        Scanner obj = new Scanner(System.in);

        int num = obj.nextInt();

        switch (num)
        {
            case 1 :
                System.out.println("mon");
                break;

            case 2 :
                System.out.println("Tues");
                break;
        }
    }
}
