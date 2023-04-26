package Assignment;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Asignment3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				
		
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		
	//	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".modal-body"))));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".modal-body")));
		
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		
		WebElement option=driver.findElement(By.xpath("//select[@data-style='btn-info']"));
		Select select=new Select(option);
		
		select.selectByVisibleText("Teacher");
		driver.findElement(By.xpath("//input[@id='terms']")).click();

		Thread.sleep(3000);
		
		
		driver.quit();
		
		
		

	}

}
