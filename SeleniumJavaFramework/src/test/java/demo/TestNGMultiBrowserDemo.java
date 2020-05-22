package demo;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNGMultiBrowserDemo {
	
	public static WebDriver driver;
	String projectpath = System.getProperty("user.dir");
	
	@SuppressWarnings("deprecation")
	@org.testng.annotations.Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {
		
		System.out.println("Browser Name is " +browserName+Thread.currentThread().getId());
		if(browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", projectpath+"\\driver\\chromedriver\\chromedriver.exe");
			//goto google.com
			driver= new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver",projectpath+"\\driver\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
        else if(browserName.equalsIgnoreCase("ie")) {
			
        	System.setProperty("webdriver.ie.driver",projectpath+"\\driver\\iedriver\\IEDriverServer.exe");
    		DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
    		cap.setCapability("ignoreZoomSetting", true);
    		cap.setCapability("ignoreProtectedModeSettings",1);
    		cap.setCapability("nativeEvents","false");
    		cap.setCapability("requireWindowFocus","true");
    		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
    		//cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
    		driver = new InternetExplorerDriver(cap);
			
		}
		
		
	}
	@Test
	public void test() throws Exception {
		
		driver.get("https://automationstepbystep.com/selenium/");
		//Thread.sleep(4000);
		
		
		
	}
	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully");
		
    }
		
	
}
