package Exceptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UnexpectedTagNameException {

	public static void main(String[] args) {
		
		
		 WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://sparklecartonline.com/");
	        driver.manage().window().maximize();

	        // ❌ This element is NOT a <select> dropdown
	        WebElement searchBox = driver.findElement(By.xpath("//input[@type='search']"));

	        // ❌ Selenium expects <select> but gets <input>
	        Select select = new Select(searchBox); // UnexpectedTagNameException
	        select.selectByVisibleText("Men");

	}

}
