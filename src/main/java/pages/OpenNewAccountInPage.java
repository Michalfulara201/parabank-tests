package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import scenarios.OpenNewAccountScenario;

public class OpenNewAccountPage extends SuccessLoggedPage {


    @FindBy(xpath = "//select[@id='type']")
    private WebElement selectAccount;

    @FindBy(xpath = "//select[@id='fromAccountId']")
    private WebElement valueType;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submitButton;

    public OpenNewAccountPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    public OpenNewAccountPage selectTypeValue(String type) {
        Select accountType = new Select(selectAccount);
        accountType.selectByValue(type);
        return this;

    }

    public OpenNewAccountPage selectValueToTransfer(String value) {

        Select valueToTransfer = new Select(valueType);
        valueToTransfer.selectByValue(value);
        return this;
    }

    public AccountOpenedPage clickSubmitButton() {
        submitButton.click();
        waitForPageLoad(driver);
        return new AccountOpenedPage(driver);
    }
}
