package testCases;

import org.testng.annotations.Test;

import pageObject.HomePage;
import testBase.BaseTest;

public class HealthInsuranceTest extends BaseTest{
	
	@Test
	public void printHealthInsuranceMenuItems() {
		HomePage hp = new HomePage(driver);
		hp.hoverOnInsuranceProducts();
		hp.printMenuItems(); 
	}
}
