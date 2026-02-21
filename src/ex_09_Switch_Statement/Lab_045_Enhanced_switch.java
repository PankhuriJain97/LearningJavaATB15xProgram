package ex_09_Switch_Statement;

public class Lab_045_Enhanced_switch {
    static void main(String[] args) {

        int num = 3 ;

        switch(num)
        {
            case 1 -> System.out.println("mon");
            case 2,3 -> System.out.println("tues");//multiple conditions, works if any one condition matches
            default -> System.out.println("invalid");
        }
    }
}
