package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {

	WebDriver driver = null;
	
	By textbox_search = By.name("q");
	By button_search = By.id("gsr");
	
	public GoogleSearchPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public void settextInSearchBox(String text) {
		driver.findElement(textbox_search).sendKeys(text);
		
	}
	public void clickSearchButton() {
	    driver.findElement(button_search).click();
}

}