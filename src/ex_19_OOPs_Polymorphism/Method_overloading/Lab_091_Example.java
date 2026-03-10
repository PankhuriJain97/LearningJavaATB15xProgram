package ex_19_OOPs_Polymorphism.Method_overloading;

public class Lab_091_Example {
    static void main(String[] args) {
        WebAutomation t1 = new WebAutomation();
        t1.openBrowser();
        t1.openBrowser("firefox");
    }
}


class WebAutomation{

    void openBrowser(){
        System.out.println("Default browser!!");
    }

    void openBrowser(String browser){
        System.out.println("Starting browser!!" +  browser);
    }

}
