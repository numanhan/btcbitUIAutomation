package stepDefinitions;

import pages.LoginPage;
import drivers.Driver;
import io.cucumber.java.en.*;
public class LoginSteps {

    private LoginPage loginPage;

    @Given("The user is on the homepage for login")
    public void the_user_is_on_the_homepage() {
        loginPage = new LoginPage(Driver.getDriver());
        Driver.getDriver().get("https://btcbit.net/");
    }

    @When("The user clicks on login button")
    public void the_user_clicks_login_button(){
        loginPage.clickLogin();
    }

    @Then("The user inputs login credentials")
    public void the_user_input_credentials(){
        loginPage.inputLoginCredentials();
    }

    @Then("The user clicks on Sign In")
    public void the_user_clicks_signin(){
        loginPage.clickSignIn();
    }
    @Then("User verifies page text")
    public void verify_successful_login(){
        loginPage.successfullLogin();
    }
}
