package assertions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.MainPage;

public class TransactionFindAssertion extends MainPage{


   @FindBy(xpath = "//table[@id='transactionTable']")
   private WebElement checkTransactionResults;


    public TransactionFindAssertion(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);

    }

    public void transactionResult(){
        Assert.assertTrue(checkTransactionResults.isDisplayed());

    }
}
