package SeleniumP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

        driver.get("https://sparklecartonline.com/");

        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://sparklecartonline.com/pages/contact");
        
        driver.switchTo().newWindow(WindowType.WINDOW);
        
        driver.get("https://sparklecartonline.com/");

	}

}
