package pages;

import assertions.TransactionFindAssertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TransactionsPageResults extends LoggedInPage {

    public TransactionFindAssertion findTransactionAssertion;

    public TransactionsPageResults(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        findTransactionAssertion = new TransactionFindAssertion(driver);

    }
}
