package ex_26_Wrapper_class;

public class Lab_120_Autoboxing_Unboxing {
    static void main(String[] args) {

        int num_p = 20;
        Integer num_w = num_p; //autoboxing

        System.out.println(num_w);

        Integer num_w2 = 30;
        int num_p2 = num_w2; //Unboxing // num_p2 lost its attributes and behaviour

        System.out.println(num_p2);
    }
}
