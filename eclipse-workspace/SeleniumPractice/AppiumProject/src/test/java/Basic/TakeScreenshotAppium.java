package Basic;

import java.io.File;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class TakeScreenshotAppium {

    public static void main(String[] args) {

        try {
            // -------------------------------------------------
            // 1️⃣ Appium Server URL
            // -------------------------------------------------
            URL url = new URL("http://127.0.0.1:4723/");

            // -------------------------------------------------
            // 2️⃣ Desired Capabilities (UiAutomator2Options)
            // -------------------------------------------------
            UiAutomator2Options options = new UiAutomator2Options();
            options.setDeviceName("Arpit");
            options.setPlatformName("Android");
            options.setPlatformVersion("13.0");
            options.setUdid("1398796045001TA");
            options.setAutomationName("UiAutomator2");
            options.setApp("C:\\Apps\\demo.apk"); // update if needed

            // -------------------------------------------------
            // 3️⃣ Create Android Driver
            // -------------------------------------------------
            AndroidDriver driver = new AndroidDriver(url, options);

            // -------------------------------------------------
            // 4️⃣ Take Screenshot
            // -------------------------------------------------
            File srcFile = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.FILE);

            File destFile = new File("screenshots/homepage.png");
            FileUtils.copyFile(srcFile, destFile);

            System.out.println("✅ Screenshot captured successfully!");

            // -------------------------------------------------
            // Close Session
            // -------------------------------------------------
            driver.quit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

