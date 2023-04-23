package miscellaneous;

//import java.awt.List;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveOptions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/ ");
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(2000);

		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}

		driver.quit();

	}

}
