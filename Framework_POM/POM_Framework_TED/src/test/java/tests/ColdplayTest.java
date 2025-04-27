package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ColdplayPage;

public class ColdplayTest extends BaseTest {

    @Test
    public void verifyThatUsersCanClickRepostButtonAndClosePopup() {
        // Initialize the ColdplayPage
        ColdplayPage coldplayPage = new ColdplayPage(driver);

        // Navigate to the page
        driver.get("https://coldplay.begenuin.com/home");

        // Wait for the page to load and ensure the URL contains 'home'
        coldplayPage.waitForUrlContains("home");

        // Click the "Repost" button
        coldplayPage.clickRepostButton();

        // Wait for the repost popup to appear and then close it
        coldplayPage.waitForVisibility(coldplayPage.getCloseButton());  // Use getter for closeButton
        coldplayPage.closeRepostPopup();

        // Optional: Add an assertion to confirm that after closing the popup,
        // we are back to the homepage or any other confirmation steps you'd like
        Assert.assertTrue(driver.getCurrentUrl().contains("home"), "URL does not contain 'home' after closing repost popup.");
    }

    @Test
    public void verifyThatUsersCanClickBecomeCreatorButtonAndVerifyText() {
        // Initialize the ColdplayPage
        ColdplayPage coldplayPage = new ColdplayPage(driver);

        // Navigate to the page
        driver.get("https://coldplay.begenuin.com/home");

        // Wait for the page to load and ensure the URL contains 'home'
        coldplayPage.waitForUrlContains("home");

        // Click the "Become a Creator" button
        coldplayPage.clickBecomeCreatorButton();

        // Wait for the "Become a Creator" text to appear
        String creatorText = coldplayPage.getBecomeCreatorText();

        // Assert that the text matches the expected value
        Assert.assertEquals(creatorText, "Become a Creator for coldplay", "Text does not match: Expected 'Become a Creator for coldplay', but got: " + creatorText);

        // Close the "Become a Creator" popup
        coldplayPage.closeRepostPopup();
    }
}