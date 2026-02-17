package Basic;

import java.net.MalformedURLException;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;


public class HandlingSwitches {

	public static void main(String[] args) throws Exception {
		
		
		// Appium Server URL
        URL url = new URL("http://127.0.0.1:4723/");

        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Arpit");
        options.setPlatformName("Android");
        options.setPlatformVersion("13.0");
        options.setUdid("1398796045001TA");
        options.setAppPackage("io.appium.android.apis");
        options.setAppActivity("io.appium.android.apis.ApiDemos");

        // Driver Initialization
        AndroidDriver driver = new AndroidDriver(url, options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Click on Views
        driver.findElement(
                AppiumBy.androidUIAutomator("UiSelector().text(\"Views\")")
        ).click();

        // Scroll and click on Switches
        driver.findElement(
                AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true))"
                        + ".scrollIntoView(new UiSelector().text(\"Switches\"))")
        ).click();

        System.out.println("Switches option is selected");

        // =========================
        // Switch ON Standard switch
        // =========================
        WebElement standardSwitch =
                driver.findElement(AppiumBy.accessibilityId("Standard switch"));

        if (standardSwitch.isDisplayed()) {
            if (standardSwitch.getAttribute("checked").equals("false")) {
                standardSwitch.click();
                System.out.println("Standard switch is ON");
            }
        }

        // =========================
        // Switch OFF Default is on
        // =========================
        WebElement defaultOn =
                driver.findElement(AppiumBy.accessibilityId("Default is on"));

        if (defaultOn.isDisplayed()) {
            if (defaultOn.getAttribute("checked").equals("true")) {
                defaultOn.click();
                System.out.println("Default is ON switch is OFF");
            }
        }

        // Quit driver
        driver.quit();
		
		
		

	}

}
