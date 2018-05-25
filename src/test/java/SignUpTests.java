import assertions.RegisterAssertion;
import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.MainPage;
import pages.RegisterPage;
import scenarios.SignUpScenario;


public class SignUpTests extends MainTest {


    @Test(priority = 1)

    public void shouldRegister() {

        indexPage.run(new SignUpScenario("xxx", "xxx", "xxx", "xxx", "xxx", "xxx"
                , "xxx", "xxx", "xxx", "xxx", "xxx"))

                .registerAssertion.isUserLoggedin();

    }


    @Test(priority = 2)

    public void shouldNotRegisterIfUserExist() {

        indexPage.run(new SignUpScenario("xxx", "xxx", "xxx", "xxx", "xxx", "xxx"
                , "xxx", "xxx", "xxx", "xxx", "xxx"))
                .registerAssertion.isUserRegistered();

    }

    @Test(priority = 3)

    public void shouldNotRegisterIfLackofConfirmationPassword() {
        indexPage.run(new SignUpScenario("xxx", "xxx", "xxx", "xxx", "xxx", "xxx"
                , "xxx", "xxx", "xxx", "xxx", ""))
                .registerAssertion.isLackofConfirmationPassword();

    }

    @Test(priority = 4)

    public void shouldNotRegisterIfLackofUserName() {

        indexPage.run(new SignUpScenario("xxx", "xxx", "xxx", "xxx", "xxx", "xxx"
                , "xxx", "xxx", "", "xxx", "xxx"))

                .registerAssertion.isLackofUserName();


    }

}

