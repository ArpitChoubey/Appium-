package SeleniumP;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeout {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		//  driver.manage().setScriptTimeout(Duration.ofSeconds(10)); -- Depricated ===old method 
		
		driver.get("https://sparklecartonline.com/");                                                                                                  
		System.out.println(driver.getTitle());


}
}
