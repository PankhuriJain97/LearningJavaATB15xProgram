package ex_04_Operators;

public class Lab025_InterviewQ {
    static void main(String[] args) {

        System.out.println(!(10>20)); //true

        int salary = 12;
        boolean b = !(salary > 10 || salary < 5);
        System.out.println(b);
    }
}
