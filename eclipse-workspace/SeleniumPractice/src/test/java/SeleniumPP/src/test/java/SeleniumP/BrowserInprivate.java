package SeleniumP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserInprivate {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		
	     options.addArguments("--incognito");
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://sparklecartonline.com/");
		
		//EdgeOptions option = new EdgeOptions();
		
	     //option.addArguments("--inprivate");
	     
	     //WebDriver driver = new EdgeDriver(option);
			//driver.get("https://sparklecartonline.com/");
		
		FirefoxOptions options1 = new FirefoxOptions();
		
	     options1.addArguments("--Private");
		
		
		WebDriver driver1 = new FirefoxDriver(options1);
		driver1.get("https://sparklecartonline.com/");
			

	}

}
