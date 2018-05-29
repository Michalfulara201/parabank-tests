import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.AccountInPage;
import scenarios.LoginScenario;
import scenarios.TransferFundsScenario;

public class TransferFundsTests extends MainTest {

    private AccountInPage accountPage;


    @BeforeMethod
    @Parameters({"login","password"})
    public void prepare(String login,String password) {
        accountPage = indexPage.run(new LoginScenario(login, password));

    }
        @Test(priority = 1)
        public void shouldTransferFunds() {
            accountPage.menu.clickTransferFundsButton()
                    .menu.run(new TransferFundsScenario("200"))
                    .transferFundsAssertion.transferSuccessAssertion();

        }
    }

