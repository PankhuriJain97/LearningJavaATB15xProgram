package ex_25_Enums;

public enum URLS {

    GOOGLE("www.google.com"),
    YAHOO("www.yahoo.com"),
    AMAZON("www.amazon.com"),
    FIREFOX("www.firefox.com"),
    EDGE("www.edge.com");

    private String urls;

    URLS(String urls)
    {
        this.urls = urls;
    }

    String getUrls()
    {
        return urls;
    }

}
