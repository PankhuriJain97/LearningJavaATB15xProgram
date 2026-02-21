package ex_10_For_loop;

public class Lab_050_Odd_even_fromtop50 {

    static void main(String[] args) {
        //find odd even from 1 to 50

        for (int i = 1; i<=50; i++)
        {
            if(i%2 == 0)
            {
                System.out.println(i + " is even");
            }
            else
            {
                System.out.println(i + " is odd");
            }
        }
    }
}
