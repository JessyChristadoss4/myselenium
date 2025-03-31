package selenium.basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Autocomplete {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		
		WebElement autocomplete = driver.findElement(By.className("autocomplete"));
		autocomplete.click();
		autocomplete.sendKeys("718 Bella" );
		//Thread.sleep(1000);
		
		//WebElement autocompleteResult = driver.findElement(By.className(""));
		//autocompleteResult.click();
		
		
		
		
		driver.quit();
		
		

	}

}
