import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXPath {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://facebook.com/"); // URL in the browser

        // Access by XPath
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("xpath");
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("pass");

        driver.findElement(By.xpath("//*[@name='login']")).click();

        // Access By CSS
        driver.findElement(By.cssSelector("input[id='email']")).sendKeys("css");
        driver.findElement(By.cssSelector("[name='login']")).click();
    }
}
