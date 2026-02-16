package SeleniumP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://sparklecartonline.com/pages/contact");
		
		WebElement phoneNumber =driver.findElement(By.xpath("//input[@id='ContactForm-phone']"));
		
		WebElement Name  = driver.findElement(RelativeLocator.with(By.tagName("input")).above(phoneNumber));
		Name.sendKeys("Arpit");
		
		WebElement Comment  = driver.findElement(RelativeLocator.with(By.tagName("textarea")).below(phoneNumber));
		Comment.sendKeys("Hello How r u");
		
		
		
		WebElement Trackorder = driver.findElement(By.xpath("//span[text()='Track Order']"));
		
		WebElement FAQ  = driver.findElement(RelativeLocator.with(By.tagName("span")).toLeftOf(Trackorder));
		String text = FAQ.getText();
		System.out.println(text);
		
		WebElement Contact  = driver.findElement(RelativeLocator.with(By.tagName("span")).toRightOf(Trackorder));
		String text1 = Contact.getText();
		System.out.println(text1);
		
		WebElement Home =driver.findElement(By.xpath("//span[text()='Home']"));
		
		WebElement element = driver.findElement(
		        RelativeLocator.with(By.tagName("span")).near(Home));

		System.out.println(element.getText());
		driver.close();
		
		

	}

}
