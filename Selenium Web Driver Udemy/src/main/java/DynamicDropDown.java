import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com"); // URL in the browser

        //By xpath
        // driver.findElement(By.xpath("//a[value='MAA']"));
        // driver.findElement(By.xpath("//a[value='BLR']"));

        // select from area and then select the country (identify by id => is unique)
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        // select the country by xpath

        /*driver.findElement(By.xpath("//a[@value='BLR']")).click();

        Thread.sleep(2000L);

        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();*/

        // Fara index - parent child relationship
        // Multiple instance with the same id and we dont want to use index

        driver.findElement(By.xpath("//a[@value='BLR']")).click();

        Thread.sleep(2000L);

        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
    }

}
