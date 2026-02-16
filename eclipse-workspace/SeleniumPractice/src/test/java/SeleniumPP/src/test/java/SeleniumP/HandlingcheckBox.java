package SeleniumP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingcheckBox {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();

		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://www.linkedin.com/");
		
		driver.findElement(By.linkText("Join now")).click();
		
		WebElement rememberME = driver.findElement(By.id("remember-me-checkbox"));
		
		System.out.println(rememberME.isSelected());
		
		rememberME.click();
		
		System.out.println(rememberME.isSelected());

	}

}
