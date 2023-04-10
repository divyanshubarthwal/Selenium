package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String name="D@gmail.com";
		String password = getPassword(driver,name);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		String expected=driver.findElement(By.tagName("p")).getText();
		Assert.assertEquals(expected,"You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Log Out')]")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}
	public static String getPassword(WebDriver driver,String name) throws InterruptedException


	{

	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.id("inputUsername")).sendKeys(name);
	Thread.sleep(2000);

	driver.findElement(By.linkText("Forgot your password?")).click();

	Thread.sleep(1000);

	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

	String PasswordText=driver.findElement(By.cssSelector("form p")).getText();
	String[] passwordArray=PasswordText.split("'");
	
	// String[] passwordArray2 = passwordArray[1].split("'");
	// passwordArray2[0]

	String password=passwordArray[1].split("'")[0];

	return password;
	//0th index - Please use temporary password
	//1st index - rahulshettyacademy' to Login.
	//0th index - rahulshettyacademy
	//1st index - to Login.

//Please use temporary password 'rahulshettyacademy' to Login.


	}
	
	
}
