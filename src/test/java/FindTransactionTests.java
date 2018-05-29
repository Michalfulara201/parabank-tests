import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.TransferFinishedPage;
import scenarios.LoginScenario;
import scenarios.OpenNewAccountScenario;
import scenarios.TransferFundsScenario;

public class FindTransactionTests extends MainTest {

    private String accountOfType = "SAVINGS";
    private String amount = "200";
    private String accountId = "18006";
    private TransferFinishedPage transferFinishedPage;

    @BeforeMethod
    @Parameters({"login", "password"})

    public void prepare(String login, String password) {
        transferFinishedPage = indexPage.run(new LoginScenario(login, password))
                .menu.run(new OpenNewAccountScenario(accountOfType, accountId))
                .menu.run(new TransferFundsScenario(amount));
    }

    @Test

    public void shouldFindTransactionByAmount() {
        transferFinishedPage.menu.clickFindTransactionsLink()
                .selectAccount()
                .inputFindByAmount(amount)
                .clickFindByAmountButton()
                .findTransactionAssertion.transactionResult();


    }

    @Test
    public void shouldFindTransactionByTransactionId() {

        transferFinishedPage.menu.clickFindTransactionsLink()
                .selectAccount()
                .inputFindById("15031")
                .clickFindByIdButton()
                .findTransactionAssertion.transactionResult();


    }

    @Test
    public void shouldFindTransactionByDate() {
        transferFinishedPage.menu.clickFindTransactionsLink()
                .selectAccount()
                .inputFindByDate("05-28-2018")
                .clickFindByDateButton()
                .findTransactionAssertion.transactionResult();

    }

    @Test
    public void shouldFindTransactionByRange() {
        transferFinishedPage.menu.clickFindTransactionsLink()
                .selectAccount()
                .inputFindByRange("04-28-2018","05-28-2018")
                .clickFindByRangeButton()

                .findTransactionAssertion.transactionResult();
    }
}


