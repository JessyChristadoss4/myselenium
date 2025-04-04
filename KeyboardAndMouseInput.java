package selenium.basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class KeyboardAndMouseInput {

	public static void main(String[] args) {
		
		System.setProperty ("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/keypress");
		
		WebElement name = driver.findElement(By.id("name"));
		name.click();
		name.sendKeys("Jessy Christadoss");
		
		WebElement button = driver.findElement(By.id("button"));
		button.click();
		
		driver.quit();

	}

}
