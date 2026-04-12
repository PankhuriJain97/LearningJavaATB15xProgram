package ex_29_Multithreading;

public class Lab_151_TH03 {
    static void main(String[] args) {
        Runnable w = new Worker01();
        Thread t1 = new Thread(w);
        t1.start(); //should not run run() directly

        Runnable w1 = new Worker01();
        Thread t2 = new Thread(w1);
        t2.setPriority(7);
        t2.start(); //should not run run() directly


        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + "-" + Thread.currentThread().getPriority());
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}



//Thread by Runnable interface
class Worker01 implements Runnable
{
    @Override
    public void run()
    {
        for (int i=0; i<5; i++)
        {
            try{
                System.out.println(Thread.currentThread().getName() + "-" + Thread.currentThread().getPriority());
                Thread.sleep(2000);
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
