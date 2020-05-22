package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWaitDemo {
	 static WebDriver driver;
	public static void main(String[] args) {
		selenium_wait();
	}
	
	public static void selenium_wait() {
		
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.diver",projectPath+"\\driver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//default time : 250 mili seconds
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
		
		//driver.findElement(By.name("abcd"));
		
		driver.close();
		driver.quit();
		
		
	}
	
}
