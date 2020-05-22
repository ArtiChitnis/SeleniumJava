package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.converters.ExtentHtmlBddNodesConverter;

public class ExtentReportsDemo {
	
	private static WebDriver driver;
	
	public static void main (String args[]) {
		
	//start reporter	
	ExtentHtmlReporter ehr = new ExtentHtmlReporter("extentreports.html");
	
	//Create extentReports & attch reporters
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(ehr);
	
	 // creates a toggle for the given test, adds all log events under it    
    ExtentTest test1 = extent.createTest("Google Search", "Test to validate google search functionality");
    
    String projectpath = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", projectpath+"\\driver\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	
	test1.log(Status.INFO, "Starting testcase");
	
	driver.get("https://google.com");
	test1.pass("Navigated to google.com");
	
	driver.findElement(By.name("q")).sendKeys("abcd");
	test1.pass("Enter Text in search textbox");
	
	
	new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.name("btnK"))).click();
	test1.pass("Press Click");
	
	driver.close();
	driver.quit();
	test1.pass("Close the browser");
	test1.pass("Test completed");
	
	extent.flush();
	
	
	
}
}