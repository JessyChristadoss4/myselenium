package selenium.basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class BrowserActions {

	public static void main(String[] args) {
		
	//	1. Launch the browser and store the browser session in a variable (browser=chrome)
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver"); //Key=browser property, value=driver path
		WebDriver driver = new ChromeDriver();
		
		String handleId = driver.getWindowHandle(); // stores browser details in variable
		
	//	2. Maximize the browser window
		driver.manage().window().maximize();
		
	//	3. Delete all the cookies from the browser window
		driver.manage().deleteAllCookies();
		
	//	4. Get window size
		System.out.println(driver.manage().window().getSize().getHeight());
		System.out.println(driver.manage().window().getSize().getWidth());
		
	//	5. Enter URL and launch the application
		driver.get("https://aiforevery1.com/demo-site/");
		
	// verify application title
		System.out.println(driver.getTitle());
		if (driver.getTitle().equals("aiforevery1.com - aiforevery1 Resources and Information."))
			System.out.println("Application launched successfully");
		else
			System.out.println("Application Not launched");
		
	//	6. Navigate to different URL
		driver.navigate().to("https://www.google.com");
		
	//	7. Go back to previous URL
		driver.navigate().back();
		
	//	8. Go forward to next URL
		driver.navigate().forward();
		
	//	9. refresh the URL
		driver.navigate().refresh();
		
	//	10. Launch new tab and close the tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.yahoo.com");
		driver.close();
		
	//	11. Launch new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com");
		driver.close();
		
	//	12. Get window handle ID
		System.out.println(driver.getWindowHandle());
	//	System.out.println(driver.getWindowHandles());
		
	//	13. Switch between multiple windows
		driver.switchTo().window(handleId);
		driver.navigate().refresh();
		
	//	14. Close browser window/windows
		driver.close(); //close current open window
		driver.quit();  //close all open windows
		

	}

}
