package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://formy-project.herokuapp.com/datepicker");
			
			WebElement datepicker = driver.findElement(By.id("datepicker"));
			datepicker.sendKeys("03/29/25");
			datepicker.sendKeys(Keys.RETURN);

			
	}
}
