package Exceptions;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;


public class BiDiException {

	public static void main(String[] args) {
		
		

        WebDriver driver = new ChromeDriver();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Start DevTools (BiDi/CDP)
        DevTools devTools = ((ChromeDriver) driver).getDevTools();
        devTools.createSession();

        // Enable network tracking
        devTools.send(org.openqa.selenium.devtools.v143.network.Network.enable(null, null, null, java.util.Optional.empty(), java.util.Optional.empty()));

        // Navigate to website
        driver.get("https://sparklecartonline.com/");
        driver.manage().window().maximize();

        // ❌ Close browser suddenly while BiDi session is active
        driver.quit();

        // ❌ Any BiDi call after quit will throw BiDiException
        devTools.send(org.openqa.selenium.devtools.v143.network.Network.disable());

	}

}
