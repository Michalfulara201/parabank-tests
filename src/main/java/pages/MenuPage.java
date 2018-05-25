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

    public MenuPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public AccountPage clickAccountsOverviewLink(){
        accountsOverview.click();
        waitForPageLoad(driver);
        return new AccountPage(driver);
    }

    public OpenNewAccountPage clickNewAccountLink(){
        newAccount.click();
        waitForPageLoad(driver);
        return new OpenNewAccountPage(driver);
    }

}
