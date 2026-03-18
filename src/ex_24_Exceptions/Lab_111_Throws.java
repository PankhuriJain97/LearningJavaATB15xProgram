package ex_24_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab_111_Throws {

    //Throws is used with methods

    static void main(String[] args) throws FileNotFoundException {

        inputfile();
    }

    static void inputfile() throws FileNotFoundException{

        FileInputStream input = new FileInputStream("sjbdshd.txt");
    }
}
