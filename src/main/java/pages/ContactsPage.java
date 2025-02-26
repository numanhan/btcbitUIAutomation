package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContactsPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By pageTitle = By.xpath("//h1[contains(text(), 'Contact Us')]");
    private By nameInput = By.name("name");
    private By emailInput = By.name("email");
    private By messageInput = By.name("message");
    private By submitButton = By.xpath("//button[contains(text(), 'Send Message')]");

    public ContactsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public boolean isPageTitleDisplayed() {
        WebElement titleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle));
        return titleElement.isDisplayed();
    }

    public boolean isNameInputDisplayed() {
        WebElement nameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(nameInput));
        return nameElement.isDisplayed();
    }

    public boolean isEmailInputDisplayed() {
        WebElement emailElement = wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput));
        return emailElement.isDisplayed();
    }

    public boolean isMessageInputDisplayed() {
        WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(messageInput));
        return messageElement.isDisplayed();
    }

    public boolean isSubmitButtonDisplayed() {
        WebElement submitElement = wait.until(ExpectedConditions.visibilityOfElementLocated(submitButton));
        return submitElement.isDisplayed();
    }
}