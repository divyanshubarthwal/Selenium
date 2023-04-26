package WindowsFrames;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".blinkingText")).click();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		String parentId = it.next();
		String childId = it.next();

		driver.switchTo().window(childId);
		String Id = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(Id);
		Thread.sleep(3000);
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(Id);
		Thread.sleep(3000);
		driver.quit();
	}

}
