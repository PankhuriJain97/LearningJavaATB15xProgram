package Programs_Interview;

import java.util.Scanner;

public class P16_Sum_of_an_array {
    static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter array size");
        int size = obj.nextInt();
        int[] arr = new int[size];
        int sum = 0;

        for (int i =0 ; i<size; i++)
        {
            System.out.println("Enter number");
            arr[i] = obj.nextInt();
            sum = sum + arr[i];

        }

        System.out.println("sum = " + sum);


    }
}
