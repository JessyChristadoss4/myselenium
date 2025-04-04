package selenium.basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

public class FormBeforeCleanUp {

	public static void main(String[] args) {
				
				System.setProperty("webdriver.chrome.driver", "./Drivers/ChromeDriver");
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://formy-project.herokuapp.com/form");
				
				driver.findElement(By.id("first-name")).sendKeys("Jessy");
				
				driver.findElement(By.id("last-name")).sendKeys("Christadoss");
				
				driver.findElement(By.id("job-title")).sendKeys("Quality Assurance");
				
				driver.findElement(By.id("radio-button-3")).click();
				
				driver.findElement(By.id("checkbox-2")).click();
				
				driver.findElement(By.id("select-menu")).click();
				driver.findElement(By.cssSelector("option[value='2']")).click();
				
				driver.findElement(By.id("datepicker")).sendKeys("03/28/2025");
				driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
				
				driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")). click();
				
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
				
				WebElement alert = wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));
				
				String alertText = alert.getText();
				
				System.out.println(alertText);
				
				assertEquals("The form was successfully submitted!", alertText);
				
	}

}
