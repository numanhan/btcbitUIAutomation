package stepDefinitions;

import pages.RegistrationPage;
import drivers.Driver;
import io.cucumber.java.en.*;

public class RegistrationSteps {
    private RegistrationPage registrationPage;

    @Given("The user is on the homepage")
    public void the_user_is_on_the_homepage() {
        registrationPage = new RegistrationPage(Driver.getDriver());
        Driver.getDriver().get("https://btcbit.net/");
    }

    @When("The user clicks on the {string} button")
    public void the_user_clicks_on_the_button(String buttonText) {
        registrationPage.clickGetStarted();
    }

    @When("The user fill the credentials")
    public void the_user_fill_the_credentials() {
        registrationPage.inputCredentials();
    }

    @And("The user clicks on agreement")
    public void the_user_accepts_agreement(){
        registrationPage.acceptAgreement();
    }

    @Then("The user clicks signup button")
        public void the_user_signedup(){
            registrationPage.clickSignup();
            Driver.closeDriver();
        }

}
