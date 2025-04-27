package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ColdPlay_LoginPage extends BasePage {

    // Locators for elements
    @FindBy(xpath = "(//p[contains(text(),'Log in')])[1]")
    private WebElement login;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;

    // Constructor
    public ColdPlay_LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);  // Initialize elements
    }

    // Wait for visibility of an element
    public void waitForVisibility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    // Wait for clickability of an element
    public void waitForClickability(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    // Method to click on "Login" link
    public void clickLogin() {
        waitForClickability(login);
        login.click();
    }

    // Method to enter email
    public void enterEmail(String email) {
        waitForVisibility(emailInput);
        emailInput.sendKeys(email);
    }

    // Method to click submit button
    public void clickSubmit() {
        waitForClickability(submitButton);
        submitButton.click();
    }

    // Method to perform login using only email
    public void loginWithEmail(String email) {
        // Step 1: Click "Login"
        clickLogin();

        // Step 2: Enter email
        enterEmail(email);

        // Step 3: Click the submit button
        clickSubmit();
    }
}
