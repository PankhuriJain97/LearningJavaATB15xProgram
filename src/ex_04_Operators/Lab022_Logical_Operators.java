package ex_04_Operators;

public class Lab022_Logical_Operators {
    static void main(String[] args) {
        boolean a = true;

        System.out.println(a);
        System.out.println(!a); //will print false

        System.out.println(!!a); //true

        boolean b = true || false;
        System.out.println(b); //true

        boolean c = false && true;
        System.out.println(c); //false
    }
}
