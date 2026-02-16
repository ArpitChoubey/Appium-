package Exceptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementClickInterceptedException {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://sparklecartonline.com/");
		driver.manage().window().maximize();

		// ❌ Click intercepted by popup/banner
		driver.findElement(By.linkText("Login")).click();

	}

}
