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
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class TouchActionDemo {

    public static void main(String[] args) throws Exception {

        // -----------------------------
        // Appium Server URL
        // -----------------------------
        URL url = new URL("http://127.0.0.1:4723/");

        // -----------------------------
        // Desired Capabilities
        // -----------------------------
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Arpit");
        options.setPlatformName("Android");
        options.setPlatformVersion("13.0");
        options.setUdid("1398796045001TA");
        options.setAppPackage("io.appium.android.apis");
        options.setAppActivity("io.appium.android.apis.ApiDemos");

        // -----------------------------
        // Driver Initialization
        // -----------------------------
        AndroidDriver driver = new AndroidDriver(url, options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // -----------------------------
        // Create TouchAction object
        // -----------------------------
        TouchAction<?> touch = new TouchAction<>(driver);

        // -----------------------------
        // Tap on "Views"
        // -----------------------------
        WebElement views = driver.findElement(AppiumBy.accessibilityId("Views"));
        touch.tap(TapOptions.tapOptions()
                .withElement(ElementOption.element(views)))
                .perform();

        // -----------------------------
        // Tap on "Expandable Lists"
        // -----------------------------
        WebElement expandableLists =
                driver.findElement(AppiumBy.accessibilityId("Expandable Lists"));
        touch.tap(TapOptions.tapOptions()
                .withElement(ElementOption.element(expandableLists)))
                .perform();

        // -----------------------------
        // Tap on "1. Custom Adapter"
        // -----------------------------
        WebElement customAdapter =
                driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter"));
        touch.tap(TapOptions.tapOptions()
                .withElement(ElementOption.element(customAdapter)))
                .perform();

        // -----------------------------
        // Tap on "Dog Names"
        // -----------------------------
        WebElement dogNames =
                driver.findElement(By.xpath("//*[@text='Dog Names']"));
        touch.tap(TapOptions.tapOptions()
                .withElement(ElementOption.element(dogNames)))
                .perform();

        // -----------------------------
        // Long Press on "Bandit"
        // -----------------------------
        WebElement bandit =
                driver.findElement(By.xpath("//*[@text='Bandit']"));

        LongPressOptions longPress = new LongPressOptions()
                .withElement(ElementOption.element(bandit))
                .withDuration(Duration.ofSeconds(3));

        touch.longPress(longPress)
                .release()
                .perform();

        // -----------------------------
        // Click on "Sample action"
        // -----------------------------
        WebElement sampleAction =
                driver.findElement(By.xpath("//*[@text='Sample action']"));

        if (sampleAction.isDisplayed()) {
            sampleAction.click();
        }

        // -----------------------------
        // Quit Driver
        // -----------------------------
        driver.quit();
    }
}
