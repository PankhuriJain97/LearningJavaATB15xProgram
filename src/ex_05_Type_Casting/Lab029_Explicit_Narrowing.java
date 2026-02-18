package ex_05_Type_Casting;

public class Lab029_Explicit_Narrowing {

    static void main(String[] args) {
        int a = 300;

        byte num = (byte) a; // will print 44 after conversion to bits

        System.out.println(num);
    }
}
