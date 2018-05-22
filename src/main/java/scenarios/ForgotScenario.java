package scenarios;

import pages.ForgotSuccessPage;
import pages.IndexPage;

public class ForgotScenario implements Scenario<IndexPage, ForgotSuccessPage>{

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String ssn;


    public ForgotScenario(String firstName, String lastName, String address, String city, String state, String zipCode, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.ssn = ssn;
    }

    @Override

    public ForgotSuccessPage run(IndexPage entry){
        return entry.openParabankMainPage()
                .clickForgotPasswordLink()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setAddress(address)
                .setCity(city)
                .setState(state)
                .setZip(zipCode)
                .setSnn(ssn)
                .clickOnFindMyLoginInfo();
    }
}
