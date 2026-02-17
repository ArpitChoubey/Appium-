package Android;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class AppiumAndroidTest {

    public static AndroidDriver driver;

    public static void main(String[] args) {

        try {
            // -----------------------------
            // 1. Desired Capabilities
            // -----------------------------
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("deviceName", "Android Emulator");
            capabilities.setCapability("automationName", "UiAutomator2");
            capabilities.setCapability("appPackage", "com.example.app");
            capabilities.setCapability("appActivity", "com.example.app.MainActivity");

            // -----------------------------
            // 2. Initialize Android Driver
            // -----------------------------
            driver = new AndroidDriver(
                    new URL("http://127.0.0.1:4723/wd/hub"),
                    capabilities);

            // -----------------------------
            // 3. Implicit Wait
            // -----------------------------
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            // -----------------------------
            // 4. Interact with App
            // -----------------------------
            driver.findElement(By.id("com.example.app:id/username"))
                    .sendKeys("testuser");

            driver.findElement(By.id("com.example.app:id/password"))
                    .sendKeys("testpass");

            driver.findElement(By.id("com.example.app:id/login"))
                    .click();

            // -----------------------------
            // 5. Handle Android Dialog (NOT Selenium Alert)
            // -----------------------------
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Example: OK button on Android dialog
            WebElement okButton = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.id("android:id/button1")));

            String dialogText = driver
                    .findElement(By.id("android:id/message"))
                    .getText();

            System.out.println("Dialog Text: " + dialogText);

            okButton.click();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            // -----------------------------
            // 6. Close App
            // -----------------------------
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
