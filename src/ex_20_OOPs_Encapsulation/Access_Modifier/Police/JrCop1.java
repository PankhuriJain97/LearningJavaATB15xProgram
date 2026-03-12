package ex_20_OOPs_Encapsulation.Access_Modifier.Police;

public class JrCop1 {
    static void main(String[] args) {
        Cop jr1 = new Cop(100);

        jr1.CanIshoot();
        jr1.default_mod();

        System.out.println(jr1.getBullet());
    }
}
