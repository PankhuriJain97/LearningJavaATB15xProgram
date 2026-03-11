package ex_20_OOPs_Encapsulation;

public class Lab_094_Encap_Demo {
    static void main(String[] args) {

        Login l1 = new Login("pankh", "pass123");

        System.out.println(l1.password);
        System.out.println(l1.username);
        l1.password = "newpass";
        System.out.println(l1.password);





    }
}

//not encapsulated -- not recommended
class Login{

    //instance variables
    public String username;
    public String password;

    public Login(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
}

//encapsulated
class Good_Login{

    private String username;
    private String password;



}