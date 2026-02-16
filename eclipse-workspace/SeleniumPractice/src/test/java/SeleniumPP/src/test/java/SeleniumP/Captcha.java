package SeleniumP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Captcha {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
        
      
        
       driver.findElement(By.id("Form_getForm_subdomain")).sendKeys("JioN");
       
       driver.findElement(By.id("Form_getForm_Name")).sendKeys("JioNetwork");
       
       driver.findElement(By.id("Form_getForm_Email")).sendKeys("choubeyarpit963@gmail.com");
       
       driver.findElement(By.id("Form_getForm_Contact")).sendKeys("9827189890");
       
       driver.findElement(By.id("Form_getForm_Country")).sendKeys("India");
       
       driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
       
       Thread.sleep(5000);

       driver.findElement(By.cssSelector(".recaptcha-checkbox-checkmark")).click();
       
       driver.switchTo().defaultContent();
       
       driver.findElement(By.xpath("//input[@id='Form_getForm_action_submitForm']")).click();
       
       
       
       
       
       
       

	}

}
