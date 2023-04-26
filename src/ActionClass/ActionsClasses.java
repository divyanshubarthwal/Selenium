package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClasses {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		
		WebElement move=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
	//	action.moveToElement(move).build().perform();
		Thread.sleep(2000);
		action.moveToElement(move).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		Thread.sleep(2000);
		action.moveToElement(move).contextClick().build().perform();  //contextclick is used as a right click
		Thread.sleep(2000);
		driver.quit();
		
	}

}
