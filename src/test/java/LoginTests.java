import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.IndexPage;



public class LoginTests {

    WebDriver driver;
    IndexPage indexPage;
    AccountPage accountPage;

    @BeforeMethod
    public void before(){
        driver = new ChromeDriver();
        indexPage = new IndexPage(driver);
        accountPage = new AccountPage(driver);


    }


    @Test(priority = 1)

    public void shouldNotLoginWithWrongPassword() {


        indexPage.openParabankMainPage();
        indexPage.setUserName("misiek201");
        indexPage.setPassword("bleble");
        indexPage.clickLoginButton();

        Assert.assertTrue(indexPage.isUserNotLogin());
    }

    @Test(priority = 2)

    public void shouldLogin(){

        indexPage.openParabankMainPage();
        indexPage.setUserName("michal201");
        indexPage.setPassword("12345");
        indexPage.clickLoginButton();

        Assert.assertTrue(accountPage.isUserLogin());


    }

}