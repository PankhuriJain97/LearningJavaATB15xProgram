package ex_24_Exceptions;

public class Lab_108_Exception_Handling {

    static void main(String[] args) {

        int num = 0;

        try {
            num = 100/0;
        }

        catch (Exception e)
        {
            System.out.println("Divided by zero not allowed!");
        }

    }
}
