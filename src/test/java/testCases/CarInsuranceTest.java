package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.CarInsurancePage;
import pageObject.HomePage;
import testBase.BaseTest;

public class CarInsuranceTest extends BaseTest{
	
	@Test
	public void verifyErrorMsg() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.clickCarInsurance();
		CarInsurancePage cr = new CarInsurancePage(driver); 
		cr.Hereclick();
		cr.clickCity();
		cr.clickBrand();
		cr.clickModel();
		cr.clickSuggestModel();
		cr.clickFuelType();
		cr.clickCarVariant();
		cr.clickSuggestVariant();
		cr.sendFullName(p.getProperty("name"));
		cr.sendMobileNumber(p.getProperty("invalidNumber"));
		System.out.println("Error message: "+cr.showErrorMsg());
		Assert.assertEquals("Enter a valid mobile number", cr.showErrorMsg());
		
	}
}
