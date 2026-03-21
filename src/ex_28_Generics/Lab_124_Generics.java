package ex_28_Generics;

public class Lab_124_Generics {

    public static void main(String[] args) {

        genfunc(10, 20);
        genfunc("pankhuri", "jain");

    }


    //Here T can be anything. we can use anything to create our own generic
        static <T> T genfunc(T val1, T val2)
        {
            System.out.println(val1);
            System.out.println(val2);
            return null;
        }

}
