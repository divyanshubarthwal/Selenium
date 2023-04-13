package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//https://rahulshettyacademy.com/dropdownsPractise/
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select select=new Select(element);
		select.selectByIndex(3);
		System.out.println(select.getFirstSelectedOption().getText());
		select.selectByValue("AED");
		System.out.println(select.getFirstSelectedOption().getText());
		
		
		Thread.sleep(1000);
		driver.quit();
		
	}

}
