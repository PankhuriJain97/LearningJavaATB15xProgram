package ex_20_OOPs_Encapsulation.Access_Modifier.Police;

public class Cop {

    public int getBullet() {
        return bullet;
    }

    public void setBullet(int bullet) {
        this.bullet = bullet;
    }

    private int bullet;

    public Cop(int bullet)
    {
        this.bullet = bullet;
    }

    protected void CanIshoot()   //Only accessible within the folder structure
    {
        System.out.println("Yes, shoot");
    }

    void default_mod()
    {
        System.out.println("Hi Cop");
    }
}
