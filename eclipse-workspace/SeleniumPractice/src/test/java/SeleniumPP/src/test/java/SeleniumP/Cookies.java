package SeleniumP;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://sparklecartonline.com/");
        driver.manage().window().maximize();
        
       Set<Cookie> cookies = driver.manage().getCookies();
       System.out.println(cookies);
       System.out.println(cookies.size());
       
       
       System.out.println("---------------------Print Name & Value of Cookies---");
        
       for(Cookie c : cookies ) {
    	   System.out.println(c.getName()+" --"+c.getValue());
       }
       System.out.println("---------------------Print Specific Cookies---");
       Cookie obj = driver.manage().getCookieNamed("_shopify_y");
       System.out.println(obj);
       System.out.println(obj.getValue());
       
       driver.quit();
        

	}

}
