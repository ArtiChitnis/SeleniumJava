package listeners;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo {

	@Test
	public void test1() {

		System.out.println("I am in Test 1");
	}
	@Test
	public void test2() {

		System.out.println("I am in Test 2");
		WebDriver driver = new ChromeDriver();
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"\\driver\\chromedriver\\chromedriver.exe");
		//goto google.com
		driver.get("https://.google.com/");
		driver.findElement(By.name("q")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@name='abc']")).sendKeys("abcd");
		driver.close();
	}
	@Test
	public void test3() {

		System.out.println("I am in Test 3");
	}


}
