package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static drivers.Driver.closeDriver;

public class ContactsPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor jsExecutor;

    private By pageTitle = By.xpath("//h1[contains(text(), 'Contacts')]");
    private By countryTitle = By.xpath("//h2[contains(text(), 'Poland')]");
    private By addressTitle = By.xpath("//h3[contains(text(),'BTCBIT Sp. z o.o. Ul. Gesia 8 - 205, 31-535Krakow, Poland']");
    private By regNumber = By.xpath("//h4[contains(text(),'Reg. Nr.']");


    public ContactsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.jsExecutor = (JavascriptExecutor) driver;
    }

    private void scrollPage(int pixels) {
        jsExecutor.executeScript("window.scrollBy(0, " + pixels + ");");
    }

    public boolean isPageTitleDisplayed() {
        scrollPage(300); 
        WebElement titleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle));
        return titleElement.isDisplayed();
    }

    public boolean isCountryTitleDisplayed() {
        WebElement country = wait.until(ExpectedConditions.visibilityOfElementLocated(countryTitle));
        return country.isDisplayed();
    }

    public boolean isAddressTitleDisplayed() {
        WebElement address = wait.until(ExpectedConditions.visibilityOfElementLocated(addressTitle));
        return address.isDisplayed();
    }

    public boolean isRegNumberDisplayed() {
        WebElement regNum = wait.until(ExpectedConditions.visibilityOfElementLocated(regNumber));
        return regNum.isDisplayed();
    }


    public void close_driver() {
        closeDriver();
    }
}
