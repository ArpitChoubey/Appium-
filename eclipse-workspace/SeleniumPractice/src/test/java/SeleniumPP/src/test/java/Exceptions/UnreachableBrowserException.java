package Exceptions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnreachableBrowserException {

	public static void main(String[] args) throws IOException  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://sparklecartonline.com/");
		driver.manage().window().maximize();
		
		// ❌ Forcefully kill Chrome browser (Windows)
        Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");

        // ❌ Selenium tries to communicate with a dead browser
        driver.getTitle(); // UnreachableBrowserException

	}

}
