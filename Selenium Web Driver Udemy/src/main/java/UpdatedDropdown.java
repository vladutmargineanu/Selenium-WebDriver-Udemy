import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); // URL in the browser

        driver.findElement(By.id("divpaxinfo")).click();

        Thread.sleep(2000L);

        int countClick = 0;

        while (countClick < 3) {
            driver.findElement(By.id("hrefIncAdt")).click();
            countClick++;
        }

        driver.findElement(By.id("btnclosepaxoption")).click();

        // Print text after selected 4 adults to verify
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

    }
}
