package SeleniumP;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://sparklecartonline.com/");
        driver.manage().window().maximize();

        // 1) full page screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        File sourcefile = ts.getScreenshotAs(OutputType.FILE);
        
        File targetfile = new File("C:\\Users\\hi\\eclipse-workspace\\SeleniumPractice\\src\\test\\java\\SeleniumPP\\Screenshots\\fullpage.png");
        
        sourcefile.renameTo(targetfile);
        
        WebElement ffile =driver.findElement(By.xpath("//strong[normalize-space()='4-in-1 Contour Pen']"));
   
File sourcefile2 = ffile.getScreenshotAs(OutputType.FILE);
        
        File targetfile2 = new File("C:\\Users\\hi\\eclipse-workspace\\SeleniumPractice\\src\\test\\java\\SeleniumPP\\Screenshots\\feature.png");
        
        sourcefile2.renameTo(targetfile2);
	}

}
