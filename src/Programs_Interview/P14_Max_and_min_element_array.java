package Programs_Interview;

import java.util.Scanner;

public class P14_Max_and_min_element_array {
    static void main(String[] args) {

        int [] arr = new int[5];

        Scanner obj = new Scanner(System.in);
        int max = 0;
        int min = 0;

        //System.out.println(arr.length);

        System.out.println("enter your number");
        for (int i = 0; i<arr.length; i++) {
            arr[i] = obj.nextInt();
            System.out.println("enter next number");
        }

        max = arr[0];

        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        min = arr[0];
        for(int item: arr)
        {
            if (item<min)
            {
                min = item;
            }
        }

        System.out.println("maximum --> "+ max);
        System.out.println("minimium --> " + min);



    }
}

