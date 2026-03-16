package ex_22_OOPs_Abstraction;

public class Lab_104_Interface_variables {
    static void main(String[] args) {
        Shivani S1 = new Shivani();
    }
}


interface Pankhuri {

    int a = 10;

    void display();
}

class Jain implements Pankhuri{

    int aa = 20;
    @Override
    public void display() {

        System.out.println(a); //can be accessed as Pankhuri.a also
        System.out.println(this.aa); //can be accessed as aa also
    }
}

class Shivani extends Jain {

    public Shivani()
    {
        display();
        //System.out.println(a);
        //System.out.println(aa);
    }
}
