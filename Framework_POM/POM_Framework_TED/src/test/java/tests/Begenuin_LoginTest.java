package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Begenuin_LoginPage; // Import the correct page class

public class Begenuin_LoginTest extends BaseTest {

    @Test
    public void Verified_That_Users_Has_Successfully_Logged_In_Begenuin() {
        // Initialize the Begenuin Login page
        Begenuin_LoginPage begenuinLoginPage = new Begenuin_LoginPage(driver);

        // Call the login method with the email and password from your properties file
        begenuinLoginPage.loginToBegenuin(properties.getProperty("validEmail"), properties.getProperty("validPassword"));

        }
}
