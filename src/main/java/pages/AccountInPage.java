package pages;

import assertions.LoginAssertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AccountInPage extends LoggedInPage {


    public LoginAssertion loginAssertion;


    public AccountInPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
        loginAssertion = new LoginAssertion(driver);

    }

}