package WindowsFrames;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesSwitching {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));

		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		Actions action=new Actions(driver);
		
		WebElement source=driver.findElement(By.cssSelector("div[id='draggable']"));
		WebElement target=driver.findElement(By.cssSelector("div[id='droppable']"));
		action.dragAndDrop(source,target).build().perform();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		driver.quit();
		
	}

}
