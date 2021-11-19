package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;

	}
	
	By bankManagerBtn = By.xpath("//button[text()='Bank Manager Login']");
	By addCustomerbtn = By.xpath("//button[@ng-click='addCust()']");
	By fNameTxtBtn = By.xpath("//input[@placeholder='First Name']");
	By lNameTxtBtn = By.xpath("//input[@placeholder='Last Name']");
	By pCodeTextBtn = By.xpath("//input[@placeholder='Post Code']");
	By assCustomerSubmit = By.xpath("//button[@type = 'submit']");
	By openAccountbtn = By.xpath("//button[@ng-click= 'openAccount()']");
	By selectCustomer = By.xpath("//Select[@id= 'userSelect']");
	By selectCurrency = By.xpath("//Select[@id= 'currency']");
	By processButton = By.xpath("//button[contains(text(),'Process')]");
	By showCustomerBtn = By.xpath("//button[@ng-click= 'showCust()']");
	By searchCustomer = By.xpath("//input[@placeholder='Search Customer']");
	//By customerInTable = By.xpath("//td[contains(text(),'A1')]");
	
	
	
	
	
	
	public void clickBankMgr() {
		driver.findElement(bankManagerBtn).click();	
		System.out.println("Manager Btn clicked");
	}
	public void clickAddCustomer() {
		driver.findElement(addCustomerbtn).click();	
		System.out.println("Add Customer clicked");
	}
	
	public void enterForm(String fName,String lName, String  pCode ) {
		System.out.println("Enter Customer Details: ");
		driver.findElement(fNameTxtBtn).sendKeys(fName);
		driver.findElement(lNameTxtBtn).sendKeys(lName);
		driver.findElement(pCodeTextBtn).sendKeys(pCode);
		System.out.println("Customer Details entered");
	}
	
	public void clickAddCustomerSubmit() {
		driver.findElement(assCustomerSubmit).click();	
		System.out.println("Add Customer Submitted");
	}
	
	public void handleAlert() {
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}
	public void clickOpenAccount() {
		driver.findElement(openAccountbtn).click();	
		System.out.println("OpenAccount clicked");
	}

	public void selectCustomer(String fName,String lName) {
		WebElement customer =driver.findElement(selectCustomer);
		Select cust = new Select(customer);
		cust.selectByVisibleText(fName+" "+lName);
	}
	
	public void selectCurrency(String currency) {
		WebElement curr =driver.findElement(selectCurrency);
		Select cust = new Select(curr);
		cust.selectByVisibleText(currency);
	}
	
	public void clickProcessSubmit() {
		driver.findElement(processButton).click();	
		System.out.println("processButton clicked");
	}
	
	public void clickCustomerBtn() {
		driver.findElement(showCustomerBtn).click();	
		System.out.println("Customer Btn clicked");
	}
	
	public void searchCustomer(String fName ) {
		System.out.println("Enter Customer FName: ");
		driver.findElement(searchCustomer).sendKeys(fName);
	}
	
	public void verifyCustomer(String fName) {
		//By customerInTable = By.xpath("//td[contains(text(),'A1')]");
		String locateCust = "//td[contains(text(),'"+fName+"')]";
		By customerToSearch = By.xpath(locateCust);
		String customernameTable = driver.findElement(customerToSearch).getText();
		assertEquals(fName,customernameTable);
	}
	
	
	
	
	
	
}
