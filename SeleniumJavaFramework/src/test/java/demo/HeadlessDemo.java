package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessDemo {

	static WebDriver driver;
	public static void main(String[] args) {
		test();
	}
	public static void test() {
		
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.diver",projectPath+"\\driver\\chromedriver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("Headless");
		driver = new ChromeDriver(option);
		driver.get("https://google.com");
		System.out.println("Title is" +driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.close();
		driver.quit();
		System.out.println("test completed");

	}
}