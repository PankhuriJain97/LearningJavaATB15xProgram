package ex_18_OOPs_Inheritance.Hierarchical;

public class Lab_088_Hierarchical {
    static void main(String[] args) {

        Father f = new Father();
        Son1 s1 = new Son1();
        Son2 s2 = new Son2();
        Son3 s3 = new Son3();

        f.money();

        s1.s1_money();
        s1.money();

        s2.s2_money();
        s2.money();

        s3.s3_money();
        s3.money();
    }
}
