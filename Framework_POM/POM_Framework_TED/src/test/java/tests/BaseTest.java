package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    protected WebDriver driver;
    protected Properties properties;

    @BeforeMethod
    public void setup() throws IOException {
        properties = new Properties();
        FileInputStream file = new FileInputStream("src/main/resources/config.properties");
        properties.load(file);
        driver = DriverFactory.initializeDriver();
//        driver.get(properties.getProperty("baseurlted"));
//        driver.get(properties.getProperty("baseUrlbegenuin"));
        driver.get(properties.getProperty("baseUrlcoldplay"));
    }

    @AfterMethod
    public void teardown() {
        DriverFactory.quitDriver();
    }
}
