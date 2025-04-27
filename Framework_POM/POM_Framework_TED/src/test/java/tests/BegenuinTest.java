package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BegenuinPage;

public class BegenuinTest extends BaseTest {

    @Test
    public void Verified_That_Users_Has_Successfully_Clicked_GetApp_Button() {
        BegenuinPage begenuinPage = new BegenuinPage(driver);

        // Click the "Get App" button
        begenuinPage.clickGetAppButton();

        // Get the text of the download header
        String downloadHeaderText = begenuinPage.getDownloadHeaderText();
        Assert.assertEquals(downloadHeaderText, "Download app to browse more communities", "Download header text does not match.");

        // Close the "Get App" popup
        begenuinPage.clickCloseButton();
    }

    @Test
    public void Verified_That_Users_Has_Successfully_Clicked_Repost_Button() {
        BegenuinPage begenuinPage = new BegenuinPage(driver);

        // Click the repost button
        begenuinPage.clickRepostButton();

        // Get the repost header text
        String repostHeaderText = begenuinPage.getRepostHeaderText();
        Assert.assertEquals(repostHeaderText, "Download app to repost the video.", "Repost header text does not match.");

        // Close the repost popup
        begenuinPage.clickCloseRepostButton();
    }

    @Test
    public void Verified_That_Users_Has_Successfully_Clicked_Become_Creator() {
        BegenuinPage begenuinPage = new BegenuinPage(driver);

        // Click the "Become a Creator" button
        begenuinPage.clickBecomeCreatorButton();

        // Get the "Become a Creator" text
        String creatorText = begenuinPage.getBecomeCreatorText();
        Assert.assertEquals(creatorText, "Become a Creator for BeGenuin", "Text does not match.");

        // Close the "Become a Creator" popup
        begenuinPage.clickCloseBecomeCreatorButton();
    }
}
