package ex_29_Multithreading;

public class Lab_150_TH02 {
    static void main(String[] args) {

        Worker w = new Worker();
        w.start(); //should not run run() directly

        Worker w1 = new Worker();
        w1.start();

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


//thread by class

class Worker extends Thread
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
