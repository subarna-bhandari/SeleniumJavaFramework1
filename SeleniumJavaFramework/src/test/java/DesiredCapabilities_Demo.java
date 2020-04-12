import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_Demo {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		
		System.setProperty("webdriver.ie.driver", projectPath+"\\drivers\\IEDriverServer\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver(caps);
		
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("A B C");
		driver.findElement(By.id("gsr")).click();
		
		driver.close();
		driver.quit();
	}

}
