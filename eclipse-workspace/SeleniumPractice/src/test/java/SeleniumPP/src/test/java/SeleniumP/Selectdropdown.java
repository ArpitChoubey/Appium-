package SeleniumP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdropdown {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com/r.php?entry_point=login");

		
		WebElement day =driver.findElement(By.name("birthday_day"));
		
		Select dropdownday = new Select(day);
		
		// dropdownday.selectByValue("4");
		
		WebElement SelectOptions =dropdownday.getFirstSelectedOption();
		System.out.println(SelectOptions.getText());
		
		
		// dropdownday.selectByVisibleText("4");
		
WebElement month =driver.findElement(By.name("birthday_month"));
		
		Select dropdownmonth = new Select(month);
		
		dropdownmonth.selectByIndex(2);
		
		//WebElement SelectOptio = (WebElement) dropdownmonth.getAllSelectedOptions();
		//System.out.println(SelectOptio.getText());
		
		
		// dropdownmonth.selectByVisibleText("Mar");
		
WebElement year =driver.findElement(By.name("birthday_year"));
		
		Select dropdownyear = new Select(year);
		
		
		dropdownyear.selectByVisibleText("2026");
		
		//Retrieve the options in the dropdown
		List<WebElement> options = dropdownday.getOptions();
		System.out.println(options.size());

		//Regular for loop
		for(int i=0;i<options.size();i++) {
		    System.out.println(options.get(i).getText());
		}

	}

}
