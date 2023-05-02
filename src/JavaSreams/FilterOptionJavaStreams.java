package JavaSreams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterOptionJavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();

	        driver.get("https://rahulshettyacademy.com/greenkart/#/offers");

	        driver.findElement(By.id("search-field")).sendKeys("Rice");

	        List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));
	        //1 results

	       List<WebElement> filteredList= veggies.stream().filter(veggie->veggie.getText().contains("Rice")).
	        collect(Collectors.toList());

	       //1 result

	       Assert.assertEquals(veggies.size(), filteredList.size());
  

	}



	

}
