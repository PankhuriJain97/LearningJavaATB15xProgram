package ex_06_Ternary_Operators;

public class Lab032_Ternary_Op_02 {

    static void main(String[] args) {
        //nested ternary

        int age = 26;
        String Visa = "No";

        String All_USA = (Visa == "No")? "No, you cannot go to USA": ((age>25)?"yes,you can drink in USA" : "no, you cannot drink in USA");

        System.out.println(All_USA);
    }
}
