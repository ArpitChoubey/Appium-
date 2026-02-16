package SeleniumP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getDOMpropertyExample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://sparklecartonline.com/pages/contact");
        driver.manage().window().maximize();
        
        WebElement Name = driver.findElement(By.id("ContactForm-name"));
        
        
        
        System.out.println(Name.getDomAttribute("name"));
        System.out.println(Name.getAttribute("name"));
        
        WebElement Phi =driver.findElement(By.id("ContactForm-phone"));
        System.out.println(Phi.getDomProperty("value placeholder"));
        
        driver.close();

	}

}
