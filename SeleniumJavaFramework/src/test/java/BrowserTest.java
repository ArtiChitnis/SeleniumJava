import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		//System.setProperty("webdriver.gecko.driver",projectpath+"\\driver\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//driver.get("http://selenium.dev/");
		
		System.setProperty("webdriver.chrome.driver",projectpath+"\\driver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com/");
		java.util.List<WebElement> list = driver.findElements(By.xpath("//input"));
		 int count = list.size();
		 System.out.println("Input Elements Count"+count);
		
		//driver.findElement(By.xpath("//input[@name ='q']")).sendKeys("Testing");
		//WebElement textbox = driver.findElement(By.name("q"));
		//textbox.sendKeys("Automation");
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//System.setProperty("webdriver.ie.driver",projectpath+"\\driver\\iedriver\\IEDriverServer.exe");
		//DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		//caps.setCapability("ignoreZoomSetting", true);
		//WebDriver driver = new InternetExplorerDriver(caps);
		//driver.get("http://selenium.dev/");
		
		
		
	//driver.close();
		//driver.quit();

	}
   
}
