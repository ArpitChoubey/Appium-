package SeleniumP;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeForTesting {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		
	     options.setBrowserVersion("145.0.7632.26");
		
		// options.setBinary("C:\\Users\\hi\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		// To remove Chrome browser is automatically controlled
		
		// options.setExperimentalOption("exclude Switches", new String[] {"enable-automation"});
		
		 
		
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://sparklecartonline.com/");

	}

}
