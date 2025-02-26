package stepDefinitions;

import pages.ContactsPage;
import drivers.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class ContactSteps {
    private ContactsPage contactsPage;

    @Given("The user is on the Contact page")
    public void the_user_is_on_the_contact_page() {
        contactsPage = new ContactsPage(Driver.getDriver());
        Driver.getDriver().get("https://btcbit.net/contacts/");
    }

    @Then("The page title should be displayed")
    public void the_page_title_should_be_displayed() {
        Assert.assertTrue(contactsPage.isPageTitleDisplayed());
    }

    @Then("The name input field should be displayed")
    public void the_name_input_field_should_be_displayed() {
        Assert.assertTrue(contactsPage.isNameInputDisplayed());
    }

    @Then("The email input field should be displayed")
    public void the_email_input_field_should_be_displayed() {
        Assert.assertTrue(contactsPage.isEmailInputDisplayed());
    }

    @Then("The message input field should be displayed")
    public void the_message_input_field_should_be_displayed() {
        Assert.assertTrue(contactsPage.isMessageInputDisplayed());
    }

    @Then("The submit button should be displayed")
    public void the_submit_button_should_be_displayed() {
        Assert.assertTrue(contactsPage.isSubmitButtonDisplayed());
    }
}