package ex_06_Ternary_Operators;

public class Lab034_Ternary_interviewQ {
    static void main(String[] args) {

        //Q1 - Find the max number using ternary

        int a = 100;
        int b = 500;
        int c = 300;

        int max = (a > b)? ((a>c)? a : c) : ((b>c)? b : c);

        System.out.println(max);

        //reverse for min
        int min = (a < b)? ((a<c)? a:c) : ((b<c)? b : c);

        System.out.println(min);

        //Q2 - find even odd

        int num  = 47;

        String is_even = (num%2 == 0)? "even" : "odd";

        System.out.println(is_even);

    }
}
