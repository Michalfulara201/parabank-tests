package pages;

import assertions.LoginAssertion;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends MainPage {

    private String url;
    public LoginAssertion loginAssertion;


    @FindBy(xpath = "//input[@name='username']")
    private WebElement userNameInput;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement loginButton;

    @FindBy(xpath = "//a[contains(@href, 'register.htm') and text()='Register']")
    private WebElement clickRegisterButton;

    @FindBy(xpath = "//a[contains(@href, 'lookup.htm') and text()='Forgot login info?']")
    private WebElement clickForgotPasswordLinkInput;


    public IndexPage(WebDriver driver,String url) {
        super(driver);
        PageFactory.initElements(driver, this);
        loginAssertion = new LoginAssertion(driver);
        this.url = url;
    }

    public IndexPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public IndexPage openParabankMainPage() {
        driver.get("http://parabank.parasoft.com/parabank/index.htm");
        waitForPageLoad(driver);
        return this;

    }

    public IndexPage setUserName(String username) {
        userNameInput.sendKeys(username);
        return this;

    }

    public IndexPage setPassword(String password) {
        passwordInput.sendKeys(password);
        return this;
    }

    public AccountInPage clickLoginButton() {
        loginButton.sendKeys(Keys.ENTER);
        waitForPageLoad(driver);
        return new AccountInPage(driver);

    }


    public RegisterPage clickRegisterLink() {
        clickRegisterButton.sendKeys(Keys.ENTER);
        waitForPageLoad(driver);
        return new RegisterPage(driver);

    }
    public LookupPage clickForgotPasswordLink(){
        clickForgotPasswordLinkInput.click();
        waitForPageLoad(driver);
        return new LookupPage(driver);

    }


    }







