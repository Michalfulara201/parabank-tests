import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests {

    WebDriver driver = new ChromeDriver();

    public void waitForPageLoad(WebDriver webDriver) {
        Wait<WebDriver> wait = new WebDriverWait(webDriver, 30);
        wait.until(webDriver1 -> (JavascriptExecutor) webDriver).executeScript("return document.readyState");
    }

    @Test(priority = 1)

    public void shouldNotLogin() {
        String UrlBase = "http://parabank.parasoft.com/parabank/index.htm";
        driver.get(UrlBase);
        waitForPageLoad(driver);

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("xxx");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("xxx");
        driver.findElement(By.xpath("//input[@type='submit']")).sendKeys(Keys.ENTER);
        Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='Error!']")).isDisplayed());
    }
}