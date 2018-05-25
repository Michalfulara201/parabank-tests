import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.IndexPage;
import pages.LookupPage;
import pages.MainPage;
import scenarios.ForgotScenario;

public class ForgotPasswordTests extends MainTest {


    @Test(priority = 1)
    public void shouldLogInWithCorrectData() {

        indexPage.run(new ForgotScenario("xxx","xxx","xxx","xxx","xxx","xxx","xxx"))

                .forgotAssertion.isLoggedIn();

    }

    @Test(priority = 2)
    public void shouldNotLogInIfLackofFirstName() {

        indexPage.run(new ForgotScenario("","xxx","xxx","xxx","xxx","xxx","xxx"))

                .forgotAssertion.isLackofFirstName();

    }

    @Test(priority = 3)
    public void shouldNotLogInIfLackOfLastName() {

        indexPage.run(new ForgotScenario("xxx","","xxx","xxx","xxx","xxx","xxx"))


                .forgotAssertion.isLackofLastName();

    }

    @Test(priority = 4)
    public void shouldNotLogInIfLackOfAddress() {
        indexPage.run(new ForgotScenario("xxx","xxx","","xxx","xxx","xxx","xxx"))

                .forgotAssertion.isLackofAddress();

    }

    @Test(priority = 5)
    public void shouldNotLogInIfLackOfCity() {
        indexPage.run(new ForgotScenario("xxx","xxx","xxx","","xxx","xxx","xxx"))

                .forgotAssertion.isLackofCity();

    }

    @Test(priority = 6)
    public void shouldNotLogInIfLackOfState() {
        indexPage.run(new ForgotScenario("xxx","xxx","xxx","xxx","","xxx","xxx"))

                .forgotAssertion.isLackofState();

    }

    @Test(priority = 7)
    public void shouldNotLogInIfLackOfZip() {
        indexPage.run(new ForgotScenario("xxx","xxx","xxx","xxx","xxx","","xxx"))

                .forgotAssertion.isLackofZip();

    }

    @Test(priority = 8)

    public void shouldNotLogInIfLackOfSnn() {
        indexPage.run(new ForgotScenario("xxx","xxx","xxx","xxx","xxx","xxx",""))

                .forgotAssertion.isLackofSnn();

    }
}
