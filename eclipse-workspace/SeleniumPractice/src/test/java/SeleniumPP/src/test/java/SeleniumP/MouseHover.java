package SeleniumP;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement PointMe = driver.findElement(By.xpath("//button[normalize-space()='Point Me']"));
		
		WebElement laptops = driver.findElement(By.xpath("//a[normalize-space()='Laptops']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(PointMe).moveToElement(laptops).build().perform();

	}

}
