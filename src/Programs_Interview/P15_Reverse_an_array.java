package Programs_Interview;

import java.util.Scanner;

//another way is to directly print the input array backwards

public class P15_Reverse_an_array {
    static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("enter the size of the array");
        int size = obj.nextInt();
        String [] arr = new String[size];
        String [] reverse = new String[size];
        for (int i = 0; i<size; i++)
        {
            System.out.println("enter element");
            arr[i] = obj.next();
            reverse[size-1-i] = arr[i];
        }

       for (int i = 0; i<size; i++)
       {
           System.out.println(reverse[i]);
       }




    }
}
