import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalendarUI {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); // URL in the browser

        driver.findElement(By.id("divpaxinfo")).click();

        /*
        * Method Purpose
        * isEnabled() This method checks if an element is enabled. Returns true if enabled,
        * else false for disabled.
        * isSelected() This method checks if element is selected (radio button, checkbox, and
        * so on). It returns true if selected, else false for deselected
        * isDisplayed() This method checks if element is displayed.
        * Inthis recipe, we will use some of these methods to check the status and handle
        * possible errors.
        */

        System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        // Se verifica daca data de intoarcere este enabled => opacity se schimba
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
        {
            System.out.println("its enabled");

            Assert.assertTrue(true);
        }
        else
        {
            Assert.assertTrue(false);
        }

    }

}
