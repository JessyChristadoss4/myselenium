package selenium.basics;

import static org.junit.Assert.assertEquals;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium.basics.page.ConfirmationPage;
import selenium.basics.page.FormPages;

public class Form {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/ChromeDriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/form");
		
		FormPages formPage = new FormPages();
		formPage.submitForm(driver);
		
		ConfirmationPage confirmationPage = new ConfirmationPage();
		confirmationPage.waitForAlertBanner(driver);
		
		assertEquals("The form was successfully submitted!", confirmationPage.getAlertBannerText(driver));
		
	//	driver.quit();
		
	}

}
