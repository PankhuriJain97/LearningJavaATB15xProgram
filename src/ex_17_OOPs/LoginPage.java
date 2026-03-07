package ex_17_OOPs;

public class LoginPage {

    public LoginPage(String email) {
        this.email = email;
    }

    String email;
    String submitButton;
    String password;
    int a;

    LoginPage(){
        System.out.println("DC");
    }

    public LoginPage(String email,String password) {
        this.email = email;
        this.password = password;
    }



    public LoginPage(String email, String password,String submitButton, int a) {
        //this.email = email;
        //this.password = password;
        this(email,password);
        this.submitButton = submitButton;
        this.a = a;
    }



}
