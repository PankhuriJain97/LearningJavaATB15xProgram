package ex_24_Exceptions;

public class Lab_109_Try_Catch_Multiple {
    static void main(String[] args) {
        System.out.println("1");
        try {
            int a = 10 / 0;
        }catch (ArithmeticException e){
            System.out.println("ARE YOU FOOL");
        }catch (Exception e){
            System.out.println("Are you Fool Too"); //this will not execute because above exception is arithmetic and handled above
        }
        System.out.println("2");


        //better way for multiple exceptions -
        String s1 = null;
        try {
            s1.trim();
            int a = 10/0;
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Null or Arth Error");
        }
        System.out.println("End");
    }
}
