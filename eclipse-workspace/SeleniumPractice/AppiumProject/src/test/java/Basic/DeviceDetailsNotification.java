package Basic;

import java.net.URL;

import io.appium.java_client.android.AndroidBatteryInfo;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DeviceDetailsNotification {

	public static void main(String[] args) throws Exception {
		
		// Appium Server URL
        URL url = new URL("http://127.0.0.1:4723/");

        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Arpit");
        options.setPlatformName("Android");
        options.setPlatformVersion("13.0");
        options.setUdid("1398796045001TA");
        options.setAutomationName("UiAutomator2");

        // Create Android Driver
        AndroidDriver driver = new AndroidDriver(url, options);

        // ===============================
        // Get device time
        // ===============================
        String time = driver.getDeviceTime();
        System.out.println("Device Time : " + time);

        // ===============================
        // Get display density (DPI)
        // ===============================
        long density = driver.getDisplayDensity();
        System.out.println("Device Density : " + density);

        // ===============================
        // Get battery information
        // ===============================
        AndroidBatteryInfo batteryInfo = driver.getBatteryInfo();
        System.out.println("Device Battery Info : " + batteryInfo);

        // ===============================
        // Open notifications
        // ===============================
        driver.openNotifications();

        // ===============================
        // Get device orientation
        // ===============================
        System.out.println("Device Orientation : " + driver.getOrientation());

        // Quit driver
        driver.quit();
		
		
		

	}

}
