package pages;

import assertions.TransferFundsAssertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TransferFinishedPage extends LoggedInPage {





    public TransferFundsAssertion transferFundsAssertion;

    public TransferFinishedPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        transferFundsAssertion = new TransferFundsAssertion(driver);
    }


}
