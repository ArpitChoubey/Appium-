package SeleniumP;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverwithJava8 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://sparklecartonline.com/");
        driver.manage().window().maximize();
        
        List<WebElement> linksList = driver.findElements(By.tagName("a"));
        System.out.println(linksList.size());

        for (WebElement element : linksList) {
            System.out.println(element.getText());
        }

        // 1.
         linksList.forEach(ele -> System.out.println(ele.getText()));

        // 2.
        List<String> collectList = linksList
                .stream()
                .filter(ele -> !ele.getText().equals(""))
                .map(ele -> ele.getText())
                .collect(Collectors.toList());

        collectList.forEach(ele -> System.out.println(ele));
      //3.  
      String findfirst =  linksList.stream().filter(ele -> !ele.getText().equals("")).findFirst().get().getText();
      
      System.out.println(findfirst);
        //4.
      String findAny =  linksList.stream().filter(ele -> !ele.getText().equals("")).findAny().get().getText();
      
      System.out.println(findAny);
      
      driver.close();
	}

}
