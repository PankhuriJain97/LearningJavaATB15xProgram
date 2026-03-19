package ex_25_Enums;

public class Lab_118_Real_ex_automation {
    static void main(String[] args) {
        System.out.println(Locators.page_input_email.getLocator());

    }
}



enum Locators {
    page_input_email("//*[@id=\"login-username\"]"),
    page_input_password("//*[@id=\"login-password\"]"),
    page_button("#btn");

    private final String locator;
    Locators(String locator){
        this.locator = locator;
    }

    String getLocator(){
        return this.locator;
    }
}