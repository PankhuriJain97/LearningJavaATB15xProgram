package ex_09_Switch_Statement;

import java.util.Scanner;

public class Lab_041_Switch_01 {

    //print day according to the input provided by user (1-7) else invalid

    static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        if(obj.hasNextInt())
        {
            int num = obj.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Monday");
                    break;

                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("sunday");
                    break;
                default:
                    System.out.println("invalid entry");
            }
        }

        else {
            System.out.println("not an int");
        }

    }
}
