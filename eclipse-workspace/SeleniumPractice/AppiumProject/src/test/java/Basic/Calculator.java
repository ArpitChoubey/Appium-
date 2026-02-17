package Basic;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;



public class Calculator {

	public static  void main(String[] args) throws Exception {
		
		
		 URL url = new URL("http://127.0.0.1:4723/");

	        UiAutomator2Options options = new UiAutomator2Options();
	        options.setDeviceName("Arpit");
	        options.setPlatformName("Android");
	        options.setPlatformVersion("13.0");
	        options.setUdid("1398796045001TA");
	        options.setAppPackage("com.google.android.calculator");
	        options.setAppActivity("com.android.calculator2.Calculator");

	        AndroidDriver driver = new AndroidDriver(url, options);
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	        WebElement one = driver.findElement(By.id("com.google.android.calculator:id/digit_1"));
	        WebElement five = driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
	        WebElement seven = driver.findElement(By.id("com.google.android.calculator:id/digit_7"));
	        WebElement nine = driver.findElement(By.id("com.google.android.calculator:id/digit_9"));

	        WebElement plusSymbol = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
	        WebElement equalSymbol = driver.findElement(By.id("com.google.android.calculator:id/eq"));


	        // test case flow
	        one.click();
	        five.click();
	        nine.click();

	        plusSymbol.click();

	        seven.click();
	        
	        driver.quit();


	}

}
