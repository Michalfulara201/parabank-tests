package assertions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.MainPage;

public class TransferFundsAssertion extends MainPage {

    @FindBy(xpath = "//div/h1[text()='Transfer Complete!']" )
    private WebElement transferCompleteSuccess;

    public TransferFundsAssertion(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void transferSuccessAssertion(){
        Assert.assertTrue(transferCompleteSuccess.isDisplayed());
    }
}
