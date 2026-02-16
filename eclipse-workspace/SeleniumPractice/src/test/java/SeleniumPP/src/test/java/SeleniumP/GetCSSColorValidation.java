package SeleniumP;

import java.awt.Color;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSColorValidation {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://sparklecartonline.com/pages/contact");
        driver.manage().window().maximize();
        
        WebElement Name = driver.findElement(By.id("ContactForm-name"));
        String rgba= Name.getCssValue("background-color");
        
        System.out.println(rgba);

    
      String numbers[] = rgba.replace("rgba(", "").replace(")", "").split(",");

      Color color = new Color(Integer.parseInt(numbers[0].trim()),
              Integer.parseInt(numbers[1].trim()),
              Integer.parseInt(numbers[2].trim()));
      
      String HexaD = Integer.toHexString(color.getRGB());
      System.out.println(HexaD.substring(2));
      
      driver.close();
      
	}

}
