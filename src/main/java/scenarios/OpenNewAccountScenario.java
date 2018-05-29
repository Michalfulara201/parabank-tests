package scenarios;

import pages.AccountOpenedInPage;
import pages.MenuPage;

public class OpenNewAccountScenario implements Scenario<MenuPage, AccountOpenedInPage> {

    private String typeOfAccount;
    private String AccountId;

    public OpenNewAccountScenario(String typeOfAccount, String accountId) {
        this.typeOfAccount = typeOfAccount;
        this.AccountId = accountId;
    }

 ;



    @Override

    public AccountOpenedInPage run(MenuPage entry) {
        return entry.clickNewAccountLink()
                .menu.clickNewAccountLink()
                .selectTypeValue(typeOfAccount)
                .selectValueToTransfer(AccountId)
                .clickSubmitButton();




    }
}
