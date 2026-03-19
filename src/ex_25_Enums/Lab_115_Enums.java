package ex_25_Enums;

public class Lab_115_Enums {
    static void main(String[] args) {

        System.out.println(Days.valueOf("MONDAY"));
        Days obj = Days.FRIDAY;

        System.out.println(obj);
        System.out.println(obj.name());
        System.out.println(obj.ordinal()); //index

        switch (obj)
        {
            case MONDAY -> System.out.println("First day of the week");
            case TUESDAY -> System.out.println("Second day of the week");
            case FRIDAY -> System.out.println("Fourth day of the week");
            default -> System.out.println("value not found");
        }


    }
}
