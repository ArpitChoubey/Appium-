package Basic;

import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class SwipeUsingTouchAction {

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
            options.setAppPackage("com.example.app");
            options.setAppActivity("com.example.app.MainActivity");

            // -------------------------------------------------
            // 3️⃣ Create Android Driver
            // -------------------------------------------------
            AndroidDriver driver = new AndroidDriver(url, options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // -------------------------------------------------
            // 4️⃣ Create Finger Pointer (W3C Touch Action)
            // -------------------------------------------------
            PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

            // -------------------------------------------------
            // 5️⃣ Create Swipe Gesture (Bottom → Top)
            // -------------------------------------------------
            Sequence swipe = new Sequence(finger, 1);

            // Move finger to start position
            swipe.addAction(finger.createPointerMove(
                    Duration.ZERO,
                    PointerInput.Origin.viewport(),
                    100, 600));

            // Finger touch down
            swipe.addAction(finger.createPointerDown(
                    PointerInput.MouseButton.LEFT.asArg()));

            // Move finger to end position
            swipe.addAction(finger.createPointerMove(
                    Duration.ofMillis(800),
                    PointerInput.Origin.viewport(),
                    100, 100));

            // Finger lift up
            swipe.addAction(finger.createPointerUp(
                    PointerInput.MouseButton.LEFT.asArg()));

            // -------------------------------------------------
            // 6️⃣ Perform Swipe
            // -------------------------------------------------
            driver.perform(Arrays.asList(swipe));

            System.out.println("✅ Swipe performed successfully using W3C Actions");

            // -------------------------------------------------
            // Close Session
            // -------------------------------------------------
            driver.quit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

