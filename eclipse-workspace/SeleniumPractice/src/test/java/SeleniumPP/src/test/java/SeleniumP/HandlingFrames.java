package SeleniumP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingFrames {

	public static void main(String[] args) {
		
		
WebDriver driver = new ChromeDriver();

		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		WebElement Frame =driver.findElement(By.xpath("//frameset[1]/frame[1]"));
		
		driver.switchTo().frame(Frame);
		
		WebElement textbox =driver.findElement(By.xpath("//input[@name='mytext1']"));
		
		textbox.sendKeys("Arpit");
		
		driver.switchTo().defaultContent();
		
WebElement Frame2 =driver.findElement(By.xpath("//frameset//frameset//frame[1]"));
		
		driver.switchTo().frame(Frame2);
		
		WebElement textbox2 =driver.findElement(By.xpath("//input[@name='mytext2']"));
		
		textbox2.sendKeys("Choubey");
		
		driver.switchTo().defaultContent();
		
		
		WebElement frame3 = driver.findElement(
		        By.xpath("//frame[@src=\"frame_3.html\"]"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.name("mytext3")).sendKeys("GoodDays");
		
		// iframe - inside Frame 3
		WebElement iframeElement = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iframeElement);

		String text = driver.findElement(By.xpath("//div[@id='i1']")).getText();
		System.out.println(text);
		
		
		driver.findElement(By.id("i21")).click();	
		driver.findElement(By.id("i24")).click();
		driver.findElement(By.id("i27")).click();

	}

}
