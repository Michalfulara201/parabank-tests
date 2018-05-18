import assertions.LoginAssertion;
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


public class LoginTests extends MainTest {




    @Test(priority = 1)

    public void shouldNotLoginWithWrongPassword() {


        indexPage.openParabankMainPage()
                .setUserName("xxx")
                .setPassword("bleble")
                .clickLoginButton()
                .loginAssertion.userNotLoginWithWrongPassword();

    }

    @Test(priority = 2)

    public void shouldLogin() {

        indexPage.openParabankMainPage()
                .setUserName("xxx")
                .setPassword("xxx")
                .clickLoginButton()
                .loginAssertion.isUserLoggedin();



    }

}