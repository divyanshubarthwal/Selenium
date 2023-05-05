package JavaSreams;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GreenkartOffers {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//thead/tr/th[1]")).click();
		
		List<WebElement> elements=driver.findElements(By.xpath("//tbody/tr/td[1]"));
		
		List<String> originalList=elements.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(originalList.equals(sortedList));
		
		
		List<String> price;
		
		
		// scan the name column with getText ->Beans->print the price of the Rice
		do {
			List<WebElement> rows=driver.findElements(By.xpath("//tbody/tr/td[1]"));
			price=rows.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
			price.forEach(a->System.out.println(a));
			if(price.size()<1)

			{

			driver.findElement(By.cssSelector("[aria-label='Next']")).click();

			}

			}while(price.size()<1);
	}
	private static String getPriceVeggie(WebElement s) {

		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;

		}

	//	driver.quit();

	

}
