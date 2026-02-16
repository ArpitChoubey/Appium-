package SeleniumP;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpentheLinkInNewTab {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://sparklecartonline.com/");
		driver.manage().window().maximize();
		
		WebElement Contact = driver.findElement(By.xpath("//span[normalize-space()='Contact']"));
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL).click(Contact).keyUp(Keys.CONTROL).perform();
		
		List<String> ids = new ArrayList(driver.getWindowHandles());

		driver.switchTo().window(ids.get(1));
		
		driver.findElement(By.xpath("//input[@id='ContactForm-name']")).sendKeys("Arpit");
		
		driver.switchTo().window(ids.get(0));
		
		String Abc= driver.findElement(By.xpath("(//a[@id='CardLink-template--17654219276463__featured_collection_63exag-8112928391343'])[1]")).getText();
		
		System.out.println(Abc);

	}

}
