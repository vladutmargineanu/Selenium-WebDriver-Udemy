import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/"); // URL in the browser

        driver.findElement(By.cssSelector("[id='username'")).sendKeys("vlad");

        driver.findElement(By.cssSelector("[id='password'")).sendKeys("vlad");

        driver.findElement(By.xpath("//*[@id='Login']")).click();
    }
}
