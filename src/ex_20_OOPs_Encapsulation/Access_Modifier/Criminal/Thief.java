package ex_20_OOPs_Encapsulation.Access_Modifier.Criminal;

import ex_20_OOPs_Encapsulation.Access_Modifier.Police.Cop;

public class Thief {

    static void main(String[] args) {
        Cop thief = new Cop(50);

        System.out.println(thief.getBullet());
        //thief.CanIshoot(); cannot access

        //thief.default_mod(); cannot access
    }
}
