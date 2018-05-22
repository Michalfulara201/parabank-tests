package scenarios;

import pages.AccountOpenedPage;
import pages.MenuPage;
import pages.OpenNewAccountPage;

public class OpenNewAccountScenario implements Scenario<MenuPage, AccountOpenedPage> {

    private String typeOfAccount;
    private String AccountId;

    public OpenNewAccountScenario(String typeOfAccount, String accountId) {
        this.typeOfAccount = typeOfAccount;
        AccountId = accountId;
    }


    @Override

    public AccountOpenedPage run(MenuPage entry) {
        return entry.clickNewAccountLink()
                .menu.clickNewAccountLink()
                .selectTypeValue(typeOfAccount)
                .selectValueToTransfer(AccountId)
                .clickSubmitButton();




    }
}
