package SeleniumP;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTesting {

	public static void main(String[] args) {
		
		 String browser = "chrome";
		//Scanner sc = new Scanner(System.in);
		//String browser = sc.next();
		
		WebDriver driver;
		
		switch(browser.toUpperCase()) {
		case  "CHROME":
		
		driver = new ChromeDriver();
		break;
		case  "FireFox":
			
			driver = new FirefoxDriver();
			break;
		case  "Edge":
			
			driver = new EdgeDriver();
			break;
			default :
				driver = new ChromeDriver();
		}
		driver.get("https://sparklecartonline.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		String wurl = driver.getCurrentUrl();
		System.out.println(wurl);
		
		String wps = driver.getPageSource();
		System.out.println(wps);
		
	

	}

}
