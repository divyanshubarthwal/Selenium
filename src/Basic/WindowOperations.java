package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ChromeOptions co=new ChromeOptions();
		//co.addArguments("--remote-allow-origins=*");
		
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://google.com");

		driver.navigate().to("https://rahulshettyacademy.com");

		driver.navigate().back();

		driver.navigate().forward();
		
		driver.quit();
		
	}

}
