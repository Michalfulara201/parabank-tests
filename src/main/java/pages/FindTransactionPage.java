package pages;

import assertions.TransactionFindAssertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FindTransactionPage extends LoggedInPage {

    public TransactionFindAssertion findTransactionAssertion;

    @FindBy(xpath = "//input[@id='criteria.amount']")
    private WebElement inputFindByAmount;

    @FindBy(xpath = "//div/button[@value='AMOUNT']")
    private WebElement FindByAmountButton;

    @FindBy(xpath = "//select[@id='accountId']")
    private WebElement selectAccountDropDown;

    @FindBy(xpath = "//input[@id='criteria.transactionId']")
    private WebElement inputTransactionId;

    @FindBy(xpath = "//button[@value='ID']")
    private WebElement findByIdButton;

    @FindBy(xpath = "//input[@id='criteria.onDate']")
    private WebElement inputFindByDate;

    @FindBy(xpath = "//button[@value='DATE']")
    private WebElement findByDateButton;

    @FindBy(xpath = "//input[@id='criteria.fromDate']")
    private WebElement range1Button;

    @FindBy(xpath = "//input[@id='criteria.toDate']")
    private WebElement range2Button;

    @FindBy(xpath = "//button[@value='DATE']")
    private WebElement findTransactionsRangeButton;

    public FindTransactionPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        findTransactionAssertion = new TransactionFindAssertion(driver);

    }

    public FindTransactionPage inputFindByAmount(String amount) {
        inputFindByAmount.sendKeys(amount);
        return this;

    }
    public TransactionsPageResults clickFindByAmountButton(){
        FindByAmountButton.click();
        waitForPageLoad(driver);
        return new TransactionsPageResults(driver);

    }
    public FindTransactionPage selectAccount(){
        Select selectAccountId = new Select(selectAccountDropDown);
        selectAccountId.selectByIndex(1);
        return this;

    }
    public FindTransactionPage inputFindById(String inputId){
        inputTransactionId.sendKeys(inputId);
        return this;
    }
    public TransactionsPageResults clickFindByIdButton(){
        findByIdButton.click();
        waitForPageLoad(driver);
        return new TransactionsPageResults(driver);

    }
    public FindTransactionPage inputFindByDate(String inputDate){
        inputFindByDate.sendKeys(inputDate);
        return this;
    }
    public TransactionsPageResults clickFindByDateButton(){
        findByDateButton.click();
        return new TransactionsPageResults(driver);

    }
    public FindTransactionPage inputFindByRange(String field1,String field2){
        range1Button.sendKeys(field1);
        range2Button.sendKeys(field2);
        return this;

    }
    public TransactionsPageResults clickFindByRangeButton(){
        findTransactionsRangeButton.click();
        waitForPageLoad(driver);
        return new TransactionsPageResults(driver);

    }

}
