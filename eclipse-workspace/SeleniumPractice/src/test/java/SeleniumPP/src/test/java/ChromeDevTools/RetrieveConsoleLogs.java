package ChromeDevTools;

import org.openqa.selenium.bidi.log.LogEntry;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v143.log.Log;

public class RetrieveConsoleLogs {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();

        // Create DevTools Session
        DevTools devTools = driver.getDevTools();
        devTools.createSession();

        devTools.addListener(
                Log.entryAdded(),   //event - release some output
                (LogEntry entry) -> {
                    System.out.println("Log Text: " + entry.getText());
                    System.out.println("Level: " + entry.getLevel()); //Error, Info
                    System.out.println("URL: " + entry.getUrl());
                    System.out.println("----------");
                }
        );

        
        driver.get("https://the-internet.herokuapp.com/broken_images");
        
       driver.quit();

	}

}
