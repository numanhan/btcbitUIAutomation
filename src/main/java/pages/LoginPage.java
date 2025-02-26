package pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{

    private By loginButton = By.xpath("//a[contains(@class, 'header_login__VSWAE') and contains(@class, 'bg-black')]");
    private By emailInput = By.id("email");
    private By passwordInput = By.id("password");
    private By signInBtn = By.xpath("//button[contains(@class, 'btn-auth') and contains(@class, 'btn-auth--filled')]");
    private By verifyMessage = By.xpath("//div[contains(@class, 'bg-error')]");

    String pageText = "Verify your account for making transactions";


    public LoginPage(WebDriver driver) {
        super();
    }

    public void clickLogin() {
        click(driver.findElement(loginButton));
    }

    public void inputLoginCredentials(){
        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
        WebElement inputEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput));
        inputEmail.sendKeys("numanhanduran@gmail.com");

        WebElement inputPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput));
        inputPassword.sendKeys("Strong123???");

    }

    public void clickSignIn(){
        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
        WebElement signInButton = wait.until(ExpectedConditions.visibilityOfElementLocated(signInBtn));
        signInButton.click();
    }

    public void successfullLogin(){
        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
        String expectedText = wait.until(ExpectedConditions.visibilityOfElementLocated(verifyMessage)).getText();
        Assert.isTrue(Boolean.parseBoolean(pageText),expectedText);
    }

}
