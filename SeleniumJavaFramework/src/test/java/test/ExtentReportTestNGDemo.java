package test;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportTestNGDemo {

	ExtentReports extent;
	WebDriver driver;
	ExtentTest test1;
	@BeforeSuite
	public void setup() {

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");

		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
	    
	    String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"\\driver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();




	}

	@Test
	public void test1() throws IOException {

		// creates a toggle for the given test, adds all log events under it    
		test1 = extent.createTest("Google Search", "Test to validate google search functionality");
		
		 // log(Status, details)
        test1.log(Status.INFO, "Starting testcase");
    	
    	driver.get("https://google.com");
    	test1.pass("Navigated to google.com");

        // info(details)
    	driver.findElement(By.name("q")).sendKeys("abcd");
    	test1.pass("Enter Text in search textbox");
        
        // log with snapshot
    	new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.name("btnK"))).click();
    	test1.pass("Press Click");

	}

	@AfterSuite
	public void tear_down() {


		// calling flush writes everything to the log file
		driver.close();
		driver.quit();
		test1.pass("Close the browser");
		test1.pass("Test completed");
        extent.flush();

	}


}
