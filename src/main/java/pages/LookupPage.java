package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LookupPage extends MainPage {

    public LookupPage(WebDriver driver) {
        super(driver);
    }

    public void openLookupPage() {
        driver.get("http://parabank.parasoft.com/parabank/lookup.htm");
        waitForPageLoad(driver);
    }

    public void setFirstName(String firstName) {
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(firstName);

    }

    public void setLastName(String lastName) {
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lastName);
    }

    public void setAddress(String address) {
        driver.findElement(By.xpath("//input[@id='address.street']")).sendKeys(address);
    }

    public void setCity(String city) {
        driver.findElement(By.xpath("//input[@id='address.city']")).sendKeys(city);
    }

    public void setState(String state) {
        driver.findElement(By.xpath("//input[@id='address.state']")).sendKeys(state);
    }

    public void setZip(String zip) {
        driver.findElement(By.xpath("//input[@id='address.zipCode']")).sendKeys(zip);
    }

    public void setSnn(String ssn) {
        driver.findElement(By.xpath("//input[@id='ssn']")).sendKeys(ssn);
    }

    public void clickOnFindMyLoginInfo() {
        driver.findElement(By.xpath("//input[@value='Find My Login Info']")).sendKeys(Keys.ENTER);
    }

    public boolean isLackofFirstName() {
        return driver.findElement(By.xpath("//span[@id='firstName.errors']")).isDisplayed();
    }

}
