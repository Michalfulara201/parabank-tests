package scenarios;

import pages.AccountInPage;
import pages.IndexPage;

public class LoginScenario implements Scenario<IndexPage, AccountInPage> {

    private String login;
    private String password;


    public LoginScenario(String login, String password) {
        this.login = login;
        this.password = password;
    }


    @Override
    public AccountInPage run(IndexPage entry) {
        return entry.openParabankMainPage()
                .setUserName(login)
                .setPassword(password)
                .clickLoginButton();
    }

}
