package testPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	public static WebDriver driver = null;
	
	@BeforeTest
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\CES\\Grp-Messaging-Automation\\Messaging-Automation\\src\\\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}	
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	

	
	
	

}
