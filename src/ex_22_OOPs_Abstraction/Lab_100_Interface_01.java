package ex_22_OOPs_Abstraction;

public class Lab_100_Interface_01 {

    static void main(String[] args) {

        Car1 c1 = new Car1();
        c1.Drive();
    }
}




class Car1 implements Brake,Engine
{

    void Drive()
    {
        startEngine();
        applyBrake();
        stopEngine();
        enginedef();
        Engine.engineStatic();
    }
    @Override
    public void startEngine() {
        System.out.println("starting engine");
    }

    @Override
    public void applyBrake() {
        System.out.println("apply brakes");
    }

    @Override
    public void stopEngine() {
        System.out.println("stopping engine");
    }
}
interface Brake
{
    void applyBrake();
}

interface Engine{

    void startEngine();

    void stopEngine();

    default void enginedef()
    {
        System.out.println("concrete default");
    }

    static void engineStatic()
    {
        System.out.println("concrete Static");
    }
}
