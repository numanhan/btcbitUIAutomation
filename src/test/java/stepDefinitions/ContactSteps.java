package stepDefinitions;

import pages.ContactsPage;
import drivers.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class ContactSteps {
    private ContactsPage contactsPage;
    private Driver driver;

    @Given("The user is on the Contact page")
    public void the_user_is_on_the_contact_page() {
        contactsPage = new ContactsPage(Driver.getDriver());
        Driver.getDriver().get("https://btcbit.net/contacts/");
    }

    @Then("The page title should be displayed")
    public void the_page_title_should_be_displayed() {
        Assert.assertTrue(contactsPage.isPageTitleDisplayed());
    }

    @Then("The country field should be displayed")
    public void the_name_input_field_should_be_displayed() {
        Assert.assertTrue(contactsPage.isCountryTitleDisplayed());
    }

    @Then("The address field should be displayed")
    public void the_email_input_field_should_be_displayed() {
        Assert.assertTrue(contactsPage.isAddressTitleDisplayed());
    }

    @Then("The Reg. Number should be displayed")
    public void the_message_input_field_should_be_displayed() {
        Assert.assertTrue(contactsPage.isRegNumberDisplayed());
    }

    @Then("Close the driver")
    public void close_the_driver(){
        driver.closeDriver();
    }

}