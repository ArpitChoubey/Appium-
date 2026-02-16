package SeleniumP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) {
		  
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://sparklecartonline.com/");
		
		WebElement logo =driver.findElement(By.cssSelector(".rich-text__heading.rte.inline-richtext.h1.scroll-trigger.animate--slide-in"));
		boolean status = logo.isDisplayed();
		System.out.println(status);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://sparklecartonline.com/");
		
		WebElement BuyNow =  driver.findElement(By.className("shopify-payment-button__button shopify-payment-button__button--unbranded"));
		System.out.println(BuyNow.isEnabled());
		driver.close();
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://demo.nopcommerce.com/");

		driver.findElement(By.linkText("Register")).click();

		WebElement maleRadioButton = driver.findElement(By.id("gender-male"));
		System.out.println(maleRadioButton.isSelected());
		
		driver.quit();
	}

}
