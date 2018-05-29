package scenarios;

import pages.MainPage;
import pages.MenuPage;
import pages.TransferFinishedPage;

public class TransferFundsScenario implements Scenario<MenuPage, TransferFinishedPage>{

    private String amount;

    public TransferFundsScenario(String amount){
        this.amount = amount;
    }

    @Override
    public TransferFinishedPage run(MenuPage entry){
        return entry.clickTransferFundsButton()
                .inputAmountMoney(amount)
                .selectFromAccountDropDownList()
                .selectToAccountDropDownList()
                .clickTransferButton();
    }

}
