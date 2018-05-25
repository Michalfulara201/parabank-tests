package scenarios;

import pages.IndexPage;
import pages.RegisterPage;
import pages.RegistrationSuccessPage;

public class SignUpScenario implements Scenario<IndexPage, RegistrationSuccessPage> {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phone;
    private String ssn;
    private String userName;
    private String password;
    private String confirmationPassword;

    public SignUpScenario(String firstName, String lastName, String address, String city, String state, String zipCode, String phone, String ssn, String userName, String password, String confirmationPassword) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phone = phone;
        this.ssn = ssn;
        this.userName = userName;
        this.password = password;
        this.confirmationPassword = confirmationPassword;
    }


    @Override
    public RegistrationSuccessPage run(IndexPage entry) {
        return entry.openParabankMainPage()
                .clickRegisterLink()
                .firstNameField(firstName)
                .lastNameField(lastName)
                .addressField(address)
                .cityField(city)
                .stateField(state)
                .zipField(zipCode)
                .phoneField(phone)
                .ssnField(ssn)
                .userNameField(userName)
                .passwordField(password)
                .confirmationPasswordField(confirmationPassword)
                .clickRegisterButton();
    }
}
