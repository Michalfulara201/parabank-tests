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
        driver.close();
    }

    @Test(priority = 2)
    public void shouldNotLogInIfLackofFirstName() {

        lookupPage.openLookupPage();
        lookupPage.setFirstName("");
        lookupPage.setLastName("xxx");
        lookupPage.setAddress("xxx");
        lookupPage.setCity("xxx");
        lookupPage.setState("xxx");
        lookupPage.setZip("xxx");
        lookupPage.setSnn("xxx");
        lookupPage.clickOnFindMyLoginInfo();

        Assert.assertTrue(lookupPage.isLackofFirstName());
        driver.close();
    }

    @Test(priority = 3)
    public void shouldNotLogInIfLackOfLastName() {
        lookupPage.openLookupPage();
        lookupPage.setFirstName("xxx");
        lookupPage.setLastName("");
        lookupPage.setAddress("xxx");
        lookupPage.setCity("xxx");
        lookupPage.setState("xxx");
        lookupPage.setZip("xxx");
        lookupPage.setSnn("xxx");
        lookupPage.clickOnFindMyLoginInfo();

        Assert.assertTrue(lookupPage.isLackofLastName());
        driver.close();
    }

    @Test(priority = 4)
    public void shouldNotLogInIfLackOfAddress() {
        lookupPage.openLookupPage();
        lookupPage.setFirstName("xxx");
        lookupPage.setLastName("xxx");
        lookupPage.setAddress("");
        lookupPage.setCity("xxx");
        lookupPage.setState("xxx");
        lookupPage.setZip("xxx");
        lookupPage.setSnn("xxx");
        lookupPage.clickOnFindMyLoginInfo();

        Assert.assertTrue(lookupPage.isLackofAddress());
        driver.close();
    }

    @Test(priority = 5)
    public void shouldNotLogInIfLackOfCity() {
        lookupPage.openLookupPage();
        lookupPage.setFirstName("xxx");
        lookupPage.setLastName("xxx");
        lookupPage.setAddress("xxx");
        lookupPage.setCity("");
        lookupPage.setState("xxx");
        lookupPage.setZip("xxx");
        lookupPage.setSnn("xxx");
        lookupPage.clickOnFindMyLoginInfo();

        Assert.assertTrue(lookupPage.isLackofCity());
        driver.close();
    }

    @Test(priority = 6)
    public void shouldNotLogInIfLackOfState() {
        lookupPage.openLookupPage();
        lookupPage.setFirstName("xxx");
        lookupPage.setLastName("xxx");
        lookupPage.setAddress("xxx");
        lookupPage.setCity("xxx");
        lookupPage.setState("");
        lookupPage.setZip("xxx");
        lookupPage.setSnn("xxx");
        lookupPage.clickOnFindMyLoginInfo();

        Assert.assertTrue(lookupPage.isLackofState());
        driver.close();
    }

    @Test(priority = 7)
    public void shouldNotLogInIfLackOfZip() {
        lookupPage.openLookupPage();
        lookupPage.setFirstName("xxx");
        lookupPage.setLastName("xxx");
        lookupPage.setAddress("xxx");
        lookupPage.setCity("xxx");
        lookupPage.setState("xxx");
        lookupPage.setZip("");
        lookupPage.setSnn("xxx");
        lookupPage.clickOnFindMyLoginInfo();

        Assert.assertTrue(lookupPage.isLackofZip());
        driver.close();
    }

    @Test(priority = 8)

    public void shouldNotLogInIfLackOfSnn() {
        lookupPage.openLookupPage();
        lookupPage.setFirstName("xxx");
        lookupPage.setLastName("xxx");
        lookupPage.setAddress("xxx");
        lookupPage.setCity("xxx");
        lookupPage.setState("xxx");
        lookupPage.setZip("xxx");
        lookupPage.setSnn("");
        lookupPage.clickOnFindMyLoginInfo();

        Assert.assertTrue(lookupPage.isLackofSnn());
        driver.close();
    }
}
