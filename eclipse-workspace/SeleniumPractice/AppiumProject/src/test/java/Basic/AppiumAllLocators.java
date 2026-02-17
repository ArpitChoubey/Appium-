package Basic;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumAllLocators {

    public static void main(String[] args) {

        AndroidDriver driver = null;

        try {
            // -------------------------------------------------
            // 1️⃣ Appium Server URL
            // -------------------------------------------------
            URL url = new URL("http://127.0.0.1:4723/");

            // -------------------------------------------------
            // 2️⃣ UiAutomator2 Options (Appium 9)
            // -------------------------------------------------
            UiAutomator2Options options = new UiAutomator2Options();
            options.setDeviceName("Arpit");
            options.setPlatformName("Android");
            options.setPlatformVersion("13");
            options.setUdid("1398796045001TA");

            // Use ONE of the following (installed app preferred)
            options.setAppPackage("com.example.app");
            options.setAppActivity("com.example.app.MainActivity");
            // OR
            // options.setApp("C:\\Apps\\DemoApp.apk");

            // -------------------------------------------------
            // 3️⃣ Create Android Driver
            // -------------------------------------------------
            driver = new AndroidDriver(url, options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // -------------------------------------------------
            // 🔍 ANDROID LOCATORS
            // -------------------------------------------------

            // By ID (BEST)
            WebElement byId =
                    driver.findElement(By.id("com.example.app:id/loginButton"));

            // By Accessibility ID (VERY GOOD)
            WebElement byAccessibilityId =
                    driver.findElement(AppiumBy.accessibilityId("login_button"));

            // By Class Name (WEAK – avoid if possible)
            WebElement byClassName =
                    driver.findElement(By.className("android.widget.Button"));

            // By XPath (LAST OPTION)
            WebElement byXPath =
                    driver.findElement(By.xpath("//android.widget.Button[@text='Login']"));

            // Android UIAutomator (POWERFUL)
            WebElement byUiAutomator =
                    driver.findElement(AppiumBy.androidUIAutomator(
                            "new UiSelector().text(\"Login\")"));

            // -------------------------------------------------
            // ✅ DEMO ACTION
            // -------------------------------------------------
            byId.click();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
