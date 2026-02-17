package Basic;


import java.net.URL;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class HandlingSeekBar {

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

        // Create Android Driver
        AndroidDriver driver = new AndroidDriver(url, options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Click on Views
        driver.findElement(
                AppiumBy.androidUIAutomator("new UiSelector().text(\"Views\")"))
                .click();

        // Scroll and click Seek Bar
        driver.findElement(
                AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true))"
                                + ".scrollIntoView(new UiSelector().text(\"Seek Bar\"))"))
                .click();

        System.out.println("Seek Bar option is selected");

        // Locate Seek Bar
        WebElement seekBar = driver.findElement(
                By.id("io.appium.android.apis:id/seek"));

        // Touch Action for Seek Bar
        TouchAction action = new TouchAction(driver);

        action.longPress(
                    LongPressOptions.longPressOptions()
                            .withElement(ElementOption.element(seekBar))
                            .withDuration(Duration.ofSeconds(2)))
              .moveTo(PointOption.point(864, 254))   // coordinates from screenshot
              .release()
              .perform();

        System.out.println("Seek Bar value changed successfully");

	}

}
