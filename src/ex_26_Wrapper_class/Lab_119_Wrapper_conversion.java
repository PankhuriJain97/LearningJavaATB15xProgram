package ex_26_Wrapper_class;

public class Lab_119_Wrapper_conversion {
    static void main(String[] args) {

        //Advantage of using wrapper class
        int a = 10;
        //        a. // no attribute
        //        a.len() // no method

        Integer a1 = 10;
        System.out.println(a1.compareTo(20));

        //Conversion

        String num = "200";

        //String --> wrapper conversion
        Integer numw = Integer.parseInt(num);
        Double dd = Double.parseDouble(num);
        // Double.parseDouble()
        // Float.parseFloat()
        // etc
        System.out.println(numw);
        System.out.println(dd);

        //String --> primitive conversion

        int nump = Integer.parseInt(num);
        System.out.println(nump);

        Integer aa3 = Integer.valueOf("10");
        System.out.println(aa3);
    }

}
