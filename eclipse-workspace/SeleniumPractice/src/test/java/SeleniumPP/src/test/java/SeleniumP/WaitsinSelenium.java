package SeleniumP;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class WaitsinSelenium {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://sparklecartonline.com/pages/contact");
		
		WebElement name = driver.findElement(By.cssSelector("#ContactForm-name"));
		name.sendKeys("Abhishek");
		
		WebElement Email = driver.findElement(By.cssSelector("#ContactForm-email"));
		Email.sendKeys("Abhishek123@gmail.com");
		
		
		// FluentWait declaration
		//Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		     //   .withTimeout(Duration.ofSeconds(60))
		      //  .pollingEvery(Duration.ofSeconds(10))
		      //  .ignoring(NoSuchElementException.class);
		

       // WebElement username1 = wait.until(new Function<WebDriver, WebElement>() {
        //  public WebElement apply(WebDriver driver) {
        //return driver.findElement(By.name("username"));
    }


	}

