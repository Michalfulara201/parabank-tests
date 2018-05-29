import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import scenarios.SignUpScenario;


public class SignUpTests extends MainTest {


    @Test

    public void shouldRegister() {

        indexPage.run(new SignUpScenario("xxx", "xxx", "xxx", "xxx", "xxx", "xxx"
                , "xxx", "xxx", "xxx", "xxx", "xxx"))

                .registerAssertion.isUserLoggedin();

    }


    @Test

    public void shouldNotRegisterIfUserExist() {

        indexPage.run(new SignUpScenario("xxx", "xxx", "xxx", "xxx", "xxx", "xxx"
                , "xxx", "xxx", "xxx", "xxx", "xxx"))
                .registerAssertion.isUserRegistered();

    }

    @Test

    public void shouldNotRegisterIfLackofConfirmationPassword() {
        indexPage.run(new SignUpScenario("xxx", "xxx", "xxx", "xxx", "xxx", "xxx"
                , "xxx", "xxx", "xxx", "xxx", ""))
                .registerAssertion.isLackofConfirmationPassword();

    }

    @Test

    public void shouldNotRegisterIfLackofUserName() {

        indexPage.run(new SignUpScenario("xxx", "xxx", "xxx", "xxx", "xxx", "xxx"
                , "xxx", "xxx", "", "xxx", "xxx"))

                .registerAssertion.isLackofUserName();


    }

}

