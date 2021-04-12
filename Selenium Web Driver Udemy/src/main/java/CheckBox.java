import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); // URL in the browser

        // verify if checkbox is selected - use regular expresion for css
        // Use assertion with framework TestNG
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        // System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        // SeniorCitizenDiscount
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

        // verify if checkbox is selected
        //System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        // Count number of checkbox on page
        // CSS input[type='checkbox'] => toate elementele checkbox au atributul checkbox
        // gasim toate elementele => o lista
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

        // ==================Assert Equals======================
        driver.findElement(By.id("divpaxinfo")).click();

        Thread.sleep(3000L);

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());


        for(int i = 0; i < 3; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }

        // AssertEquals
        driver.findElement(By.id("btnclosepaxoption")).click();
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult");

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

    }

}
