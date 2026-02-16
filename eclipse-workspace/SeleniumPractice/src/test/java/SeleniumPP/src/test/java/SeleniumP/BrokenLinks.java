package SeleniumP;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();

        int noOfBrokenLinks = 0;

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links:" + links.size());

        for (WebElement linkElement : links) {

            String hrefAttValue = linkElement.getAttribute("href");

            if (hrefAttValue == null || hrefAttValue.isEmpty()) {
                System.out.println(
                        "href attribute value is null or empty. So Not possible to check ");
                continue;
            }

            // hit url to the server
            try {
                URL linkURL = new URL(hrefAttValue);
                HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();
                conn.connect();

                if (conn.getResponseCode() >= 400) {
                    System.out.println("Broken link: " + hrefAttValue);
                    noOfBrokenLinks++;
                } else {
                    System.out.println("Not a broken link: " + hrefAttValue);
                }

            } catch (Exception e) {
                System.out.println("Exception for link: " + hrefAttValue);
                noOfBrokenLinks++;
            }
        }

        System.out.println("Number of broken links:" + noOfBrokenLinks);
        driver.quit();
    }
}


	       

	       

	       

