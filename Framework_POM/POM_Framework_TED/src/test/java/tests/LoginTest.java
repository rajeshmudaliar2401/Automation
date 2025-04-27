package tests;

import org.testng.annotations.Test;
import pages.TED_LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void Verified_That_Users_Has_Successfully_Logged_In_TED() {
        TED_LoginPage loginPage = new TED_LoginPage(driver);
        loginPage.loginToTed(properties.getProperty("validEmail"), properties.getProperty("validPassword"));
        // You can add assertion here after login
    }
}
