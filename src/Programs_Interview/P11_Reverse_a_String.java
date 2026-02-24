package Programs_Interview;

import java.util.Scanner;

public class P11_Reverse_a_String {

    static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter your string");
        String input = obj.next();

        String reverse = ""; //if u initialize with null , null will also get printed

        for (int i = input.length()-1; i>=0; i--)
        {
            //System.out.print(input.charAt(i)); to directly print the chars without using another variable

            reverse = reverse + input.charAt(i);
        }

        System.out.println(reverse);
    }
}
