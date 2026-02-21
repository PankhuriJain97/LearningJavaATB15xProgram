package Programs_Interview;

import java.util.Scanner;

public class P7_Factorial {

    static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("enter number -->");

        if(obj.hasNextInt())
        {
            int num = obj.nextInt();
            int flag = 1;
            for(int i = 1; i<=num ; i++)
            {
                flag = flag*(i);
            }

            System.out.println("factorial is " + flag);
        }

        else
        {
            System.out.println("enter valid input");
        }
    }
}
