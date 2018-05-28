import org.testng.annotations.*;

import pages.AccountInPage;
import scenarios.LoginScenario;
import scenarios.OpenNewAccountScenario;

public class AccountTests extends MainTest {

    private AccountInPage accountPage;


    @BeforeMethod
    @Parameters({"login","password"})
    public void prepare(String login,String password){
        accountPage = indexPage.run(new LoginScenario(login,password));
    }

    @Test(priority = 1)

    public void shouldAddAccountWithSavingsOption() {
        accountPage.menu.clickNewAccountLink()
                .menu.run(new OpenNewAccountScenario("SAVINGS","13566"))
                .openAccountAssertion.accountOpenedConfirmation();


    }
    @Test (priority = 2)
    public void shouldAddAccountWithCheckingOption(){
        accountPage.menu.clickNewAccountLink()
                .menu.run(new OpenNewAccountScenario("CHECKING","13566"))
                .openAccountAssertion.accountOpenedConfirmation();
    }

}
