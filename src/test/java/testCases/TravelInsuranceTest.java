package testCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.TravelInsurancePage;
import testBase.BaseTest;
import utilities.ExcelUtility;

public class TravelInsuranceTest extends BaseTest{
	
	@Test
	public void printNameAndPrice() throws InterruptedException, IOException {
		ExcelUtility util = new ExcelUtility(".\\testData\\TravellerInsurance.xlsx");
		HomePage hp =new HomePage(driver);
		hp.clickTravelInsurance();
		
		TravelInsurancePage tr =new TravelInsurancePage(driver);
		tr.clickCountry();
		tr.clickSelectCountry();
		tr.clickStartDate();
		tr.clickSelectDate();
		tr.clickContinueBtn();
		tr.clickNoOfMember();
		tr.clickTravellerOne();
		tr.clickTravellerOneAge();
		tr.clickTravellerTwo();
		tr.clickTravellerTwoAge();
		tr.clickSelectNo();
		tr.clickDoneBtn();	
		tr.clickExplorePlans();
		tr.clickStudentPlans();
		tr.clickTraveller1();
		tr.clickTraveller2();
		tr.clickSelectDays();
		tr.clickApplyBtn();
		tr.clickSortBy();
		tr.clickSelectFilter();
		List<WebElement> name = tr.getInsuranceName();
		List<WebElement> price = tr.getInsurancePremiumPrice();
		util.setCellData("Sheet1", 0, 0, "Insurance Provider Name");
		util.setCellData("Sheet1", 0, 1, "Premium Price");
		for(int i=0;i<name.size();i++) {
			util.setCellData("Sheet1", i+1, 0,name.get(i).getText());
			util.setCellData("Sheet1", i+1, 1,price.get(i).getText());
			System.out.print("Insurance provider company=> "+name.get(i).getText()+"\t");
			System.out.print("\tPremium Plan Price=> "+price.get(i).getText());
			System.out.println();
		}
		
	}
}
