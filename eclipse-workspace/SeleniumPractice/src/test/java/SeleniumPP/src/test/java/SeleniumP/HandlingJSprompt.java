package SeleniumP;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingJSprompt {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();

		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
Alert myalert = driver.switchTo().alert();
		
		String Str = myalert.getText();
		
		 System.out.println(Str);
		
		myalert.sendKeys("Arpit Choubey");
		
		myalert.accept();
		
String test = driver.findElement(By.id("result")).getText();
		
		System.out.println(test);

	}

}
