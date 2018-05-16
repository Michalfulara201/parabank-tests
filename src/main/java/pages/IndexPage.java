package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class IndexPage extends MainPage {


    public IndexPage(WebDriver driver) {
        super(driver);
    }

    public void openParabankMainPage() {
        driver.get("http://parabank.parasoft.com/parabank/index.htm");
        waitForPageLoad(driver);

    }

    public void setUserName(String username) {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);

    }

    public void setPassword(String password) {
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(By.xpath("//input[@type='submit']")).sendKeys(Keys.ENTER);

    }

    public boolean isUserNotLogin() {
        return driver.findElement(By.xpath("//h1[text()='Error!']")).isDisplayed();
    }
}
