package Basic;


import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;

public class HandlingRadioBtnCheckbox {

	public static void main(String[] args) throws Exception {
		
		
		// Appium Server URL
        URL url = new URL("http://127.0.0.1:4723/");

        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Arpit");
        options.setPlatformName("Android");
        options.setPlatformVersion("13.0");
        options.setUdid("1398796045001A");
        options.setAppPackage("io.appium.android.apis");
        options.setAppActivity("io.appium.android.apis.ApiDemos");

        // Driver initialization
        AndroidDriver driver = new AndroidDriver(url, options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Click on Views
        driver.findElement(
                AppiumBy.androidUIAutomator(
                        "UiSelector().text(\"Views\")"))
                .click();

        // Scroll and click Radio Group
        driver.findElement(
                AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true))"
                                + ".scrollIntoView(new UiSelector().text(\"Radio Group\"))"))
                .click();
        System.out.println("Radio Group option is selected");

        // Select Dinner radio button
        WebElement dinnerRadioBtn =
                driver.findElement(AppiumBy.accessibilityId("Dinner"));
        dinnerRadioBtn.click();
        System.out.println("Dinner radio button is selected");

        // Press BACK button
        driver.pressKey(new KeyEvent(AndroidKey.BACK));

        // Scroll and select System UI Visibility
        driver.findElement(
                AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true))"
                                + ".scrollIntoView(new UiSelector().text(\"System UI Visibility\"))"))
                .click();
        System.out.println("System UI Visibility option is selected");

        // Scroll and select System UI Modes
        driver.findElement(
                AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true))"
                                + ".scrollIntoView(new UiSelector().text(\"System UI Modes\"))"))
                .click();
        System.out.println("System UI Modes option is selected");

        // Select LOW_PROFILE checkbox (XPath from screenshot)
        WebElement lowProfileCheckbox =
                driver.findElement(By.xpath("//android.widget.CheckBox[@content-desc=\"LOW_PROFILE\"]"));
        lowProfileCheckbox.click();
        System.out.println("LOW PROFILE check box is selected");

        // Select FULLSCREEN checkbox
        WebElement fullScreenCheckbox =
                driver.findElement(By.xpath("//android.widget.CheckBox[@content-desc=\"FULLSCREEN\"]"));
        fullScreenCheckbox.click();
        System.out.println("FULL SCREEN check box is selected");

        // Select Action Mode checkbox
        WebElement actionModeCheckbox =
                driver.findElement(By.xpath("//android.widget.CheckBox[@content-desc=\"Action Mode\"]"));
        actionModeCheckbox.click();
        System.out.println("Action Mode check box is selected");

        // Quit driver
        driver.quit();

	}

}
