package ex_11_While_Loop;

public class Lab_055_Infinite_loop {

    static void main(String[] args) {
        int i = 1;

        while(i<=10)
        {
            System.out.println(i);
            //missed updation
        }

        while(true) //always true
        {
            System.out.println("hello");
        }
    }
}
