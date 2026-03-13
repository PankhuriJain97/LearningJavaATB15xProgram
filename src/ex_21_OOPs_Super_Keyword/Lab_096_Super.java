package ex_21_OOPs_Super_Keyword;

public class Lab_096_Super {

    static void main(String[] args) {

        Child c1 = new Child();
    }
}

class Parent
{
    private int aa;
    private String browser;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    Parent()
    {
        System.out.println("Default parent constructor");
    }

    Parent(String browser)
    {
        this.browser = browser;
        System.out.println("Parent constructor");
    }

    void openBrowser(String browserName) {
        System.out.println("Open Browser!! -> " + browserName);
    }

    void closeBrowser() {
        System.out.println("Close Browser!!");
    }

}

class Child extends Parent
{
    int a;

    Child()
    {
       // super();
        super("Chrome");
        System.out.println(super.getBrowser());
        System.out.println("Default child constructor");
        super.openBrowser("Chrome");
        super.closeBrowser();
        super.setBrowser("FireFox");
        System.out.println(super.getBrowser());

        this.a = 10;
        //this.aa = 10; not accessible
    }
}
