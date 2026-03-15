package ex_22_OOPs_Abstraction;

public class Lab_101_Interface_02 {
}


interface F1{

    void money();
}

interface F2 {

    void money();
}

abstract class Mother {
    abstract void money();
}


class Son1 extends Mother implements F1,F2{

    @Override
    public void money() {
        System.out.println("complete funtion in Son");
    }
}
