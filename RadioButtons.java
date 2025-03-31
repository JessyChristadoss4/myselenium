package selenium.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtons {

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/radiobutton");
		
		WebElement radiobutton1 = driver.findElement(By.id("radio-button-1"));
		radiobutton1.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement radiobutton2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[value='option2']")));
		radiobutton2.click();
		
		WebElement radiobutton3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[3]/input")));
		radiobutton3.click();

	}

}
