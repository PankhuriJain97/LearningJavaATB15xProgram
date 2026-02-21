package ex_10_For_loop;

public class Lab_052_Print_only_odd_using_continue {

    static void main(String[] args) {

        for(int i = 0; i <= 50; i++)
        {
            if(i%2 == 0) // use != for printing only even
            {
                continue;
            }

            System.out.println(i);
        }
    }
}
