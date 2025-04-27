package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Begenuin_LoginPage extends BasePage {

    // Locators for elements
    @FindBy(xpath = "//p[contains(text(),'More')]")
    private WebElement moreLink;

    @FindBy(xpath = "//p[contains(text(),'Terms and Conditions')]")
    private WebElement termsAndConditionsLink;

    @FindBy(xpath = "//button[contains(text(),'Confirm My Choices')]")
    private WebElement confirmChoicesButton;

    @FindBy(xpath = "//a[@href='https://auth.ted.com/users/new']")
    private WebElement signInLink;

    @FindBy(xpath = "//input[@name='username']")
    private WebElement emailInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement continueButton;

    @FindBy(xpath = "//input[@type='checkbox']")
    private List<WebElement> checkboxes;

    // Constructor
    public Begenuin_LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);  // Initialize elements
    }

    // Wait for visibility of an element
    public void waitForVisibility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Use Duration instead of an int
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    // Wait for clickability of an element
    public void waitForClickability(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    // Method to click on "More" link
    public void clickMore() {
        waitForClickability(moreLink);
        moreLink.click();
    }

    // Method to open "Terms and Conditions"
    public void openTermsAndConditions() {
        waitForClickability(termsAndConditionsLink);
        termsAndConditionsLink.click();
    }

    // Method to confirm choices
    public void confirmChoices() {
        waitForClickability(confirmChoicesButton);
        confirmChoicesButton.click();
    }

    // Method to click on "Sign In" link
    public void clickSignIn() {
        waitForClickability(signInLink);
        signInLink.click();
    }

    // Method to enter email
    public void enterEmail(String email) {
        waitForVisibility(emailInput);
        emailInput.sendKeys(email);
    }

    // Method to submit email
    public void submitEmail() {
        waitForClickability(submitButton);
        submitButton.click();
    }

    // Method to enter password
    public void enterPassword(String password) {
        waitForVisibility(passwordInput);
        passwordInput.sendKeys(password);
    }

    // Method to click on continue
    public void clickContinue() {
        waitForClickability(continueButton);
        continueButton.click();
    }

    // Method to handle login with Begenuin
    public void loginToBegenuin(String email, String password) {
        // Step 1: Click "More" link
        clickMore();

        // Step 2: Open Terms and Conditions
        openTermsAndConditions();

        // Step 3: Confirm choices
        confirmChoices();

        // Step 4: Click Sign In
        clickSignIn();

        // Step 5: Switch to the new window (pop-up for login)
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentWindow = it.next(); // Parent window
        String childWindow = it.next(); // Child window (login pop-up)

        // Switch to the child window (login pop-up)
        driver.switchTo().window(childWindow);

        // Step 6: Wait for email input field and enter email
        WebElement emailField = driver.findElement(By.xpath("//input[@id='loginEmail']"));
        waitForVisibility(emailField);
        emailField.sendKeys(email);

        // Step 7: Wait for password input field and enter password
        WebElement passwordField = driver.findElement(By.xpath("//input[@type='password']"));
        waitForVisibility(passwordField);
        passwordField.sendKeys(password);

        // Step 8: Click submit button
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        waitForClickability(submitButton);
        submitButton.click();

        // Step 9: Switch back to the parent window (optional)
        driver.switchTo().window(parentWindow);
    }
}
