package SeleniumP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSValue {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://sparklecartonline.com/pages/contact");
        driver.manage().window().maximize();
        
        WebElement Name = driver.findElement(By.id("ContactForm-name"));
        System.out.println(Name.getCssValue("background-color"));
        System.out.println(Name.getCssValue("color"));
        System.out.println(Name.getCssValue("font-style"));
        System.out.println(Name.getCssValue("font-weight"));
        System.out.println(Name.getCssValue("font-size"));
        
        driver.quit();

	}

}
