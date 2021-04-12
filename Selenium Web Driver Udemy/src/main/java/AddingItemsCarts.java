import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class AddingItemsCarts {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/"); //URL in the browser

        // Expected products - array of strings
        String[] productArray = {"Cucumber", "Brocolli", "Beetroot"};

        // Console Chrome $x("//button[text()='ADD TO CART']") XPATH
        // CSS $("h4.product-name")
        //<h4 class=​"product-name">​Brocolli - 1 Kg​</h4>​

        // sleep
        Thread.sleep(3000);

        // o lista cu toate elementele ccu css ul respectiv
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        // Count the vegetables added in cart
        int countVegetables = 0;
        for(int i =0; i < products.size(); i++ ) {

            // Beetroot - 1 Kg => splitt is : Beetroot, 1 Kgn (two parts)
            // Formmating name product to get actual vegetabele name
            String[] nameProduct = products.get(i).getText().split("-");

            // Remove all the spaces
            String formattedProductName = nameProduct[0].trim();

            // convert array into arraylist for easy search
            List<String> productList = Arrays.asList(productArray);

            // check name extracted from Web Page is present in productList we need to add to cart
            if(productList.contains(formattedProductName)) {
                // click on add to cart
                // OBS Folosim un xpath static, care nu se modifica dupa click
                // daca e dinamic, indexii se reseteaza pt ca se schimba elementul
                // de ex:  // Console Chrome $x("//button[text()='ADD TO CART']") XPATH este dinamic
                // //div[@class='product-action']/button" - este static
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

                // We need 3 vegetables, then stop!!
                countVegetables++;
                // daca am gasit toate 3 => iesim din for
                if (countVegetables == 3) {
                    break;
                }
            }
        }
    }
}
