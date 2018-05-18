package pages;

import assertions.RegisterAssertion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends MainPage {

    public RegisterAssertion registerAssertion;


    @FindBy(xpath = "//input[@id='customer.firstName']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//input[@id='customer.lastName']")
    private WebElement lastNameInput;

    @FindBy(xpath = "//input[@id='customer.address.street']")
    private WebElement customerAddressStreetInput;

    @FindBy(xpath = "//input[@id='customer.address.city']")
    private WebElement customerAddressCityInput;

    @FindBy(xpath = "//input[@id='customer.address.state']")
    private WebElement customerAddressStateInput;

    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    private WebElement customerAddressZipCodeInput;

    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    private WebElement customerPhoneNumberInput;

    @FindBy(xpath = "//input[@id='customer.ssn']")
    private WebElement customerSsnInput;

    @FindBy(xpath = "//input[@id='customer.username']")
    private WebElement userNameInput;

    @FindBy(xpath = "//input[@id='customer.password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@id='repeatedPassword']")
    private WebElement passwordConfirmationInput;

    @FindBy(xpath = "//input[@value='Register']")
    private WebElement registerButton;


    public RegisterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        registerAssertion = new RegisterAssertion(driver);
    }

    public RegisterPage openRegisterPage() {
        driver.get("http://parabank.parasoft.com/parabank/register.htm");
        waitForPageLoad(driver);
        return this;
    }

    public RegisterPage firstNameField(String firstName) {
        firstNameInput.sendKeys(firstName);
        return this;
    }

    public RegisterPage lastNameField(String lastName) {
        lastNameInput.sendKeys(lastName);
        return this;
    }

    public RegisterPage addressField(String address) {
        customerAddressStreetInput.sendKeys(address);
        return this;
    }

    public RegisterPage cityField(String city) {
        customerAddressCityInput.sendKeys(city);
        return this;
    }

    public RegisterPage stateField(String state) {
        customerAddressStateInput.sendKeys(state);
        return this;
    }

    public RegisterPage zipField(String zip) {
        customerAddressZipCodeInput.sendKeys(zip);
        return this;
    }

    public RegisterPage phoneField(String phone) {
        customerPhoneNumberInput.sendKeys(phone);
        return this;
    }

    public RegisterPage ssnField(String ssn) {
        customerSsnInput.sendKeys(ssn);
        return this;
    }

    public RegisterPage userNameField(String userName) {
        userNameInput.sendKeys(userName);
        return this;
    }

    public RegisterPage passwordField(String password) {
        passwordInput.sendKeys(password);
        return this;
    }

    public RegisterPage confirmationPasswordField(String confirmationPassword) {
        passwordConfirmationInput.sendKeys(confirmationPassword);
        return this;
    }

    public RegistrationSuccessPage clickRegisterButton() {
        registerButton.click();
        return new RegistrationSuccessPage(driver);
    }


}
