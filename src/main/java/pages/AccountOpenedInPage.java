package pages;

import assertions.OpenAccountAssertion;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

public class AccountOpenedInPage extends LoggedInPage {

    public OpenAccountAssertion openAccountAssertion;


    public AccountOpenedInPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
        openAccountAssertion = new OpenAccountAssertion(driver);

    }
}
