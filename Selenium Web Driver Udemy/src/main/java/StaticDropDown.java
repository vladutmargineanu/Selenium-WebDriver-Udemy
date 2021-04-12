import jdk.swing.interop.SwingInterOpUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); // URL in the browser

        // dropdown with select tag
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        Select dropdown = new Select(staticDropdown);

        // Mai intai selectam, apoi luam prima optiune selectata si luam textul
        // Select by index
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());

        // select by text
        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());

        // select by value
        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());
    }
}
