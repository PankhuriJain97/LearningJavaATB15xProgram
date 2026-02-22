package Programs_Interview;

import java.util.Random;
import java.util.Scanner;

public class P9_Guess_the_number_game {
    static void main(String[] args) {
       // int max = 100;
        //int min = 1;
        //int num = (int) (Math.random() * ((max - min) + 1)) + min;
        Random ranobj = new Random();
        int num = ranobj.nextInt(100);

        //System.out.println(num);
        Scanner obj = new Scanner(System.in);

        for(int i = 1;; i++)// use infinite loop since we dont know how many tries will it take
        {
            System.out.println("enter your guess");
            if(obj.hasNextInt()) {

                int guess = obj.nextInt();

                if (guess == num) {
                    System.out.println("Correct! the number is " + num);
                    System.out.println("number of tries " + i);

                    break;
                } else {
                    System.out.println("incorrect guess");
                    if (guess > num) {
                        System.out.println("number is lower than " + guess);
                    } else {
                        System.out.println("number is higher than " + guess);
                    }
                }
            }

            else
            {
                System.out.println("Invalid input");
                obj.next();
            }

        }


    }



}
