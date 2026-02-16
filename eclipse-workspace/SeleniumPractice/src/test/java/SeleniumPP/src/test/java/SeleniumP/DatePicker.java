package SeleniumP;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();

		//switch to frame
		driver.switchTo().frame(0);

		//Method1 : using sendkeys()
		
		driver.findElement(By.id("datepicker")).sendKeys("04/05/2024");
		
		String date ="4";
		String month ="March";
		String year ="2026";
		
		driver.findElement(By.id("datepicker")).click();
		
		while(true)
		{
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if (currentMonth.equals(month) && currentYear.equals(year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		
		//select the date
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td/a"));
		
		for(WebElement dt:alldates)
		{
		    if(dt.getText().equals(date))
		    		{
		        dt.click();
		        break;
		    }

	}

	}
}
