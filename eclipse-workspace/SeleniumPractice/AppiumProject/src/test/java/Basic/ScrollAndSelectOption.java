package Basic;


import java.net.URL;
import java.time.Duration;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class ScrollAndSelectOption {

	public static void main(String[] args) throws Throwable {
		
		// Appium Server URL
        URL url = new URL("http://127.0.0.1:4723/");

        // Appium Options
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Arpit");
        options.setPlatformName("Android");
        options.setPlatformVersion("13.0");
        options.setUdid("1398796045001TA");
        options.setAppPackage("io.appium.android.apis");
        options.setAppActivity("io.appium.android.apis.ApiDemos");

        // Android Driver
        AndroidDriver driver = new AndroidDriver(url, options);

        // Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Step 1: Click on Views
        driver.findElement(
                AppiumBy.androidUIAutomator(
                        "new UiSelector().text(\"Views\")"))
                .click();

        // Step 2: Scroll and click on Lists
        driver.findElement(
                AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true))"
                                + ".scrollIntoView(new UiSelector().text(\"Lists\"))"))
                .click();

        // Step 3: Scroll and click on 17. Activate items
        driver.findElement(
                AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true))"
                                + ".scrollIntoView(new UiSelector().text(\"17. Activate items\"))"))
                .click();

        // Step 4: Scroll and click on Blue
        driver.findElement(
                AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true))"
                                + ".scrollIntoView(new UiSelector().text(\"Blue\"))"))
                .click();

        // Optional: Close app
        driver.quit();
		
		

	}

}
