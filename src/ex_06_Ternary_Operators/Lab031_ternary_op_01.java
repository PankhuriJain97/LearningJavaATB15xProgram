package ex_06_Ternary_Operators;

public class Lab031_ternary_op_01 {
    static void main(String[] args) {

        int my_age = 28;

        String all_drink = (my_age > 25) ? "yes" : "No";

        System.out.println(all_drink);

        boolean result = (my_age > 10 ) ? true : false;

        System.out.println(result);
    }
}
