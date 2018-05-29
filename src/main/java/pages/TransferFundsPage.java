package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransferFundsPage extends LoggedInPage {


    @FindBy(xpath = "//input[@id='amount']")
    private WebElement amountField;
    @FindBy(xpath = "//select[@id='fromAccountId']")
    private WebElement selectFromAccount;
    @FindBy(xpath = "//select[@id='toAccountId']")
    private WebElement selectToAccount;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement transferButton;


    public TransferFundsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public TransferFundsPage inputAmountMoney(String amount) {
        amountField.sendKeys(amount);
        return this;
    }

    public TransferFundsPage selectFromAccountDropDownList() {
        Select fromAccount = new Select(selectFromAccount);
        fromAccount.selectByIndex(0);
        return this;
    }

    public TransferFundsPage selectToAccountDropDownList() {
        Select toAccount = new Select(selectToAccount);
        toAccount.selectByIndex(1);
        return this;
    }

    public TransferFinishedPage clickTransferButton() {
        transferButton.click();
        waitForPageLoad(driver);
        return new TransferFinishedPage(driver);

    }


}
