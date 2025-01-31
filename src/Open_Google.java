import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Google {
    public void Navigate_url(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("iphone");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }
}
