package ex_09_Switch_Statement;

import java.util.Locale;
import java.util.Scanner;

public class Lab_043_Real_world_automation {

    static void main(String[] args) {
        //web automation
        //to select the choice of browser for testing

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter choice of browser -- chrome/firefox/edge");

        if(obj.hasNext()) {
            String browser = obj.next();
            browser = browser.toLowerCase();
            switch (browser)
            {
                case "chrome" :
                    System.out.println("automate in chrome");
                    break;

                case "firefox" :
                    System.out.println("automate in firefox");
                    break;

                case "edge" :
                    System.out.println("automate in edge");
                    break;

                default:
                    System.out.println("browser not found");
            }
        }

        else {
            System.out.println("input value is wrong");
        }

    }
}
