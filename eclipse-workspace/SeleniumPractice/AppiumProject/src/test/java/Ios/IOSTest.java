package Ios;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;

import static org.testng.Assert.assertTrue;

public class IOSTest {

    private IOSDriver driver;

    @BeforeMethod
    public void setUp() {
        IOSDriverManager.createIOSDriver();
        driver = IOSDriverManager.getDriver();
    }

    @Test
    public void verifyHomeScreenIsDisplayed() {

        boolean isHomeDisplayed = driver
                .findElement(AppiumBy.accessibilityId("Home"))
                .isDisplayed();

        assertTrue(isHomeDisplayed, "Home screen is NOT displayed");
    }

    @Test
    public void verifyLoginButtonIsVisible() {

        boolean isLoginButtonVisible = driver
                .findElement(AppiumBy.accessibilityId("Login"))
                .isDisplayed();

        assertTrue(isLoginButtonVisible, "Login button is NOT visible");
    }

    @AfterMethod
    public void tearDown() {
        IOSDriverManager.quitSession();
    }
}
