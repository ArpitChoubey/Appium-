package Basic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class AppiumTest {

    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.APP, "/path/to/app.apk");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        // Create Android driver
        AndroidDriver driver =
                new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // Interact with app
        WebElement username = driver.findElement(By.id("com.example.app:id/username"));
        username.sendKeys("testuser");

        WebElement password = driver.findElement(By.id("com.example.app:id/password"));
        password.sendKeys("testpass");

        WebElement loginBtn = driver.findElement(By.id("com.example.app:id/login"));
        loginBtn.click();

        // Close app
        driver.quit();
    }
}

