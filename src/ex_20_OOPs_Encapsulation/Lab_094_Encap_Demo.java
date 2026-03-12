package ex_20_OOPs_Encapsulation;

public class Lab_094_Encap_Demo {
    static void main(String[] args) {

        Login l1 = new Login("pankh", "pass123");

        System.out.println(l1.password);
        System.out.println(l1.username);
        l1.password = "newpass";
        System.out.println(l1.password);

        Good_Login l2 = new Good_Login("pankh2", "pass2");

        System.out.println(l2.getPassword());
        System.out.println(l2.getUsername());

        l2.setPassword("newpass2");
        l2.setUsername("pankh3");

        System.out.println(l2.getPassword());
        System.out.println(l2.getUsername());



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

    public Good_Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

 public void setUsername(String username)
 {
     this.username = username;
 }

 public void setPassword(String password)
 {
     this.password = password;
 }

 public String getUsername()
 {
     return username;
 }

 public  String getPassword()
 {
     return password;
 }


}