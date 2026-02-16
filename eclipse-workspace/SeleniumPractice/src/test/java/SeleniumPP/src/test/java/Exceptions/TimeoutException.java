package Exceptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TimeoutException {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        
        driver.get("https://sparklecartonline.com/");
        driver.manage().window().maximize();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Arpit")));
        		System.out.println(element.getText());
        		driver.quit();

	}

}
