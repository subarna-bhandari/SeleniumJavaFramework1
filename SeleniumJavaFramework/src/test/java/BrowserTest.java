

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	public static void main(String[] args) {

		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);

		//System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.chorme.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//System.setProperty("webdriver.ie.driver", projectPath+"\\drivers\\IEDriverServer\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();

		driver.get("http://google.com");

		WebElement textBox = driver.findElement(By.name("q"));

		textBox.sendKeys("Automation Step by Step");

		driver.close();
	}

}
