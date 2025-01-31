public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Habiba\\SeleniumProject\\Drivers\\chromedriver.exe");
        Open_Google Url = new Open_Google();
        Url.Navigate_url();


    }
}