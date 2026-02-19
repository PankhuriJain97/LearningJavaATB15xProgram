package ex_07_Increment_Decrement_Op;

public class Lab036_Inc_Dec {
    public static void main(String[] args)
    {
        int a = 10;
        int b = ++a; //11


        System.out.println(b);
        System.out.println(a);

        int c = a++; //11
        System.out.println(c);
        System.out.println(a); //12
    }
}
