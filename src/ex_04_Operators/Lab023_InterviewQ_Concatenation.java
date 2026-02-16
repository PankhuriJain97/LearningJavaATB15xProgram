package ex_04_Operators;

public class Lab023_InterviewQ_Concatenation {

    static void main(String[] args) {
         String name = "Pankhuri";
         String l_name = "Jain";

         int a = 10;
         int b = 10;

        System.out.println(name + l_name + a + b);
        System.out.println(a + b + name + l_name);
        System.out.println(name + l_name + (a + b));
    }
}
