package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/scroll");
		
		WebElement name = driver.findElement(By.id("name"));
		Actions actions = new Actions(driver);
		actions.moveToElement(name);
		name.click();
		name.sendKeys("Jes Chris");
		
		WebElement date = driver.findElement(By.id("date"));
		date.click();
		date.sendKeys("03/21/2025");
		
		driver.quit();
		
	}

}
