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


public class SignUp extends MainTest {




    @Test(priority = 1)

    public void shouldRegister() {

        indexPage.openParabankMainPage()
                .clickRegisterLink()
                .firstNameField("xxx")
                .lastNameField("xxx")
                .addressField("xxx")
                .cityField("xxx")
                .stateField("xxx")
                .zipField("xxx")
                .phoneField("xxx")
                .ssnField("xxx")
                .userNameField("xxx")
                .passwordField("xxx")
                .confirmationPasswordField("xxx")
                .clickRegisterButton()
                .registerAssertion.isUserLoggedin();

    }


    @Test(priority = 2)

    public void shouldNotRegisterIfUserExist() {

        indexPage.openParabankMainPage()
                .clickRegisterLink()
                .firstNameField("xxx")
                .lastNameField("xxx")
                .addressField("xxx")
                .cityField("xxx")
                .cityField("xxx")
                .stateField("xxx")
                .zipField("xxx")
                .phoneField("xxx")
                .ssnField("xxx")
                .userNameField("xxx")
                .passwordField("xxx")
                .confirmationPasswordField("xxx")
                .clickRegisterButton()
                .registerAssertion.isUserRegistered();

    }

    @Test(priority = 3)

    public void shouldNotRegisterIfLackofConfirmationPassword() {
        indexPage.openParabankMainPage()
                .clickRegisterLink()
                .firstNameField("xxx")
                .lastNameField("xxx")
                .addressField("xxx")
                .cityField("xxx")
                .cityField("xxx")
                .stateField("xxx")
                .zipField("xxx")
                .phoneField("xxx")
                .ssnField("xxx")
                .userNameField("michal201")
                .passwordField("12345")
                .confirmationPasswordField("")
                .clickRegisterButton()
                .registerAssertion.isLackofConfirmationPassword();

    }

    @Test(priority = 4)

    public void shouldNotRegisterIfLackofUserName() {

        indexPage.openParabankMainPage()
                .clickRegisterLink()
                .firstNameField("xxx")
                .lastNameField("xxx")
                .addressField("xxx")
                .cityField("xxx")
                .cityField("xxx")
                .stateField("xxx")
                .zipField("23233")
                .phoneField("0987654312")
                .ssnField("ssss")
                .userNameField("")
                .passwordField("12345")
                .confirmationPasswordField("12345")
                .clickRegisterButton()
                .registerAssertion.isLackofUserName();


    }

}

