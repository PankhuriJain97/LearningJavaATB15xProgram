package ex_17_OOPs;

public class Lab_080_Constructor {

    static void main(String[] args) {
        Animal dog = new Animal(); // this will call the constructor of class Animal
        MySQL var = new MySQL();
    }
}

class MySQL{

    MySQL()
    {
        System.out.println("Default for MySQL");
    }

}
