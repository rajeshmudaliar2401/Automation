package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BegenuinPage extends BasePage {

    // Locators for elements
    @FindBy(xpath = "//button[contains(text(),'Get App')]")
    private WebElement getAppButton;

    @FindBy(xpath = "//p[contains(text(),'Download app to browse more communities')]")
    private WebElement downloadHeader;

    @FindBy(xpath = "//button[@class='absolute right-3 top-3']//*[name()='svg']")
    private WebElement closeButton;

    @FindBy(xpath = "(//div[@title='Repost'])[1]")
    private WebElement repostButton;

    @FindBy(xpath = "//p[contains(text(),'Download app to repost the video.')]")
    private WebElement get_App_Header;

    @FindBy(xpath = "//button[@class='absolute right-3 top-3']//*[name()='svg']")
    private WebElement close_Button2;

    @FindBy(xpath = "//p[@class='w-64 overflow-hidden p-3 text-start text-body-1-bold']")
    private WebElement becomeCreatorButton;

    @FindBy(xpath = "(//p[@class='text-center text-title-1-bold'])[1]")
    private WebElement becomeCreatorText;

    @FindBy(xpath = "//button[@class='absolute right-4 top-4 outline-none']")
    private WebElement closeButton2;


    // Constructor
    public BegenuinPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);  // Initialize elements
    }

    // Method to click "Get App" button
    public void clickGetAppButton() {
        waitForClickability(getAppButton);
        getAppButton.click();
    }

    // Method to get the download header text
    public String getDownloadHeaderText() {
        waitForVisibility(downloadHeader);
        return downloadHeader.getText();
    }

    // Method to close the "Get App" popup
    public void clickCloseButton() {
        waitForClickability(closeButton);
        closeButton.click();
    }

    // Method to click the repost button
    public void clickRepostButton() {
        waitForClickability(repostButton);
        repostButton.click();
    }

    // Method to get the repost header text
    public String getRepostHeaderText() {
        waitForVisibility(get_App_Header);
        return get_App_Header.getText();
    }

    // Method to close the repost popup
    public void clickCloseRepostButton() {
        waitForClickability(close_Button2);
        close_Button2.click();
    }

    // Method to click "Become a Creator" button
    public void clickBecomeCreatorButton() {
        waitForClickability(becomeCreatorButton);
        becomeCreatorButton.click();
    }

    // Method to get "Become a Creator" text
    public String getBecomeCreatorText() {
        waitForVisibility(becomeCreatorText);
        return becomeCreatorText.getText();
    }

    // Method to close the "Become a Creator" popup
    public void clickCloseBecomeCreatorButton() {
        waitForClickability(closeButton2);
        closeButton2.click();
    }
}
