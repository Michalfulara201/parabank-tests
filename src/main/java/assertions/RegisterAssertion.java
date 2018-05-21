package assertions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.MainPage;
import pages.RegisterPage;

public class RegisterAssertion extends MainPage {

    @FindBy(xpath = "//span[@id='customer.username.errors']")
    private WebElement isUserRegisteredInput;

    @FindBy(xpath = "//span[@id='repeatedPassword.errors']")
    private WebElement isLackofConfirmationPasswordInput;

    @FindBy(xpath = "//span[@id='customer.username.errors']")
    private WebElement isLackofUserNameInput;

    @FindBy(xpath = "//a[text()='Log Out']")
    private WebElement loginConfirmation;

    public RegisterAssertion(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void isUserRegistered() {
        Assert.assertEquals(isUserRegisteredInput.getText(), "This username already exists.");

    }

    public void isLackofConfirmationPassword() {
        Assert.assertTrue(isLackofConfirmationPasswordInput.isDisplayed());
    }

    public void isLackofUserName() {
        Assert.assertTrue(isLackofUserNameInput.isDisplayed());
    }

    public void isUserLoggedin() {
        Assert.assertTrue(loginConfirmation.isDisplayed());
    }
}