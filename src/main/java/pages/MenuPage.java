package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage extends MainPage {


    @FindBy(xpath = "//a[text()='Accounts Overview']")
    private WebElement accountsOverview;

    @FindBy(xpath = "//a[text()='Open New Account']")
    private WebElement newAccount;

    @FindBy(xpath = "//a[text()='Log Out']")
    private WebElement logOutButton;

    @FindBy(xpath = "//a[text()='Transfer Funds']")
    private WebElement transferFundsButton;

    @FindBy(xpath = "//a[text()='Find Transactions']")
    private WebElement findTransactionlink;

    public MenuPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public AccountInPage clickAccountsOverviewLink() {
        accountsOverview.click();
        waitForPageLoad(driver);
        return new AccountInPage(driver);
    }

    public OpenNewAccountInPage clickNewAccountLink() {
        newAccount.click();
        waitForPageLoad(driver);
        return new OpenNewAccountInPage(driver);
    }

    public AccountInPage clickLogOutLink() {
        logOutButton.click();
        waitForPageLoad(driver);
        return new AccountInPage(driver);

    }

    public TransferFundsPage clickTransferFundsButton() {
        transferFundsButton.click();
        waitForPageLoad(driver);
        return new TransferFundsPage(driver);
    }
    public FindTransactionPage clickFindTransactionsLink(){
        findTransactionlink.click();
        waitForPageLoad(driver);
        return new FindTransactionPage(driver);

    }


}
