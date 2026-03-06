package Programs_Interview;

import java.util.Scanner;

public class P19_Pyramid_Pattern {
    static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("number of rows = ");
        int n = obj.nextInt();

        for (int i = 0; i < n; i++) {

            // Print leading spaces
            for (int j = 0; j < (n - i); j++) {
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
