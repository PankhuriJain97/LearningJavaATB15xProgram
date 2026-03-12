package ex_20_OOPs_Encapsulation.Access_Modifier.Police;

public class JrCop2 {
    static void main(String[] args) {
        Cop j2 = new Cop(100);
        j2.CanIshoot();
        j2.default_mod();

        System.out.println(j2.getBullet());
    }
}
