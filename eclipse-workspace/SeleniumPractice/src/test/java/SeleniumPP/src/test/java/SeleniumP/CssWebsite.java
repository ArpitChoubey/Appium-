package SeleniumP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssWebsite {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://sparklecartonline.com/pages/contact");
		
		WebElement name = driver.findElement(By.cssSelector("#ContactForm-name"));
		name.sendKeys("Abhishek");
		
		WebElement Email = driver.findElement(By.cssSelector("#ContactForm-email"));
		Email.sendKeys("Abhishek123@gmail.com");

		
		WebElement pnumber = driver.findElement(By.cssSelector("input[placeholder=\"Phone number\"]"));
		pnumber.sendKeys("9896756588");
		
		driver.navigate().to("https://demo.opencart.com/");

		List<WebElement> elements = driver.findElements(By.xpath("//a"));
		System.out.println(elements.size());

		for (WebElement ele : elements) {
		    System.out.println(ele.getText());
		}

		driver.close();
	
	}

}
