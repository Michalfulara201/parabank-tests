import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.IndexPage;
import pages.LookupPage;
import pages.MainPage;

public class ForgotPassword extends MainTest {


    @Test(priority = 1)
    public void shouldLogInWithCorrectData() {

        indexPage.openParabankMainPage()
                .clickForgotPasswordLink()
                .setFirstName("xxx")
                .setLastName("xxx")
                .setAddress("xxx")
                .setCity("xxx")
                .setState("xxx")
                .setZip("xxx")
                .setSnn("xxx")
                .clickOnFindMyLoginInfo()
                .forgotAssertion.isLoggedIn();

    }

    @Test(priority = 2)
    public void shouldNotLogInIfLackofFirstName() {

        indexPage.openParabankMainPage()
                .clickForgotPasswordLink()
                .setFirstName("")
                .setLastName("xxx")
                .setAddress("xxx")
                .setCity("xxx")
                .setState("xxx")
                .setZip("xxx")
                .setSnn("xxx")
                .clickOnFindMyLoginInfo()

                .forgotAssertion.isLackofFirstName();

    }

    @Test(priority = 3)
    public void shouldNotLogInIfLackOfLastName() {

        indexPage.openParabankMainPage()
                .clickForgotPasswordLink()
                .setFirstName("xxx")
                .setLastName("")
                .setAddress("xxx")
                .setCity("xxx")
                .setState("xxx")
                .setZip("xxx")
                .setSnn("xxx")
                .clickOnFindMyLoginInfo()


                .forgotAssertion.isLackofLastName();

    }

    @Test(priority = 4)
    public void shouldNotLogInIfLackOfAddress() {
        indexPage.openParabankMainPage()
                .clickForgotPasswordLink()
                .setFirstName("xxx")
                .setLastName("xxx")
                .setAddress("")
                .setCity("xxx")
                .setState("xxx")
                .setZip("xxx")
                .setSnn("xxx")
                .clickOnFindMyLoginInfo()

                .forgotAssertion.isLackofAddress();

    }

    @Test(priority = 5)
    public void shouldNotLogInIfLackOfCity() {
        indexPage.openParabankMainPage()
                .clickForgotPasswordLink()
                .setFirstName("xxx")
                .setLastName("xxx")
                .setAddress("xxx")
                .setCity("")
                .setState("xxx")
                .setZip("xxx")
                .setSnn("xxx")
                .clickOnFindMyLoginInfo()

                .forgotAssertion.isLackofCity();

    }

    @Test(priority = 6)
    public void shouldNotLogInIfLackOfState() {
        indexPage.openParabankMainPage()
                .clickForgotPasswordLink()
                .setFirstName("xxx")
                .setLastName("xxx")
                .setAddress("xxx")
                .setCity("xxx")
                .setState("")
                .setZip("xxx")
                .setSnn("xxx")
                .clickOnFindMyLoginInfo()

                .forgotAssertion.isLackofState();

    }

    @Test(priority = 7)
    public void shouldNotLogInIfLackOfZip() {
        indexPage.openParabankMainPage()
                .clickForgotPasswordLink()
                .setFirstName("xxx")
                .setLastName("xxx")
                .setAddress("xxx")
                .setCity("xxx")
                .setState("xxx")
                .setZip("")
                .setSnn("xxx")
                .clickOnFindMyLoginInfo()

                .forgotAssertion.isLackofZip();

    }

    @Test(priority = 8)

    public void shouldNotLogInIfLackOfSnn() {
        indexPage.openParabankMainPage()
                .clickForgotPasswordLink()
                .setFirstName("xxx")
                .setLastName("xxx")
                .setAddress("xxx")
                .setCity("xxx")
                .setState("xxx")
                .setZip("xxx")
                .setSnn("")
                .clickOnFindMyLoginInfo()

                .forgotAssertion.isLackofSnn();

    }
}
