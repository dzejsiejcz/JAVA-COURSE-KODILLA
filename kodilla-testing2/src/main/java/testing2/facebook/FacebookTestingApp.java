package testing2.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import testing2.config.WebDriverConfig;

public class FacebookTestingApp {

    public static final String XPATH_COOKIES = "//*[@class=\"_42ft _4jy0 _9xo7 _4jy3 _4jy1 selected _51sy\"]";
    public static final String XPATH_NEW_ACCOUNT = "//*[@data-testid=\"open-registration-form-button\"]";
    public static final String XPATH_BIRTHDAY_DAY = "//*[@id=\"day\"]";
    public static final String XPATH_BIRTHDAY_MONTH = "//*[@id=\"month\"]";
    public static final String XPATH_BIRTHDAY_YEAR = "//*[@id=\"year\"]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath(XPATH_COOKIES)).click();
        driver.findElement(By.xpath(XPATH_NEW_ACCOUNT)).click();

        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPATH_BIRTHDAY_DAY)));

        Select selectDay = new Select(driver.findElement(By.xpath(XPATH_BIRTHDAY_DAY)));
        selectDay.selectByIndex(2);

        Select selectMonth = new Select(driver.findElement(By.xpath(XPATH_BIRTHDAY_MONTH)));
        selectMonth.selectByIndex(10);

        Select selectYear = new Select(driver.findElement(By.xpath(XPATH_BIRTHDAY_YEAR)));
        selectYear.selectByIndex(25);
    }
}
