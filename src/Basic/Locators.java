package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("D@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("dsad");
		
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.close();
	}

}
