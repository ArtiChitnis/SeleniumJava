package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {
	
	public static void main(String[] args)throws Exception {
		
		test();
		
		
	}
	
	public static void test() throws Exception {
		
		
		String projectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.diver",projectPath+"\\driver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tinyupload.com/");
		//driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		//WebElement element = driver.findElement(By.name("upfile"));
		WebElement element =driver.findElement(By.name("uploaded_file"));
		element.click();
		
		//element.sendKeys("C:\\Users\\NIKHIL\\OneDrive\\Documents\\doubts.txt");
		Runtime.getRuntime().exec("C:\\Users\\NIKHIL\\Documents\\fileuploadscript.exe");
		Thread.sleep(10000);
		driver.close();
		System.out.println("Test Completed");
	}

}
