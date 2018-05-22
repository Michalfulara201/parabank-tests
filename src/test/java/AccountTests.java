import org.testng.annotations.Test;

import scenarios.LoginScenario;

public class AccountTests extends MainTest {


    @Test(priority = 1)

    public void shouldAddAccount() {
        indexPage.run(new LoginScenario("xxx", "xxx"))
                .menu.clickNewAccountLink()
                .selectTypeValue("SAVINGS")
                .selectValueToTransfer("13566")
                .clickSubmitButton()
                .openAccountAssertion.accountOpenedConfirmation();


    }
    @Test (priority = 2)
    public void shouldAddAccountWithCheckingOption(){
        indexPage.run(new LoginScenario("xxx","xxx"))
                .menu.clickNewAccountLink()
                .selectTypeValue("CHECKING")
                .selectValueToTransfer("13566")
                .clickSubmitButton()
                .openAccountAssertion.accountOpenedConfirmation();
    }

}
