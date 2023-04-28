package Scope_changingQuestions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksAndNames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.ebay.com/");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//1. Total number of links in a page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		//2. total links in footer
		WebElement footer=driver.findElement(By.xpath("//footer[@id='glbfooter']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		Thread.sleep(2000);
		
		// 3. link on 2nd column
		WebElement columns=driver.findElement(By.xpath("//footer/div/table/tbody/tr/td[2]"));
		System.out.println(columns.findElements(By.tagName("a")).size());
		
		//4. click on each column and check whether it is working
		for(int i=1;i<columns.findElements(By.tagName("a")).size();i++) {
			String clickonlink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			columns.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			Thread.sleep(2000);
		}
			Set<String> abc=driver.getWindowHandles();
			Iterator<String> it=abc.iterator();
			while(it.hasNext()){
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		
		
		

		driver.quit();

	}

}
