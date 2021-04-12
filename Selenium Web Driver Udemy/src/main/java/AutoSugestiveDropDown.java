import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class AutoSugestiveDropDown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); // URL in the browser

        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(3000L);

        // Luam o lista de elemente cu toate tarile care incep cu ind
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

        for(WebElement option:options) {
            if(option.getText().equals("India")) {
                // click pe optiunea INDIA
                option.click();
                break; // iesim din loop
            }
        }

    }
}
