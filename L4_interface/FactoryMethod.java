package L4_interface;

public class FactoryMethod {
    public static void main(String[] args){
    BrowserFactory myBrowserFactory = new BrowserFactory();
    Browser myBrowser = myBrowserFactory.getBrowser("chrome");
    myBrowser.start();
}}
