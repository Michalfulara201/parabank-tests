import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import scenarios.LoginScenario;


public class LoginTests extends MainTest {





    @Test(priority = 1)

    public void shouldNotLoginWithWrongPassword() {


        indexPage.openParabankMainPage()
                .setUserName("xxx")
                .setPassword("bleble")
                .clickLoginButton()
                .loginAssertion.userNotLoginWithWrongPassword();

    }

    @Test(priority = 2)

    public void shouldLogin() {

                indexPage.run(new LoginScenario("xxx","xxx"))
                .loginAssertion.isUserLoggedin();



    }
    @Test(priority = 3)
    public void shouldLogOut(){
        indexPage.run(new LoginScenario("xxx","xxx"))
                .menu.clickLogOutLink();


    }

}