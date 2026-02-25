package Programs_Interview;

import java.util.Scanner;

public class P13_Palindrome_String {

    static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter your string --> ");
        String input = obj.nextLine();
        String reverse = "";

        if(input == "")
        {
            System.out.println("please enter a valid input");
        }
        else {
            for (int i = input.length() - 1; i >= 0; i--) {
                reverse = reverse + input.charAt(i);
            }

            if (input.equals(reverse)) {
                System.out.println("yes Palindrome");
            } else {
                System.out.println("not a palindrome");
            }
        }
    }
}
