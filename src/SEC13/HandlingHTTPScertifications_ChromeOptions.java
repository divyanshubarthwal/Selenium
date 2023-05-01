package SEC13;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingHTTPScertifications_ChromeOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		
		//1. Bypass the HTTPS certification
		options.setAcceptInsecureCerts(true);
		WebDriver driver=new ChromeDriver(options);
		
		//2. Handling proxy
		Proxy proxy=new Proxy();
		proxy.setHttpProxy("ipaddress:8080");
		options.setCapability("proxy", proxy);
		
		//3. add extension on running automated browser
		options.addExtensions(new File("/path/to/extension.crx"));
		
		//4. Start chrome maximized
		options.addArguments("start-maximized");
		
		//5. Block popup windows
		//options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		
		//6. set download directory
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefs);
		
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
		driver.quit();
		//https://chromedriver.chromium.org/capabilities visit for more ChromeOptions methods
	}

}
