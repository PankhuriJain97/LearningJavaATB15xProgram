package ex_20_OOPs_Encapsulation.Access_Modifier.Criminal;

import ex_20_OOPs_Encapsulation.Access_Modifier.Police.Cop;

public class Pankhuri extends Cop {


    public Pankhuri(int bullet) {
        super(bullet);
    }

    static void main(String[] args) {

        Cop p2 = new Cop(500);
        Pankhuri pj = new Pankhuri(300);

        //p2.CanIshoot();
       // p2.default_mod(); // default hence
        System.out.println(p2.getBullet());

        pj.CanIshoot(); //protected method can be accessed like this only
        System.out.println(pj.getBullet());
    }
}
