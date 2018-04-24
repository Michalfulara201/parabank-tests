import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SignUp {


    WebDriver driver = new ChromeDriver();
    public String UrlBase = "http://parabank.parasoft.com/parabank/register.htm";


    public void waitForPageLoad(WebDriver webDriver) {
        Wait<WebDriver> wait = new WebDriverWait(webDriver, 30);
        wait.until(webDriver1 -> (JavascriptExecutor) webDriver).executeScript("return document.readyState");
    }

    public void registerFields(String firstNameLocation, String lastNameLocation, String customerStreetLocation,
                               String customerCityLocation, String customerAdressState, String customerAdressZipCode,
                               String customerPhoneNumber, String customerSsn, String customerUsername, String
                                       customerPassword, String customerConfirmPassword) {

        driver.findElement(By.xpath("//input[@name='customer.firstName']")).sendKeys(firstNameLocation);
        driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys(lastNameLocation);
        driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys(customerStreetLocation);
        driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys(customerCityLocation);
        driver.findElement(By.xpath("//input[@name='customer.address.state']")).sendKeys(customerAdressState);
        driver.findElement(By.xpath("//input[@name='customer.address.zipCode']")).sendKeys(customerAdressZipCode);
        driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys(customerPhoneNumber);
        driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys(customerSsn);
        driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys(customerUsername);
        driver.findElement(By.xpath("//input[@name='customer.password']")).sendKeys(customerPassword);
        driver.findElement(By.xpath("//input[@name='repeatedPassword']")).sendKeys(customerConfirmPassword);
        driver.findElement(By.xpath("//input[@value='Register']")).click();

    }

    @Test(priority = 1)

    public void shouldRegister() {


        driver.get(UrlBase);
        waitForPageLoad(driver);
        registerFields("xxx", "xxx", "xxx", "xxx",
                "xxx", "23445", "80901983", "1232",
                "misiek201", "123456789", "123456789");

        Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Log Out']")).isDisplayed());

    }


    @Test(priority = 2)
    public void shouldNotRegisterIfUserExist() {

        driver.get(UrlBase);
        waitForPageLoad(driver);

        registerFields("xxx", "xxx", "xxx", "xxx",
                "xxx", "23445", "80901983", "1232",
                "misiek201", "123456789", "123456789");


        WebElement element = driver.findElement(By.xpath("//span[text()='This username already exists.']"));
        String checkUsername = element.getText();
        Assert.assertEquals("This username already exists.", checkUsername);

    }

    @Test(priority = 3)

    public void shouldNotRegisterIfLackofConfirmationPassword() {

        driver.get(UrlBase);
        waitForPageLoad(driver);
        registerFields("xxx", "xxx", "xxx", "xxx",
                "xxx", "23445", "80901983", "1232",
                "misiek201", "123456789", "");



        WebElement element = driver.findElement(By.xpath("//span[text()='Password confirmation is required.']"));
        String checkConfirmation = element.getText();
        Assert.assertEquals("Password confirmation is required.", checkConfirmation);


    }

    @Test(priority = 4)

    public void shouldNotRegisterIfLackofUserName() {

        driver.get(UrlBase);
        waitForPageLoad(driver);
        registerFields("xxx","xxx","xxx","xxx",
                "xxx","23445","80901983","1232",
                "","123456789","123456789");
        

        WebElement element = driver.findElement(By.xpath("//span[@id='customer.username.errors']"));
        String checkMessage = element.getText();
        Assert.assertEquals("Username is required.", checkMessage);
    }

}

