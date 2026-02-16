package ex_04_Operators;

public class Lab026_Instance_of_Operator {
    static void main(String[] args) {
        String str = "Hello";
        System.out.println(str instanceof String);

        Object obj = new Integer(10);
        System.out.println(obj instanceof Integer);
        System.out.println(obj instanceof String);
    }
}
