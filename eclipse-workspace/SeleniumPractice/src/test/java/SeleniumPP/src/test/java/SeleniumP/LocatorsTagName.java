package SeleniumP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTagName {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://sparklecartonline.com/");
		
		//li & div
		
		List<WebElement> elements = driver.findElements(By.tagName("div"));
		int size = elements.size();
		System.out.println(size);

		
		List<WebElement> elements1 = driver.findElements(By.tagName("li"));
		int size1 = elements1.size();
		System.out.println(size1);
	}

}
