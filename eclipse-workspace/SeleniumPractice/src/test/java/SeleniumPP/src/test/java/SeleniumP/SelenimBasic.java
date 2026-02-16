package SeleniumP;

import org.openqa.selenium.chrome.ChromeDriver;

public class SelenimBasic {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com");
	   
	         Thread.sleep(2000);
		
		driver.navigate().to("https://sparklecartonline.com/");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		
		
		//driver.get("https://www.selenium.dev/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		// driver.close();
		driver.quit();
		
	}

}
