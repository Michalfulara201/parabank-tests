package pages;

import assertions.ForgotAssertion;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LookupPage extends MainPage {

    public ForgotAssertion forgotAssertion;


    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement lastNameInput;

    @FindBy(xpath = "//input[@id='address.street']")
    private WebElement adressStreetInput;

    @FindBy(xpath = "//input[@id='address.city']")
    private WebElement addressCityInput;

    @FindBy(xpath = "//input[@id='address.state']")
    private WebElement addressStateInput;

    @FindBy(xpath = "//input[@id='address.zipCode']")
    private WebElement addressZipCode;

    @FindBy(xpath = "//input[@id='ssn']")
    private WebElement ssnInput;

    @FindBy(xpath = "//input[@value='Find My Login Info']")
    private WebElement clickLoginInfoButton;


    public LookupPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        forgotAssertion = new ForgotAssertion(driver);
    }

    public LookupPage setFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
        return this;

    }

    public LookupPage setLastName(String lastName) {
        lastNameInput.sendKeys(lastName);
        return this;
    }

    public LookupPage setAddress(String address) {
        adressStreetInput.sendKeys(address);
        return this;
    }

    public LookupPage setCity(String city) {
        addressCityInput.sendKeys(city);
        return this;
    }

    public LookupPage setState(String state) {
        addressStateInput.sendKeys(state);
        return this;
    }

    public LookupPage setZip(String zip) {
        addressZipCode.sendKeys(zip);
        return this;
    }

    public LookupPage setSnn(String ssn) {
        ssnInput.sendKeys(ssn);
        return this;
    }

    public LookupPage clickOnFindMyLoginInfo() {
        clickLoginInfoButton.sendKeys(Keys.ENTER);
        waitForPageLoad(driver);
        return new LookupPage(driver);
    }

}

