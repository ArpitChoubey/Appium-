package SeleniumP;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCookies {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://sparklecartonline.com/");
        driver.manage().window().maximize();
        
        System.out.println("--------------Add Cookie Object to the browser session");

        Cookie cookie_1 = new Cookie("TestCookie1", "CookieValue1");
        Cookie cookie_2 = new Cookie("TestCookie2", "CookieValue2");

        driver.manage().addCookie(cookie_1);
        driver.manage().addCookie(cookie_2);
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(cookies);
        System.out.println(cookies.size());
        System.out.println("---------------------Print Name & Value of Cookies---");
        
        for(Cookie c : cookies ) {
     	   System.out.println(c.getName()+" --"+c.getValue());
        }
        driver.quit();
	}

}
