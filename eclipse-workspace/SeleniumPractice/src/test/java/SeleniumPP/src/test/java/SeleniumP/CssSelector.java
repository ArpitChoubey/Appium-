package SeleniumP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args)  {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		//WebElement username = driver.findElement(By.cssSelector("input#user-name"));
		//username.sendKeys("problem_user");
		

		//WebElement password = driver.findElement(By.cssSelector("input#password"));
		
		//password.sendKeys("secret_sauce");
		
		//WebElement loginButton = driver.findElement(By.cssSelector("input#login-button"));
		//loginButton.click();

		//WebElement products = driver.findElement(By.cssSelector("span.title"));
		//String text = products.getText();
		//System.out.println(text);
		
		
		WebElement username1 = driver.findElement(By.cssSelector("input[placeholder=\"Username\"]"));
		username1.sendKeys("problem_user");
		
          WebElement password2 = driver.findElement(By.cssSelector("\r\n"
		+ "input[placeholder='Password']"));
		
		password2.sendKeys("secret_sauce");
		
		WebElement loginButton1 = driver.findElement(By.cssSelector("input[value='Login']"));
		loginButton1.click();
		
		WebElement products = driver.findElement(By.cssSelector("span.title"));
		String text = products.getText();
		System.out.println(text);
		
		driver.close();
		
		

	}

}
