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


public class SignUp {


    WebDriver driver;
    RegisterPage registerPage;
    AccountPage accountPage;


    @BeforeMethod
    public void before(){
        driver = new ChromeDriver();
        registerPage = new RegisterPage(driver);
        accountPage = new AccountPage(driver);



    }

    @Test(priority = 1)

    public void shouldRegister() {

        registerPage.openRegisterPage();
        registerPage.firstNameField("xxx");
        registerPage.lastNameField("xxx");
        registerPage.addressField("xxx");
        registerPage.cityField("xxx");
        registerPage.cityField("xxx");
        registerPage.stateField("xxx");
        registerPage.zipField("xxx");
        registerPage.phoneField("xxx");
        registerPage.ssnField("xxx");
        registerPage.userNameField("michal201");
        registerPage.passwordField("12345");
        registerPage.confirmationPasswordField("12345");
        registerPage.clickRegisterButton();

        Assert.assertTrue(accountPage.isUserLogin());

    }


    @Test(priority = 2)

    public void shouldNotRegisterIfUserExist() {

        registerPage.openRegisterPage();
        registerPage.firstNameField("xxx");
        registerPage.lastNameField("xxx");
        registerPage.addressField("xxx");
        registerPage.cityField("xxx");
        registerPage.cityField("xxx");
        registerPage.stateField("xxx");
        registerPage.zipField("xxx");
        registerPage.phoneField("xxx");
        registerPage.ssnField("xxx");
        registerPage.userNameField("michal201");
        registerPage.passwordField("12345");
        registerPage.confirmationPasswordField("12345");
        registerPage.clickRegisterButton();

        Assert.assertTrue(registerPage.isUserRegistered());

    }

    @Test(priority = 3)

    public void shouldNotRegisterIfLackofConfirmationPassword() {
        registerPage.openRegisterPage();
        registerPage.firstNameField("xxx");
        registerPage.lastNameField("xxx");
        registerPage.addressField("xxx");
        registerPage.cityField("xxx");
        registerPage.cityField("xxx");
        registerPage.stateField("xxx");
        registerPage.zipField("xxx");
        registerPage.phoneField("xxx");
        registerPage.ssnField("xxx");
        registerPage.userNameField("michal201");
        registerPage.passwordField("12345");
        registerPage.confirmationPasswordField("");
        registerPage.clickRegisterButton();

        Assert.assertTrue(registerPage.isLackOfConfirmationPassword());
    }

    @Test(priority = 4)

    public void shouldNotRegisterIfLackofUserName() {

        registerPage.openRegisterPage();
        registerPage.firstNameField("xxx");
        registerPage.lastNameField("xxx");
        registerPage.addressField("xxx");
        registerPage.cityField("xxx");
        registerPage.cityField("xxx");
        registerPage.stateField("xxx");
        registerPage.zipField("23233");
        registerPage.phoneField("0987654312");
        registerPage.ssnField("ssss");
        registerPage.userNameField("");
        registerPage.passwordField("12345");
        registerPage.confirmationPasswordField("12345");
        registerPage.clickRegisterButton();

        Assert.assertTrue(registerPage.isLackOfUserName());

    }

}

