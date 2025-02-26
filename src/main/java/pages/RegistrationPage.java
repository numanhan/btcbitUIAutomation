package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistrationPage extends BasePage {
    private By getStartedButton = By.xpath("//a[contains(@class, 'header_signup__hsltv')]");
    private By emailInput = By.id("email");
    private By passwordInput = By.id("password");
    private  By passwordConfirm = By.id("confirmPassword");
    private By checkBoxAgreement = By.id("agreements");
    private By signupBtn = By.xpath("//button[text()='Sign up']");



    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void clickGetStarted() {
        click(driver.findElement(getStartedButton));
    }

    public void inputCredentials(){
        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
        WebElement inputEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput));
        inputEmail.sendKeys("numanhanduran@gmail.com");

        WebElement inputPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput));
        inputPassword.sendKeys("Strong123???");

        WebElement confirmPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordConfirm));
        confirmPassword.sendKeys("Strong123???");
    }

    public void acceptAgreement(){
        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
        WebElement agreementCheck = wait.until(ExpectedConditions.visibilityOfElementLocated(checkBoxAgreement));
        agreementCheck.click();
    }

    public void clickSignup(){
        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
        WebElement signupButton = wait.until(ExpectedConditions.visibilityOfElementLocated(signupBtn));
        signupButton.click();
    }

    public void closeDriver(){
        closeDriver();
    }
}