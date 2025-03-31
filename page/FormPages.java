package selenium.basics.page;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;

	public class FormPages {
		
		//public FormPage() {}
		
	public void submitForm(WebDriver driver) {
			
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
		}
	}
