package SeleniumP;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://sparklecartonline.com/");
        driver.manage().window().maximize();
        // scroll down through pixel 
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1300)", "");
        System.out.println(js.executeScript("return window.pageYOffset;"));
        // scroll down element is visible 
        WebElement ele = driver.findElement(By.xpath("//h2[normalize-space()='Cloud Slippers']"));
        js.executeScript("arguments[0].scrollIntoView();", ele);
        System.out.println(js.executeScript("return window.pageYOffset;"));
        // scroll down page till the end of page 
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOff;"));

        //scrolling up to initial position
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
        
        js.executeScript("document.body.style.zoom='50%'");  // set zoom level 50%
        

        js.executeScript("document.body.style.zoom='80%'");  // set zoom level 50%
        


	}

}
