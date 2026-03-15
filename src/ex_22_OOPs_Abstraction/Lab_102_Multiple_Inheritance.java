package ex_22_OOPs_Abstraction;

public class Lab_102_Multiple_Inheritance {
}
class Child1 implements Father1,Father2{

    @Override
    public void money() {
        System.out.println("Child Money!");
    }
}

interface Father1{
    final int a = 10;
    void money();
}
interface Father2{
    void money();
}