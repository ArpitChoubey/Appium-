package SeleniumP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Locators2 {

	public static void main(String[] args) throws Throwable  {
		
		//ChromeDriver driver = new ChromeDriver();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize(); //Maximize

		WebElement searchBox = driver.findElement(By.name("search"));
		searchBox.sendKeys("phone");
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(10000);

		WebElement magnifyingGlass = driver.findElement(By.className("fa-solid"));
		magnifyingGlass.click();

		WebElement phoneDescription = driver.findElement(By.className("description"));
		String phoneText = phoneDescription.getText();
		System.out.println(phoneText);

		WebElement phonePrice = driver.findElement(By.className("price"));
		
		WebElement camerasElement = driver.findElement(By.linkText("Cameras"));
		camerasElement.click();

		List<WebElement> products = driver.findElements(By.className("description"));

		for (WebElement item : products) {
		    System.out.println(item.getText());
		}
         
		WebElement tabletElement = driver.findElement(By.partialLinkText("Table"));
		camerasElement.click();

	}

}
