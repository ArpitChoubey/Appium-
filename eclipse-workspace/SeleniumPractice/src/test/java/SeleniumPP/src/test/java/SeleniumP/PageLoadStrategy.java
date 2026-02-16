package SeleniumP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageLoadStrategy {

	private static final org.openqa.selenium.PageLoadStrategy EAGER = null;
	private static final org.openqa.selenium.PageLoadStrategy NORMAL = null;

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		//options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://sparklecartonline.com/");

	}

}
