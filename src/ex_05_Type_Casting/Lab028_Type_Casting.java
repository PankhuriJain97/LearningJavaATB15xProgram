package ex_05_Type_Casting;

public class Lab028_Type_Casting {

    static void main(String[] args) {

        //Widening
        byte b = 10;
        int a = b; //valid syntax -- Implicit -- widening
        System.out.println(a);

        int c = (int)b; //valid but unnecessary -- Explicit --widening
        System.out.println(c);

        //Narrowing
        int num = 20;
       // byte num2 = num; // this is invalid -- implicit narrowing

        byte num2 = (byte)num; // explicit allowed
        System.out.println(num2);



    }
}
