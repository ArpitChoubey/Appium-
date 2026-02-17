package Basic;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class ScrollUsingExecuteScript {

    public static void main(String[] args) throws Throwable {

        try {
            // 1️⃣ Appium Server URL
            URL url = new URL("http://127.0.0.1:4723/");

            // 2️⃣ Capabilities
            UiAutomator2Options options = new UiAutomator2Options();
            options.setPlatformName("Android");
            options.setDeviceName("Android Emulator");
            options.setAutomationName("UiAutomator2");
            options.setBrowserName("Chrome");

            // 3️⃣ Driver initialization
            AppiumDriver driver = new AppiumDriver(url, options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // 4️⃣ Open website
            driver.get("https://example.com");

            // 5️⃣ Locate element
            WebElement element =
                    driver.findElement(By.xpath("//a[text()='About Us']"));

            // 6️⃣ Scroll using JavaScript
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", element);

            System.out.println("✅ Scroll executed successfully");

            driver.quit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

