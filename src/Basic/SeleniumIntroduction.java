package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumIntroduction {

	
	public static void main(String[] args) {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		/*
		 System.setProperty("webdriver.chrome.driver","/Users/Divyanshu/chromedriver.exe");
		  
		  */
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
		
/*
 close()->closes only that current window
 quit()->closes all the windows opened by selenium
 
 ChromeDriver driver=new ChromeDriver();
 driver object here has access to all the methods of chrome driver so chrome methods will dont work if we change the browser
 
 WebDriver driver=new ChromeDriver();
 driver object here has access to the methods of chrome driver which are defiend in web driver interface
   
   //webdriver.chrome.driver-> path
 */
	}

}
