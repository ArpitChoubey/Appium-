package Exceptions;

import java.time.Duration;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidCookieDomainException {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open sparklecartonline.com
        driver.get("https://sparklecartonline.com/");
        driver.manage().window().maximize();

        // ❌ Cookie belongs to a DIFFERENT domain (google.com)
        Cookie cookie = new Cookie("testCookie", "12345", "google.com", "/", null);

        // This line will throw InvalidCookieDomainException
        driver.manage().addCookie(cookie);

        driver.quit();
	}

}
