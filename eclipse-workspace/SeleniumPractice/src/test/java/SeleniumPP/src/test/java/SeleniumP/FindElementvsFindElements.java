package SeleniumP;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementvsFindElements {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-button")).click();
		
		String TextValue = driver.findElement(By.className("inventory_item_name")).getText();
		System.out.println(TextValue);
		
		driver.navigate().to("https://sparklecartonline.com/pages/contact");
		Thread.sleep(2000);
		
		driver.findElement(By.id("ContactForm-name")).sendKeys("Arpit");
		driver.findElement(By.id("ContactForm-email")).sendKeys("choubeyarpit963@gmail.com");
		driver.findElement(By.id("ContactForm-phone")).sendKeys("89888886544");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("ContactForm-body")).sendKeys("Hello How r u ? Looking for any product in website ");
		driver.findElement(By.className("button")).click();

	}

}
