package ChromeDevTools;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v143.network.model.SecurityDetails;

public class LoadingInsecureWebsite {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();

	    //Create DevTools Object
	    DevTools devTools = driver.getDevTools();

	    //Create Session
	    devTools.createSession();

	    devTools.send(SecurityDetails.setIgnoreCertificateErrors(false));
	    
	  //Launch the Website
	    driver.get("https://expired.badssl.com/");
	    System.out.println(driver.getTitle());

	}

}
