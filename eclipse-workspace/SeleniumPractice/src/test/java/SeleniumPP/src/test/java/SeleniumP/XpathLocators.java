package SeleniumP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://sparklecartonline.com/pages/contact");
		
		WebElement Etext =driver.findElement(By.xpath("//*[text()='Contact']"));
		String Abc =Etext.getText();
		System.out.println(Abc);

	}

}
