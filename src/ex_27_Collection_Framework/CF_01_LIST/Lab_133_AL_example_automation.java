package ex_27_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab_133_AL_example_automation {
    static void main(String[] args) {

        APIAutomation google = new APIAutomation("google", "www.google.com");
        APIAutomation yahoo = new APIAutomation("yahoo", "www.yahoo.com");
        APIAutomation facebook = new APIAutomation("facebook", "www.facebook.com");

        List<APIAutomation> mylist = new ArrayList<>();

        mylist.add(google);
        mylist.add(yahoo);
        mylist.add(facebook);

        google.printdetails();
        yahoo.printdetails();
        facebook.printdetails();



    }
}

class APIAutomation{

    private String appName;
    private String url;

    public APIAutomation(String appName, String url)
    {
        this.appName = appName;
        this.url = url;
    }

    public String getAppName()
    {
        return appName;
    }

    public void setAppName(String appName)
    {
        this.appName = appName;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public void printdetails()
    {
        System.out.println("Information :- " + this.appName + " and " + this.url);
    }

}
