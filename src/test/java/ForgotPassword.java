import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.LookupPage;

public class ForgotPassword {

    LookupPage lookupPage;
    WebDriver driver;
    AccountPage accountPage;

    @BeforeMethod
    public void before() {
        driver = new ChromeDriver();
        lookupPage = new LookupPage(driver);
        accountPage = new AccountPage(driver);


    }

    @Test(priority = 1)
    public void shouldLogInWithCorrectData() {

        lookupPage.openLookupPage();
        lookupPage.setFirstName("xxx");
        lookupPage.setLastName("xxx");
        lookupPage.setAddress("xxx");
        lookupPage.setCity("xxx");
        lookupPage.setState("xxx");
        lookupPage.setZip("xxx");
        lookupPage.setSnn("xxx");
        lookupPage.clickOnFindMyLoginInfo();

        Assert.assertTrue(accountPage.isUserLogin());
    }
}

