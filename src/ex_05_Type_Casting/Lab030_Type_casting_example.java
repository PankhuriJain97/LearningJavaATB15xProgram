package ex_05_Type_Casting;

public class Lab030_Type_casting_example {
    static void main(String[] args) {
        int salary = 3000;
        float tax = 20.25f;

        int total = salary + (int)tax; //narrowing - explicit
        float total2 = salary + tax; //widening -implicit

        System.out.println(total);
        System.out.println(total2);
    }
}
