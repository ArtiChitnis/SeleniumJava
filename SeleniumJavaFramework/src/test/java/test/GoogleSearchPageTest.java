package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObject;

public class GoogleSearchPageTest {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GoogleSearchTest();

	}
	public static void GoogleSearchTest() {
		
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"\\driver\\chromedriver\\chromedriver.exe");
		//goto google.com
		driver = new ChromeDriver();
		driver.get("https://.google.com/");
		
		GoogleSearchPageObject gso = new GoogleSearchPageObject(driver);
		gso.setText("Art of testing"); 
		gso.clickButton();
		driver.close();
		
	}
}
