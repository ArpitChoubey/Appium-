package SeleniumP;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElements {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.opencart.com/en-gb?route=account/register");
        driver.manage().window().maximize();
        
        List<WebElement> elements =
                driver.findElements(By.xpath("//form[@id=\"form-register\"]//label"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        for (WebElement ele : elements) {

            // System.out.println(ele.getText());

            String script =
                "return window.getComputedStyle(arguments[0], '::before')" +
                ".getPropertyValue('content')";

            js.executeScript(script, ele).toString();
        }

        driver.quit();

	}

}
