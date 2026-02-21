package ex_09_Switch_Statement;

import java.util.Scanner;

public class Lab_044_switch_with_char {

    static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char input = obj.next().charAt(0);

        switch(input)
        {
            case 65 :
                System.out.println("A");
                break;

            case 66 :
                System.out.println("B");
                break;

            case 'C' :
                System.out.println("C");
                break;

            default:
                System.out.println("invalid");
        }
    }
}
