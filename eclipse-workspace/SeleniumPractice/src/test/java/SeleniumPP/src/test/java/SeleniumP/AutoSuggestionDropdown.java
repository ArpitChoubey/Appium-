package SeleniumP;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropdown {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://www.google.com/");
        
        driver.manage().window().maximize();
        
        WebElement searchbox = driver.findElement(
                By.xpath("//textarea[@title=\"Search\"]"));
        searchbox.sendKeys("Selenium Java");

        List<WebElement> suggestions = driver.findElements(
                By.xpath("//ul[@role=\"listbox\"]/li//div[@role=\"option\"]"));
        System.out.println(suggestions.size());

        for (WebElement suggestion : suggestions) {
          //  System.out.println(suggestion.getText());
        	
        	if (suggestion.getText().equals("selenium java interview questions")) {
        	    suggestion.click();
        	    break;
            
            
        	}
	}

	}
}
