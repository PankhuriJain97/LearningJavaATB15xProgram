package ex_18_OOPs_Inheritance.Single;

public class Lab_084_SI {
    static void main(String[] args) {
        Son obj = new Son();
        System.out.println(obj.gold_f);
        obj.bhk3();
        obj.bhk2();

        Father f1 = new Father();
        System.out.println(f1.gold_f);

        f1.bhk2();
        //f1.bhk3();// not possible
    }
}
