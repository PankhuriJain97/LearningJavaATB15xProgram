package ex_25_Enums;

public class Lab_116_Enum_fields_methods {
    static void main(String[] args) {
        System.out.println(URLS.GOOGLE.getUrls());
        System.out.println(URLS.EDGE.getUrls());

        if(URLS.GOOGLE.getUrls().equalsIgnoreCase("WWW.GOOGLE.COM"))
        {
            System.out.println("start testing");
        }
        else
        {
            System.out.println("browser not matching");
        }
    }
}
