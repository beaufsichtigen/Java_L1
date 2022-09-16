package L4_interface;

public class BrowserFactory {
    public Browser getBrowser(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            return new MyChrome();
        } else if (browserName.equalsIgnoreCase("safari")) {
            return new MySafary();
        }
        return null;
    }
}