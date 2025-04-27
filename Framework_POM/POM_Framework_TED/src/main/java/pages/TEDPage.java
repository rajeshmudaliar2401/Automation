package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class TEDPage extends BasePage {

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
    private WebElement get_Repost_Header;

    @FindBy(xpath = "//button[@class='absolute right-3 top-3']//*[name()='svg']")
    private WebElement close_Button2;


    // Constructor
    public TEDPage(WebDriver driver) {
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

    // Method to close the popup
    public void clickCloseButton() {
        waitForClickability(closeButton);
        closeButton.click();
    }

    public void clickrepostButton() {
        waitForClickability(repostButton);
        repostButton.click();
    }

    public void get_Header_Repost() {
        waitForVisibility(get_Repost_Header);
        get_Repost_Header.getText();

    }
    public void closeButton() {
        waitForClickability(close_Button2);
        close_Button2.click();
    }
}
