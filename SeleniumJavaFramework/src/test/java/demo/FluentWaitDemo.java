package demo;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;


public class FluentWaitDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		test();
	}
		
	static WebDriver driver;
	public static void test() throws InterruptedException {
		
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.diver",projectPath+"\\driver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.name("btnK"))).click();
		
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		//driver.findElement(By.id("gsr")).sendKeys(Keys.RETURN);
		
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(100, TimeUnit.SECONDS)
		       .pollingEvery(10, TimeUnit.SECONDS)
		       .ignoring(NoSuchElementException.class);

		   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		    	WebElement linkelement = driver.findElement(By.id("gsr"));
		    	if(linkelement.isEnabled())
		    	{
		    		System.out.println("element present");
		    	}
		    	return linkelement;
		     }
		   });
		 
		   element.click();
		 
		
		//Thread.sleep(3000);
		//driver.close();
		
	}

}
