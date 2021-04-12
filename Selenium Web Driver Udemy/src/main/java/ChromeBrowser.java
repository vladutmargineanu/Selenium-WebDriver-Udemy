import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

    // static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://facebook.com"); // URL in the browser

        // Locator id - email
        driver.findElement(By.id("email")).sendKeys("This is my first code");

        // Locator name - password
        driver.findElement(By.name("pass")).sendKeys("123456");

        // tag a => link text
        driver.findElement(By.linkText("Ai uitat parola?")).click();

        // Use Selector CSS
        // 1. For email
        driver.findElement(By.cssSelector("#email")).sendKeys("emailaddress");

        // 2. Use xpath for password
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123456");

        // 3. For Forgot Password?
        driver.findElement(By.xpath(".//a[contains(text(),'Forgot Password')]")).click();
        driver.findElement(By.xpath(".//div[@class='_6ltj']/a")).click();

        driver.findElement(By.cssSelector("#email")).sendKeys("vladvlad");

    }
}
