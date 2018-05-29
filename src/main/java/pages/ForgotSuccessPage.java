package pages;

import assertions.ForgotAssertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ForgotSuccessPage extends MainPage {


    public ForgotAssertion forgotAssertion;

    public ForgotSuccessPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        forgotAssertion  = new ForgotAssertion(driver);
    }
}