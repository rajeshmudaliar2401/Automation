package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class TED_LoginPage extends BasePage {

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

    public TED_LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickMore() {
        waitForClickability(moreLink);
        moreLink.click();
    }

    public void openTermsAndConditions() {
        waitForClickability(termsAndConditionsLink);
        termsAndConditionsLink.click();
    }

    public void confirmChoices() {
        waitForClickability(confirmChoicesButton);
        confirmChoicesButton.click();
    }

    public void clickSignIn() {
        waitForClickability(signInLink);
        signInLink.click();
    }

    public void enterEmail(String email) {
        waitForVisibility(emailInput);
        emailInput.sendKeys(email);
    }

    public void submitEmail() {
        waitForClickability(submitButton);
        submitButton.click();
    }

    public void enterPassword(String password) {
        waitForVisibility(passwordInput);
        passwordInput.sendKeys(password);
    }

    public void clickContinue() {
        waitForClickability(continueButton);
        continueButton.click();
    }

    public List<WebElement> getCheckboxes() {
        return checkboxes;
    }

    public void loginToTed(String email, String password) {
        clickMore();
        openTermsAndConditions();
        confirmChoices();
        clickSignIn();
        enterEmail(email);
        submitEmail();
        enterPassword(password);
        clickContinue();
    }
}
