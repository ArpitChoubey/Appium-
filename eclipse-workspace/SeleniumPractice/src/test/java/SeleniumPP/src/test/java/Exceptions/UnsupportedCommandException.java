package Exceptions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class UnsupportedCommandException {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://sparklecartonline.com/");
        driver.manage().window().maximize();

        // ❌ Attempting DevTools command not supported by driver version
        DevTools devTools = ((ChromeDriver) driver).getDevTools();
        devTools.createSession();

        // Some DevTools commands may throw UnsupportedCommandException
        devTools.send(null); // UnsupportedCommandException

	}

}
