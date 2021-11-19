package samplePackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\CES\\Grp-Messaging-Automation\\Messaging-Automation\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		assertEquals(title,"Google");
		driver.quit();
		
	}

}
