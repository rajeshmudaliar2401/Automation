package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ColdplayPage extends BasePage {

    // Locators for elements
    @FindBy(xpath = "(//div[@title='Repost'])[1]")
    private WebElement repostButton;

    @FindBy(xpath = "//button[@class='absolute right-4 top-4 outline-none']")
    private WebElement closeButton;

    @FindBy(xpath = "//p[@class='w-64 overflow-hidden p-3 text-start text-body-1-bold']")
    private WebElement becomeCreatorButton;

    @FindBy(xpath = "(//p[@class='text-center text-title-1-bold'])[1]")
    private WebElement becomeCreatorText;

    // Constructor
    public ColdplayPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);  // Initialize elements
    }

    // Wait for visibility of an element
    public void waitForVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    // Wait for clickability of an element
    public void waitForClickability(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    // Wait for the URL to contain a specific partial URL
    public void waitForUrlContains(String partialUrl) {
        wait.until(ExpectedConditions.urlContains(partialUrl));
    }

    // Wait for specific text to appear in an element
    public void waitForTextPresent(WebElement element, String text) {
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    // Method to click the repost button
    public void clickRepostButton() {
        waitForClickability(repostButton);
        repostButton.click();
    }

    // Method to close the repost popup
    public void closeRepostPopup() {
        waitForClickability(closeButton);
        closeButton.click();
    }

    // Method to click the "Become a Creator" button
    public void clickBecomeCreatorButton() {
        waitForClickability(becomeCreatorButton);
        becomeCreatorButton.click();
    }

    // Method to get "Become a Creator" text
    public String getBecomeCreatorText() {
        waitForVisibility(becomeCreatorText);
        return becomeCreatorText.getText();
    }

    // Method to handle all steps for reposting and "Become a Creator" interaction
    public void interactWithRepostAndCreator() {
        // Step 1: Open the URL
        driver.get("https://coldplay.begenuin.com/home");

        // Wait for page to load and URL to contain 'home'
        waitForUrlContains("home");

        // Step 2: Click the repost button
        clickRepostButton();

        // Step 3: Wait for the repost popup and close it
        waitForVisibility(closeButton);
        closeRepostPopup();

        // Step 4: Click the "Become a Creator" button
        waitForClickability(becomeCreatorButton);
        clickBecomeCreatorButton();

        // Step 5: Verify the "Become a Creator" text
        String creatorText = getBecomeCreatorText();
        if (!creatorText.equals("Become a Creator for coldplay")) {
            throw new AssertionError("Text does not match: Expected 'Become a Creator for coldplay', but got: " + creatorText);
        }

        // Step 6: Close the "Become a Creator" popup
        closeRepostPopup();  // Reuse the same method for closing both popups
    }

    public WebElement getCloseButton() {
        return closeButton;
    }

}