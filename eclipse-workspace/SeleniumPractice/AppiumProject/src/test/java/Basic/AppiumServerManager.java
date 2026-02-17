package Basic;

import static io.appium.java_client.service.local.flags.GeneralServerFlag.LOG_LEVEL;
import static io.appium.java_client.service.local.flags.GeneralServerFlag.SESSION_OVERRIDE;

import java.io.File;
import java.time.Duration;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumServerManager {

    private static AppiumDriverLocalService service;

    // Get current Appium service
    public static AppiumDriverLocalService getService() {
        return service;
    }

    // Start Appium Server
    public static void startServer(String platformName) {

        if (service != null && service.isRunning()) {
            System.out.println("Appium Server is already running...");
            return;
        }

        AppiumServiceBuilder builder = new AppiumServiceBuilder()
                .withIPAddress("127.0.0.1")
                .usingPort(4723)
                .withArgument(SESSION_OVERRIDE)
                .withArgument(LOG_LEVEL, "info")
                .withTimeout(Duration.ofSeconds(30));

        // OPTIONAL but recommended on Windows
        builder.withAppiumJS(new File(
                "C:\\Users\\hi\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"
        ));

        if (platformName.equalsIgnoreCase("android")) {

            System.out.println("Starting Appium Server for ANDROID...");

        } else if (platformName.equalsIgnoreCase("ios")) {

            System.out.println("Starting Appium Server for IOS...");

        } else {
            throw new IllegalArgumentException("Invalid platform name: " + platformName);
        }

        service = AppiumDriverLocalService.buildService(builder);
        service.start();

        System.out.println("Appium Server started successfully...");
    }

    // Stop Appium Server
    public static void stopServer() {

        if (service != null && service.isRunning()) {
            service.stop();
            System.out.println("Appium Server stopped successfully...");
        } else {
            System.out.println("Appium Server is not running...");
        }
    }
}

