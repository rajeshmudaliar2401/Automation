package tests;

import org.testng.annotations.Test;
import pages.TEDPage;
import org.testng.Assert;

public class TEDTest extends BaseTest {

    @Test
    public void Verified_That_Users_Has_Successfully_Verified_Get_App_Button() {
        TEDPage tedPage = new TEDPage(driver);

        // Click the "Get App" button
        tedPage.clickGetAppButton();

        // Get the text of the download header
        String downloadHeaderText = tedPage.getDownloadHeaderText();

        // Assert that the download header text matches the expected value
        Assert.assertEquals(downloadHeaderText, "Download app to browse more communities", "Download header text does not match.");

        // Close the popup
        tedPage.clickCloseButton();
    }

    @Test
    public void Verified_That_Users_Has_Successfully_Clicked_Repost_Button() {
        TEDPage tedPage = new TEDPage(driver);

        // Navigate to the page and click the "Repost" button
        tedPage.clickrepostButton();

        // Get the text of the download header after clicking repost
        String repostHeaderText = tedPage.getDownloadHeaderText();

        // Assert that the repost header text matches the expected value
        Assert.assertEquals(repostHeaderText, "Download app to repost the video.", "Repost header text does not match.");

        // Close the popup
        tedPage.closeButton();
    }
}
