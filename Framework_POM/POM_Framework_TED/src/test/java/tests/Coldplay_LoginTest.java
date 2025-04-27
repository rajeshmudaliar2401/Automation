package tests;

import org.testng.annotations.Test;
import pages.ColdPlay_LoginPage;

public class Coldplay_LoginTest extends BaseTest {

    @Test
    public void Verified_That_Users_Has_Successfully_Logged_In_Coldplay() {
        // Initialize the Coldplay Login page
        ColdPlay_LoginPage coldplayLoginPage = new ColdPlay_LoginPage(driver);

        // Call the login method with the email from your properties file
        coldplayLoginPage.loginWithEmail(properties.getProperty("validEmail"));

        // Optional: You can add verification steps here to check if login was successful
    }
}