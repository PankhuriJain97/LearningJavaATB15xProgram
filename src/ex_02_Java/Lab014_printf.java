package ex_02_Java;

public class Lab014_printf {

    static void main(String[] args) {
        System.out.println("prints in new line");
        System.out.print("prints without new line");

        System.out.printf("This is a normal text");
        System.out.println("new line");

        int a = 10;
        int b = 20;

        System.out.printf("value of a is %d",a);
        System.out.printf("multiplying a and b = %d * %d",a,b);
    }
}
