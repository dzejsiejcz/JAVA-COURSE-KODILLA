package testing2.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testing2.config.WebDriverConfig;

public class EBayTestingApp {
    public static final String SEARCHFIELD = "_nkw";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.ebay.pl/");

        WebElement searchField = driver.findElement(By.name(SEARCHFIELD));
        searchField.sendKeys("Laptop");
        searchField.submit();
    }
}