package SeleniumP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);

		WebElement min_slider = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));

		System.out.println("Location of th emin slider:" + min_slider.getLocation());
		
		act.dragAndDropBy(min_slider,990, 2024).perform();
		
		WebElement max_slider = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));

		System.out.println("Location of th emin slider:" + max_slider.getLocation());
		
		act.dragAndDropBy(min_slider,970, 2024).perform();

	}

}
