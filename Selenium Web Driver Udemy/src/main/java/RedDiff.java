import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedDiff {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rediff.com/"); // URL in the browser

        // Regex Expression
        driver.findElement(By.cssSelector("a[title*='Sign in'")).click();

        // driver.findElement(By.xpath("//*[contains(@id,'login')]")).sendKeys("vlad"); // error
        driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("vlad");
        driver.findElement(By.cssSelector("input#password")).sendKeys("pass");

        driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
    }
}
