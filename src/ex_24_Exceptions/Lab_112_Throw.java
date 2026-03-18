package ex_24_Exceptions;

public class Lab_112_Throw {
    static void main(String[] args) throws Exception {

        divbyzero(0);
    }

    static void divbyzero(int a) throws Exception {
        if(a == 0)
        {
            throw new Exception("cannot divide by 0 !!");
        }
    }
}
