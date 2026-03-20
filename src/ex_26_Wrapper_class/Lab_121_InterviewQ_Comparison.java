package ex_26_Wrapper_class;

public class Lab_121_InterviewQ_Comparison {
    static void main(String[] args) {

        Integer num1 = 127;
        Integer num2 = 127;

        System.out.println(num1 == num2); //true --> cached

        Integer num3 = 128;
        Integer num4 = 128;

        System.out.println(num3 == num4);  //false --> not cached

        //always use below in case of wrapper classes

        System.out.println(num3.equals(num4));

        Integer value = null;
        int value_new = value; //null pointer exception

    }

}
