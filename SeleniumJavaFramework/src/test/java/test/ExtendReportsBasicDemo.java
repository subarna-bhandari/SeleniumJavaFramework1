package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportsBasicDemo {

	private static WebDriver driver = null;
	public static void main(String[] args) {

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentHtmlReports.html");

		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test1 = extent.createTest("Google Search Test One", "This is test to validate google search");

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chorme.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

		test1.log(Status.INFO, "Starting Test Case");
		driver.get("https://google.com");
		test1.pass("Navigated to google.com");

		driver.findElement(By.name("q")).sendKeys("Automation");
		test1.pass("Entered text in Searchbox");

		driver.findElement(By.id("gsr")).click();
		test1.pass("Pressed keyboard enter key");

		driver.close();

		driver.quit();
		test1.pass("Closed the browser");

		// calling flush writes everything to the log file
		extent.flush();

	}

}
