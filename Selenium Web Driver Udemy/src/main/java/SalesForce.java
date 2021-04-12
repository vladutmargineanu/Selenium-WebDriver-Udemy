import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://login.salesforce.com/"); // URL in the browser

        // Locator id - email
        driver.findElement(By.id("username")).sendKeys("Hello");

        // Locator name - password
        driver.findElement(By.name("pw")).sendKeys("123456");

        // class name - invalid => error (compound classes name not allowed)
        // driver.findElement(By.className("button r4 wide primary")).click();

        // Expand double quotes - generate Xpath for log in button
         driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();

         // For access error login
        System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
    }
}
