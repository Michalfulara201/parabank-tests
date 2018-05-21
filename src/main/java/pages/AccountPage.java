package pages;

import assertions.LoginAssertion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends MainPage {


    public LoginAssertion loginAssertion;


    public AccountPage(WebDriver driver) {
        super(driver);
        loginAssertion = new LoginAssertion(driver);

    }

}