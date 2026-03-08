package ex_18_OOPs_Inheritance.Multilevel;

public class Lab_087_Multilevel {
    static void main(String[] args) {

        Son s = new Son();
        Father f = new Father();
        Grandfather g = new Grandfather();

        s.money(); // can call due to multilevel
        s.home();
        s.moneyf();
        s.homef();
        s.homes();

        f.money();
        f.home();
        f.moneyf();
        f.homef();
      //  f.homes(); //cannot access

        g.home();
        g.money();
        //g.homef();  cannot access since function is in child class

        // Dynamic Dispatch
        Grandfather g1 =  new Son();
        Father f1  = new Son();
        System.out.println();

        //Son s1 = new GrandFather();
        //Son s2 = new Father();
    }
}
