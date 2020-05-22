package test;

import pages.GoogleSearchPages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.GoogleSearchPages;
public class GoogleSearchPage {

	
	private static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		googleSearch();
	}
	public static void googleSearch() {
		
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"\\driver\\chromedriver\\chromedriver.exe");
		//goto google.com
		driver = new ChromeDriver();
		driver.get("https://google.com/");
		
		//enter in google search box
		//driver.findElement(By.name("q")).sendKeys("abcd");
		GoogleSearchPages.textbox_search(driver).sendKeys("Automation step by step");
		
		//click on search button
		//driver.findElement(By.name("btnK")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(GoogleSearchPages.button_search(driver))).click();
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.name("btnK"))).click();
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		//driver.findElement(By.className("gNO89b")).sendKeys(Keys.RETURN);
		
		System.out.println("Test Completed Successfully");
		driver.close();
		
	}

}
