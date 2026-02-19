package ex_07_Increment_Decrement_Op;

public class Lab037_Inc_dec_02 {
    static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a); // 10 + 11 --> 21

        int b = 10;
        System.out.println(b++ + ++b); // 10 +12 --> 22

        int c = 10;
        System.out.println(++c + ++c); // 11 + 12 --> 23

        System.out.println(--c - c--); // 11 - 11 -->0
    }
}
