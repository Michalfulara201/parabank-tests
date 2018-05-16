package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends MainPage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void openRegisterPage() {
        driver.get("http://parabank.parasoft.com/parabank/register.htm");
        waitForPageLoad(driver);
    }

    public void firstNameField(String firstName) {
        driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys(firstName);
    }

    public void lastNameField(String lastName) {
        driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys(lastName);
    }

    public void addressField(String address) {
        driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys(address);
    }

    public void cityField(String city) {
        driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys(city);
    }

    public void stateField(String state) {
        driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys(state);
    }

    public void zipField(String zip) {
        driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys(zip);
    }

    public void phoneField(String phone) {
        driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys(phone);
    }

    public void ssnField(String ssn) {
        driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys(ssn);
    }

    public void userNameField(String userName) {
        driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys(userName);
    }

    public void passwordField(String password) {
        driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys(password);
    }

    public void confirmationPasswordField(String confirmationPassword) {
        driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys(confirmationPassword);
    }

    public void clickRegisterButton() {
        driver.findElement(By.xpath("//input[@value='Register']")).click();
    }

    public boolean isUserRegistered() {
        return driver.findElement(By.xpath("//span[@id='customer.username.errors']")).isDisplayed();
    }

    public boolean isLackOfConfirmationPassword(){
        return driver.findElement(By.xpath("//span[@id='repeatedPassword.errors']")).isDisplayed();
    }
    public boolean isLackOfUserName(){
        return driver.findElement(By.xpath("//span[@id='customer.username.errors']")).isDisplayed();
    }

}
