package Programs_Interview;

import java.util.Scanner;

public class P18_Star_Patterns {

    static void main(String[] args) {

        //*
        //* *
        //* * *
        //n

        Scanner obj = new Scanner(System.in);

        int n = 0;
        System.out.println("enter the number of rows ");
        n = obj.nextInt();

        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<=i; j++)
            {
                System.out.print("* ");
            }

            System.out.println(" ");
        }

        //Reverse of above
        //     *
        //   * *
        // * * *

        System.out.println( " ");

        for (int i = 0; i<n; i++)
        {
            for(int j = n; j>=0; j--)
            {
                if(j>i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }

            }
            System.out.println(" ");
        }

//        for(int i = 0; i < n; i++)
//        {
//            for (int j = 0; j<=n-1-i; j++)
//            {
//                System.out.print(" ");
//            }
//
//            for (int k = 0; k<=i; k++)
//            {
//                System.out.print("*");
//            }
//
//            System.out.println(" ");
//        }

        for (int i = 0; i < n; i++) {

            // Print leading spaces
            for (int j = 0; j < 2*(n - i); j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
