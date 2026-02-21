package ex_10_For_loop;

public class Lab_051_Forloop_break_continue {
    static void main(String[] args) {
        // print numbers but exclude number 30 and break on 47

        for (int i = 1; i<=50; i++)
        {
            if(i == 30)
            {
                continue;
            }

            if(i == 47)
        {
            break;
        }

            else
        {
            System.out.println(i);
        }
        }
    }
}
