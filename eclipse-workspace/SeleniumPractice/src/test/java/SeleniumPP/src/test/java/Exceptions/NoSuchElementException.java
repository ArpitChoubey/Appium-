package Exceptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElementException {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://sparklecartonline.com/");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.tagName("h4"));
        System.out.println(element.getText());

	}

}
