import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class LoginTests {

    WebDriver driver = new ChromeDriver();
    public String UrlBase = "http://parabank.parasoft.com/parabank/index.htm";



    public void waitForPageLoad(WebDriver webDriver) {
        Wait<WebDriver> wait = new WebDriverWait(webDriver, 30);
        wait.until(webDriver1 -> (JavascriptExecutor) webDriver).executeScript("return document.readyState");
    }

    @Test(priority = 1)

    public void shouldNotLogin() {

        driver.get(UrlBase);
        waitForPageLoad(driver);

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("xx");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("xx57asd86");
        driver.findElement(By.xpath("//input[@type='submit']")).sendKeys(Keys.ENTER);
        Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='Error!']")).isDisplayed());
    }

    @Test(priority = 2)

    public void shouldLogin(){
        driver.get(UrlBase);
        waitForPageLoad(driver);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("misiek201");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@type='submit']")).sendKeys(Keys.ENTER);
        Assert.assertTrue(driver.findElement(By.xpath("//thead/tr/th[text()='Account']")).isDisplayed());


    }

}