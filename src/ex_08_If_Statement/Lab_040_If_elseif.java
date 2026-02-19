package ex_08_If_Statement;

import java.util.Scanner;

public class Lab_040_If_elseif {
    static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int age = obj.nextInt();

        if (age > 34)
        {
            System.out.println("older than 34");
        }
        else if (age < 34)
        {
            System.out.println("younger than 34");
        }
        else
        {
            System.out.println("you are 34");
        }
    }
}
