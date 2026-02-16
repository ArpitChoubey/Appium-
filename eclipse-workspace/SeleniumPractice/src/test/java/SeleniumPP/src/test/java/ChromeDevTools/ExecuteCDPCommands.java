package ChromeDevTools;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v143.network.model.SecurityDetails;

public class ExecuteCDPCommands {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();

	    Map<String, Object> map = new HashMap<String, Object>();
	    map.put("ignore", false);
	    driver.executeCdpCommand("Security.setIgnoreCertificateErrors", map);
	    
	    driver.get("https://rc4.badssl.com/");
	    System.out.println(driver.getTitle());

	}

}
