package testPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.HomePage;

public class TC_SearchUser extends BaseTest {
	HomePage homePage;
	
	@Test
	public void TestClass() {
		

		driver.get("https://www.way2automation.com/angularjs-protractor/banking/#/login");
		
		homePage = new HomePage(driver);
		
		homePage.clickBankMgr();
		homePage.clickAddCustomer();
		homePage.enterForm("F3","L3", "12345");
		homePage.clickAddCustomerSubmit();
		homePage.handleAlert();
		homePage.clickOpenAccount();
		homePage.selectCustomer("F3","L3");
		homePage.selectCurrency("Rupee");
		homePage.clickProcessSubmit();
		homePage.handleAlert();
		homePage.clickCustomerBtn();
		homePage.searchCustomer("F3");
		homePage.verifyCustomer("F3");

		
	}
	
	
	
	
	
	
	

}
