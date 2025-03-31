package selenium.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalJsExecutor {

	public static void main(String[] args) {
		
		/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/modal");
		
		WebElement modalButton = driver.findElement(By.id("modal-button"));
		modalButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("close-button")));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click();", closeButton);
	
		//driver.quit(); */
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/modal");
		
		WebElement modalButton = driver.findElement(By.id("modal-button"));
		modalButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("close-button")));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", closeButton);
		
		modalButton.click();
		
		WebElement okButton = wait.until (ExpectedConditions.elementToBeClickable(By.id("ok-button")));
		okButton.click();
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();", okButton);
		
	}

}
		
		
