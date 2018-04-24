import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SignUp {


    WebDriver driver = new ChromeDriver();
    public String UrlBase ="http://parabank.parasoft.com/parabank/register.htm";
    public void waitForPageLoad(WebDriver webDriver) {
        Wait<WebDriver> wait = new WebDriverWait(webDriver, 30);
        wait.until(webDriver1 -> (JavascriptExecutor) webDriver).executeScript("return document.readyState");
    }


    @Test(priority = 1)

    public void shouldRegister() {


        driver.get(UrlBase);
        waitForPageLoad(driver);
        driver.findElement(By.xpath("//input[@name='customer.firstName']")).sendKeys("xxx");
        driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("xxx");
        driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("Wielopole 1");
        driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Krakow");
        driver.findElement(By.xpath("//input[@name='customer.address.state']")).sendKeys("malopolska");
        driver.findElement(By.xpath("//input[@name='customer.address.zipCode']")).sendKeys("32800");
        driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("1234567890");
        driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("1235");
        driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("misiek201");
        driver.findElement(By.xpath("//input[@name='customer.password']")).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@name='repeatedPassword']")).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@value='Register']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Log Out']")).isDisplayed());

    }


    @Test(priority = 2)
    public void shouldNotRegisterIfUserExist() {

        driver.get(UrlBase);
        waitForPageLoad(driver);
        driver.findElement(By.xpath("//input[@name='customer.firstName']")).sendKeys("xx");
        driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("xx");
        driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("Wielopole 1");
        driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Krakow");
        driver.findElement(By.xpath("//input[@name='customer.address.state']")).sendKeys("malopolska");
        driver.findElement(By.xpath("//input[@name='customer.address.zipCode']")).sendKeys("32800");
        driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("1234567890");
        driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("1235");
        driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("misiek201");
        driver.findElement(By.xpath("//input[@name='customer.password']")).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@name='repeatedPassword']")).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@value='Register']")).click();


        WebElement element = driver.findElement(By.xpath("//span[text()='This username already exists.']"));
        String checkUsername = element.getText();
        Assert.assertEquals("This username already exists.", checkUsername);

    }

    @Test(priority = 3)

    public void shouldNotRegisterIfLackofConfirmationPassword() {

        driver.get(UrlBase);
        waitForPageLoad(driver);
        driver.findElement(By.xpath("//input[@name='customer.firstName']")).sendKeys("xxxx");
        driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("xxx");
        driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("Wielopole 1");
        driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Krakow");
        driver.findElement(By.xpath("//input[@name='customer.address.state']")).sendKeys("malopolska");
        driver.findElement(By.xpath("//input[@name='customer.address.zipCode']")).sendKeys("32800");
        driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("1234567890");
        driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("1235");
        driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("misiek201");
        driver.findElement(By.xpath("//input[@name='customer.password']")).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@value='Register']")).click();

        WebElement element = driver.findElement(By.xpath("//span[text()='Password confirmation is required.']"));
        String checkConfirmation = element.getText();
        Assert.assertEquals("Password confirmation is required.", checkConfirmation);


    }
    @Test(priority = 4)

    public void  shouldNotRegisterIfLackofUserName(){

        driver.get(UrlBase);
        waitForPageLoad(driver);
        driver.findElement(By.xpath("//input[@name='customer.firstName']")).sendKeys("xxx");
        driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("xxx");
        driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("Wielopole 1");
        driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Krakow");
        driver.findElement(By.xpath("//input[@name='customer.address.state']")).sendKeys("malopolska");
        driver.findElement(By.xpath("//input[@name='customer.address.zipCode']")).sendKeys("32800");
        driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("1234567890");
        driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("1235");
        driver.findElement(By.xpath("//input[@name='customer.password']")).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@name='repeatedPassword']")).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@value='Register']")).click();

        WebElement element = driver.findElement(By.xpath("//span[@id='customer.username.errors']"));
        String checkMessage = element.getText();
        Assert.assertEquals("Username is required.", checkMessage);
    }

}

