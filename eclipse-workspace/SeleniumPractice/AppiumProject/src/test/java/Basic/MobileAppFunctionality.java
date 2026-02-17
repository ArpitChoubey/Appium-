package Basic;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;


import java.io.File;

import java.net.URL;
import java.time.Duration;

public class MobileAppFunctionality {

	public static void main(String[] args) throws Throwable {
		
		// Appium Server URL
        URL url = new URL("http://127.0.0.1:4723/");

        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setUdid("1398796045001TA");   // your device id
        options.setAutomationName("UiAutomator2");

        // Create Android Driver
        AndroidDriver driver = new AndroidDriver(url, options);

        // App details
        File app = new File("./AppiumProject/src/test/java/MobileApp/ApiDemos-debug (1).apk");
        String appPackage = "io.appium.android.apis";

        // 1️⃣ Check App State (Before Install)
        System.out.println("Initial App State : " + driver.queryAppState(appPackage));
        // Expected: NOT_INSTALLED

        // 2️⃣ Install the App
        driver.installApp(app.getAbsolutePath());
        System.out.println("Application Installed");

        // 3️⃣ Check App State (After Install)
        System.out.println("After Install State : " + driver.queryAppState(appPackage));
        // Expected: NOT_RUNNING

        Thread.sleep(3000);

        // 4️⃣ Launch / Activate the App
        driver.activateApp(appPackage);
        System.out.println("Application is opened");

        // 5️⃣ Check App State (Foreground)
        System.out.println("Running State : " + driver.queryAppState(appPackage));
        // Expected: RUNNING_IN_FOREGROUND

        Thread.sleep(3000);

        // 6️⃣ Run App in Background
        driver.runAppInBackground(Duration.ofSeconds(5));
        System.out.println("Application sent to background");

        Thread.sleep(3000);

        // 7️⃣ Close / Terminate the App
        driver.terminateApp(appPackage);
        System.out.println("Application is closed");

        // 8️⃣ Check App State (After Close)
        System.out.println("After Close State : " + driver.queryAppState(appPackage));
        // Expected: NOT_RUNNING

        // 9️⃣ Uninstall the App
        driver.removeApp(appPackage);
        System.out.println("Application is uninstalled");

        // Quit Driver
        driver.quit();
		
		
		

	}

}
