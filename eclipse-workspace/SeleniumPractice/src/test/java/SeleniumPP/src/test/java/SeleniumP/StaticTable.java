package SeleniumP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://testautomationpractice.blogspot.com/");
        
        driver.manage().window().maximize();
        
        int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println("Number of rows :"+rows);
        
      //2) Find the number of columns in the table -- th
        int columns = driver.findElements(
            By.xpath("//table[@name=\"BookTable\"]//tr[1]/th")
        ).size();
        System.out.println(columns);
        
      //3) Retrieve data from specific row and column - 3rd row 2nd column
        String value = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[3]//td[2]")).getText();
        System.out.println(value);
        
        //4) Retrieve data from specific row and column - 4th row 3rd column
        String value1 = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[4]//td[3]")).getText();
        System.out.println(value1);
        
     //5. Retrieve all the data from the web table - rows and columns

        for (int row = 2; row <= rows; row++) {
            for (int col = 1; col <= columns; col++) {

                String val = driver
                        .findElement(By.xpath("//table[@name='BookTable']//tr[" + row + "]/td[" + col + "]"))
                        .getText();

                System.out.print(val + " ");
            }
            System.out.println();
            }

      //6) Total price of all the Books
        int total = 0;
        for (int row = 2; row <= rows; row++) {
            String price = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[" + row + "]/td[4]")).getText();
            total = total + Integer.parseInt(price);
        }
            System.out.println(total);
        

	}
        
	}


