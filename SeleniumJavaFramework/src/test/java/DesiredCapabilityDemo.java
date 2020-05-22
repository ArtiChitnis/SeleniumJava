import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DesiredCapabilityDemo {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String projectpath = System.getProperty("user.dir");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(key, value);
		
		
		System.setProperty("webdriver.chrome.driver", projectpath+"\\driver\\chromedriver\\chromedriver.exe");
		//goto google.com
		driver = new ChromeDriver();
		driver.get("https://.google.com/");
		driver.findElement(By.name("q")).sendKeys("abcd");
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.name("btnK"))).click();
		driver.close();
		driver.quit();
		
	}

}
