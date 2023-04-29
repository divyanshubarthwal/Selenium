package Basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		// Scroll the Page

		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("window.scrollBy(0,1800)");
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='elementor-column elementor-col-100 elementor-inner-column elementor-element elementor-element-7a51525 search-for-outer']//div[@class='elementor-widget-wrap elementor-element-populated']")));
		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
		Thread.sleep(2000);
		while(!driver.findElement(By.xpath("//div[@class='flatpickr-current-month']/span[contains(text(),August)]")).getText().contains("August")){
			driver.findElement(By.cssSelector("//span[@class='flatpickr-next-month']")).click();
		}
		List<WebElement> dates= driver.findElements(By.className("day"));

		//Grab common attribute//Put into list and iterate

		int count=driver.findElements(By.className("day")).size();



		for(int i=0;i<count;i++)

		{

		String text=driver.findElements(By.className("day")).get(i).getText();

		if(text.equalsIgnoreCase("21"))

		{

		driver.findElements(By.className("day")).get(i).click();

		break;

		}
		
		driver.quit();
		
	}

}}
