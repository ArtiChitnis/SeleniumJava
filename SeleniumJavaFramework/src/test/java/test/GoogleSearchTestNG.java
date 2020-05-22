package test;


//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class GoogleSearchTestNG {
	
	static WebDriver driver;
	
	@BeforeTest
	 public void setup_test() {
		 
		 
			String projectpath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", projectpath+"\\driver\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		 
	 }
	
	@Test
	public static void googleSearch() {
		
		
		//goto google.com
		driver.get("https://google.com/");
		
		//enter in google search box
		driver.findElement(By.name("q")).sendKeys("abcd");
		
		//click on search button
		//driver.findElement(By.name("btnK")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.name("btnK"))).click();
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		//driver.findElement(By.className("gNO89b")).sendKeys(Keys.RETURN);
		
		
	}
	@AfterTest
	public void terdown_test() {
		
		driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully");
		
		
		
	}
	

}
