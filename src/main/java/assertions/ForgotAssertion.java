package assertions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.MainPage;

public class ForgotAssertion extends MainPage {

    @FindBy(xpath = "//a[text()='Log Out']")
    private WebElement loginCheckinput;

    @FindBy(xpath = "//span[@id='firstName.errors']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//span[@id='lastName.errors']")
    private WebElement lastNameInput;

    @FindBy(xpath = "//span[@id='address.street.errors']")
    private WebElement addresStreetInput;

    @FindBy(xpath = "//span[@id='address.city.errors']")
    private WebElement addressCityInput;

    @FindBy(xpath = "//span[@id='address.state.errors']")
    private WebElement addressStateInput;

    @FindBy(xpath = "//span[@id='address.zipCode.errors']")
    private WebElement addressZipCode;

    @FindBy(xpath = "//span[text()='Social Security Number is required.']")
    private WebElement ssnInput;

    public ForgotAssertion(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void isLoggedIn() {
        Assert.assertTrue(loginCheckinput.isDisplayed());
    }

    public void isLackofFirstName() {
        Assert.assertTrue(firstNameInput.isDisplayed());
    }

    public void isLackofLastName() {
        Assert.assertTrue(lastNameInput.isDisplayed());
    }

    public void isLackofAddress() {
        Assert.assertTrue(addresStreetInput.isDisplayed());
    }

    public void isLackofCity() {
        Assert.assertTrue(addressCityInput.isDisplayed());
    }

    public void isLackofState() {
        Assert.assertTrue(addressStateInput.isDisplayed());
    }

    public void isLackofZip() {
        Assert.assertTrue(addressZipCode.isDisplayed());
    }
    public void isLackofSnn(){
        Assert.assertTrue(ssnInput.isDisplayed());
    }

}
