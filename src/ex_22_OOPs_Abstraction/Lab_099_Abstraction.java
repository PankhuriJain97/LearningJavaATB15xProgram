package ex_22_OOPs_Abstraction;

public class Lab_099_Abstraction {

    static void main(String[] args) {

        Alto A1 = new Alto();

        A1.Drive();
    }
}


abstract class Car {

    public abstract void startCar();
    abstract void stopCar();
}


class Alto extends Car{

    @Override
    public void startCar()
    {
        System.out.println("starting the car");
    }

    @Override
    void stopCar() {
        System.out.println("stopping the car");

    }

    void Drive()
    {
        startCar();
        System.out.println("Driving");
        stopCar();
    }
}