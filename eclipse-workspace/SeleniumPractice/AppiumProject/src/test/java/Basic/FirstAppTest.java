package Basic;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class FirstAppTest {
	static AppiumDriver driver;

	public static void main(String[] args) throws MalformedURLException {
		
		MutableCapabilities caps = new MutableCapabilities();

        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:platformVersion", "16");
        caps.setCapability("appium:deviceName", "emulator-5554");
        caps.setCapability("appium:udid", "emulator-5554");
        caps.setCapability("appium:automationName", "UiAutomator2");

        caps.setCapability("appium:appPackage", "org.simple.clinic.staging");
        caps.setCapability("appium:appActivity", "org.simple.clinic.main.TheActivity");
        
        // Appium 2 default URL (no /wd/hub)
        URL url = new URL("http://127.0.0.1:4723/");

        driver = new AndroidDriver(url, caps);

        System.out.println("Test started successfully!");
	}

}
