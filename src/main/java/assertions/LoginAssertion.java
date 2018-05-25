package assertions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.MainPage;

public class LoginAssertion extends MainPage {

    @FindBy(xpath = "//a[text()='Log Out']")
    private WebElement loginConfirmation;

    @FindBy(xpath = "//h1[text()='Error!']")
    private WebElement wrongPassword;


    public LoginAssertion(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void isUserLoggedin(){
        Assert.assertTrue(loginConfirmation.isDisplayed());

    }

    public void userNotLoginWithWrongPassword(){
        Assert.assertTrue(wrongPassword.isDisplayed());
    }
}
