package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownMenu {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/dropdown");
		
		WebElement dropdownmenu = driver.findElement(By.id("dropdownMenuButton"));
		dropdownmenu.click();
		
		WebElement autocompleteitem = driver.findElement(By.id("autocomplete"));
		autocompleteitem.click();

	}

}
