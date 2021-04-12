import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

    public static void main(String[] args) {

        WebDriver driver;

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("http://google.com");

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());
        // Print page source
        System.out.println(driver.getPageSource());

        driver.get("http://yahoo.com");

        // Navigate back
        driver.navigate().back();

        driver.navigate().forward();

        // close current browser
        driver.close();

        // close all the browser opened by selenium script
        driver.quit();
    }
}
