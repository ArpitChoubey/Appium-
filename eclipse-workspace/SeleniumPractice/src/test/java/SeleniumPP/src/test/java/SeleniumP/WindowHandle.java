package SeleniumP;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws Throwable {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String currentwindow = driver.getWindowHandle();
		
		System.out.println(currentwindow);
		Thread.sleep(8000);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Thread.sleep(8000);
		
		Set<String> window = driver.getWindowHandles();
		
		System.out.println(window);
		
		List<String> windowsList = new ArrayList<>(window); // Converting Set to List object 
		String window1 = windowsList.get(0);
		System.out.println(window1);

		String window2 = windowsList.get(1);
		System.out.println(window2);
		
		
		System.out.println(driver.getTitle());
		driver.switchTo().window(window2);
		System.out.println(driver.getTitle());
		
		// Approach 2 
		// for(String windowId : windows) {
		  //  driver.switchTo().window(windowId);
		  //  System.out.println(driver.getTitle());

		   //  if(driver.getTitle().equals("OrangeHRM")|| driver.getTitle().equals("testmessage12"))
		        driver.close();
		}
		
		
	}

}
