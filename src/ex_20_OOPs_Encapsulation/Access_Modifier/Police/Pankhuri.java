package ex_20_OOPs_Encapsulation.Access_Modifier.Police;

public class Pankhuri extends Cop{

    public Pankhuri(int bullet){

        super(bullet);
    }

    static void main(String[] args) {

        Cop p1 = new Cop(200);

        p1.CanIshoot();
        p1.default_mod();

    }
}
