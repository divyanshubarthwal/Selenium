package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.findElement(By.name("name")).sendKeys("Divyanshu");
		driver.findElement(By.name("email")).sendKeys("D@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("rahulshettyacademy");

		driver.findElement(By.cssSelector("#exampleCheck1")).click();

		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));

		Select select = new Select(dropdown);
		select.selectByVisibleText("Female");

		Thread.sleep(2000);
		driver.findElement(By.id("inlineRadio1")).click();

		driver.findElement(By.name("bday")).sendKeys("02/02/1992");

		driver.findElement(By.cssSelector(".btn-success")).click();

		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());

		driver.quit();
	}

}
