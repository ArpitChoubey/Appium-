package Exceptions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConnectionClosedException {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://sparklecartonline.com/");
        driver.manage().window().maximize();

        // ❌ Forcefully closing browser
        driver.quit();

        // ❌ Selenium tries to reuse a closed session
        driver.get("https://sparklecartonline.com/");

	}

}
