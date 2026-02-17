package Ios;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;

public class IOSDriverManager {

    private static IOSDriver driver;

    private IOSDriverManager() {
        // Prevent object creation
    }

    public static void createIOSDriver() {

        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", "iOS");
            caps.setCapability("deviceName", "iPhone Simulator");
            caps.setCapability("platformVersion", "16.0"); // change if needed
            caps.setCapability("automationName", "XCUITest");
            caps.setCapability("bundleId", "org.reactjs.native.example.wdiodemoapp");
            caps.setCapability("noReset", true);

            driver = new IOSDriver(
                    new URL("http://127.0.0.1:4723/wd/hub"),
                    caps);

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        } catch (Exception e) {
            throw new RuntimeException("Failed to create iOS Driver", e);
        }
    }

    public static IOSDriver getDriver() {
        return driver;
    }

    public static void quitSession() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

	public static IOSDriver getDriver1() {
		// TODO Auto-generated method stub
		return null;
	}
}
