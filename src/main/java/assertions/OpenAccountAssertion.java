package assertions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.MainPage;

public class OpenAccountAssertion extends MainPage {


    @FindBy(xpath = "//h1[text()='Account Opened!']")
    private WebElement accountOpened;


    public OpenAccountAssertion(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void accountOpenedConfirmation(){

        Assert.assertTrue(accountOpened.isDisplayed());
    }
}
