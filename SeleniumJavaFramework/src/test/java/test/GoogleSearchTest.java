package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage; 

public class GoogleSearchTest {

	private static WebDriver driver = null;

	public static void main(String[] args) {
		googleSearch();
	}	

	public static void googleSearch( ) {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chorme.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

		//goto google.com
		driver.get("https://google.com");

		//enter text in search textbox
		//driver.findElement(By.name("q")).sendKeys("Automation Step by Step");

		GoogleSearchPage.testbox_search(driver).sendKeys("Automation step by step");

		//click on search button
		//driver.findElement(By.id("gsr")).click();

		GoogleSearchPage.button_search(driver).click();

		//close browser
		driver.close();

		System.out.println("Test completed Succesfully");


	}

}
