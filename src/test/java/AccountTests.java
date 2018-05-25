import org.testng.annotations.Test;

import scenarios.LoginScenario;
import scenarios.OpenNewAccountScenario;

public class AccountTests extends MainTest {


    @Test(priority = 1)

    public void shouldAddAccountWithSavingsOption() {
        indexPage.run(new LoginScenario("xxx", "xxx"))
                .menu.run(new OpenNewAccountScenario("SAVINGS","13566"))
                .openAccountAssertion.accountOpenedConfirmation();


    }
    @Test (priority = 2)
    public void shouldAddAccountWithCheckingOption(){
        indexPage.run(new LoginScenario("xxx","xxx"))
                .menu.run(new OpenNewAccountScenario("CHECKING","13566"))
                .openAccountAssertion.accountOpenedConfirmation();
    }

}
