package Basic;


import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;



public class DragAndDrop {

	public static void main(String[] args) throws Throwable {
		
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

        // Android Driver
        AndroidDriver driver = new AndroidDriver(url, options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Click on Views
        driver.findElement(
                AppiumBy.androidUIAutomator("UiSelector().text(\"Views\")"))
                .click();

        // Click on Drag and Drop
        driver.findElement(
                AppiumBy.androidUIAutomator("UiSelector().text(\"Drag and Drop\")"))
                .click();

        System.out.println("Drag and drop page is displayed");

        // Identify source and target elements
        WebElement firstElement =
                driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));

        WebElement secondElement =
                driver.findElement(By.id("io.appium.android.apis:id/drag_dot_2"));

        // Perform Drag and Drop
        AndroidTouchAction action = new AndroidTouchAction(driver);

        action.longPress(ElementOption.element(firstElement))
              .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
              .moveTo(ElementOption.element(secondElement))
              .release()
              .perform();

        System.out.println("Drag and drop performed successfully");

        // Close app
        driver.quit();
		
		
		

	}

}
