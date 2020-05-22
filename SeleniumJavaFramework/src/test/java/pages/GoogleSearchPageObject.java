package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchPageObject {
	
	WebDriver driver = null;
	
	
	By textbox_search = By.name("q");
	By textbox_button = By.name("btnK");
	
	public GoogleSearchPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setText(String text) {
		
		driver.findElement(textbox_search).sendKeys(text);
	}
	public void clickButton() {
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(textbox_button)).click();
	}
	

}
