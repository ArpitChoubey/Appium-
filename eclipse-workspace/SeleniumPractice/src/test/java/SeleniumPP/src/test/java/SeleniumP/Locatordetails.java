package SeleniumP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatordetails {

	public static void main(String[] args) throws Exception {
		
	ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		String Ldetails = driver.findElement(By.id("login_credentials")).getText();
		System.out.println(Ldetails);
		
		String LPassword = driver.findElement(By.className("login_password")).getText();
		System.out.println(LPassword);
		
		System.out.println("---------------------------------------------------------------------------------------------");
		
		List<WebElement> list = driver.findElements(By.tagName("div"));
		
		for(WebElement x : list) {
			System.out.println(x.getText());
		}
		
		
		
		driver.close();
		
		

	}

}
