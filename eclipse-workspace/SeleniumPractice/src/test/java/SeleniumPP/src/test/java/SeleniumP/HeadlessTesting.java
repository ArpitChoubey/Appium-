package SeleniumP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new"); // setting for headless mode of execution
		
		WebDriver driver = new ChromeDriver(options);
        driver.get("https://sparklecartonline.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

	}

}
