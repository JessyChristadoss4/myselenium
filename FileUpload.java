package selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/fileupload");
		
		WebElement fileupload = driver.findElement(By.id("file-upload-field"));
		fileupload.sendKeys("Screenshot 2025-03-20 at 11.17.49 PM.png");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement fileuploadreset = driver.findElement(By.xpath("/html/body/div/form/div/div/span[2]/button"));
		fileuploadreset.click();

	}

}
