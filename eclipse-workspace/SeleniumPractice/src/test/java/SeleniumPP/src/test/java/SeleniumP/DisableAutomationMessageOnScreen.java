package SeleniumP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableAutomationMessageOnScreen {

	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
		// options.addArguments("--incognito");
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://sparklecartonline.com/");
        driver.manage().window().maximize();

	}

}
