package pageObject;

import java.util.List;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class TravelInsurancePage extends BasePage{
	public TravelInsurancePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='country']")
	WebElement clickSearchCountry;
	
	String searchCountry = "United Kingdom";
	@FindBy(xpath="//li[text()='United Kingdom']")
	WebElement selectCountry;
	
	@FindBy(xpath="//span[contains(text(),'Start')]")
	WebElement startDate;
	
	@FindBy(xpath="//button[contains(@class, 'MuiPickersDay-root') and not(@disabled)]")
	List<WebElement> selectDate;
	
	@FindBy(xpath="//button[text()='Continue']")
	WebElement continueBtn;
	
	@FindBy(xpath="//label[text()='2']")
	WebElement noOfMember;
	
	@FindBy(xpath="//div[contains(text(),'traveller 1')]")
	WebElement travellerOne;
	
	@FindBy(xpath="//label[contains(text(),'22')]")
	WebElement travellerOneAge;
	
	@FindBy(xpath="//div[contains(text(),'traveller 2')]")
	WebElement travellerTwo;
	
	@FindBy(xpath="//label[contains(text(),'21')]")
	WebElement travellerTwoAge;
	
	@FindBy(xpath="//label[text()='No']")
	WebElement selectNo;
	
	@FindBy(xpath="//button[text()='Done']")
	WebElement doneBtn;
	
	@FindBy(xpath="//button[text()='Explore Plans ›']")
	WebElement explorePlans;
	
	@FindBy(xpath="//label[text()='Student plans']")
	WebElement studentPlans;
	
	@FindBy(xpath="//input[@id='Traveller_1']")
	WebElement  traveller1;
	
	@FindBy(xpath="//input[@id='Traveller_2']")
	WebElement  traveller2;
	
	@FindBy(xpath="//select[@id='feet']")
	WebElement selectDays;
	
	@FindBy(xpath="//button[text()='Apply']")
	WebElement applyBtn;
	
	@FindBy(xpath="//p[text()='Sort by']")
	WebElement sortBy;
	
	@FindBy(xpath="//input[@id='17_sort']")
	WebElement selectFilter;
	
	@FindBy(xpath="//p[@class='quotesCard--insurerName'][position <= 3]")
	List<WebElement> insuranceName ;
	
	@FindBy(xpath="//span[@class='premiumPlanPrice'][position <= 3]")
	List<WebElement> insurancePremiumPrice ;
	
	public void  clickCountry() {
		wait.until(ExpectedConditions.elementToBeClickable(clickSearchCountry)).click();
		wait.until(ExpectedConditions.elementToBeClickable(clickSearchCountry)).sendKeys(searchCountry);
	}
	
	public void clickSelectCountry() throws InterruptedException {
//		BaseClass.smallWait();
		wait.until(ExpectedConditions.elementToBeClickable(selectCountry)).click();
	}
	
	public void clickStartDate() throws InterruptedException {
//		BaseClass.longWait();
		wait.until(ExpectedConditions.elementToBeClickable(startDate)).click();
	}	  
	
	
	public void clickSelectDate() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(selectDate.get(2))).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectDate.get(11))).click();
	}  
	
	public void clickContinueBtn() throws InterruptedException {
//		BaseClass.longWait();
		wait.until(ExpectedConditions.elementToBeClickable(continueBtn)).click();
	}
	
	public void clickNoOfMember() throws InterruptedException {
//		BaseClass.smallWait();
		wait.until(ExpectedConditions.elementToBeClickable(noOfMember)).click();
	}
	
	public void clickTravellerOne() {
		wait.until(ExpectedConditions.elementToBeClickable(travellerOne)).click();
	}
	public void clickTravellerOneAge() {
		wait.until(ExpectedConditions.elementToBeClickable(travellerOneAge)).click();
	}
	
	public void clickTravellerTwo() {
		wait.until(ExpectedConditions.elementToBeClickable(travellerTwo)).click();
	}
	public void clickTravellerTwoAge() {
		wait.until(ExpectedConditions.elementToBeClickable(travellerTwoAge)).click();
	}
	
	public void clickSelectNo() {
		wait.until(ExpectedConditions.elementToBeClickable(selectNo)).click();
	}
	
	public void clickDoneBtn() throws InterruptedException {
		js.executeScript("arguments[0].scrollIntoView(true);", doneBtn);
//		BaseClass.smallWait();
		wait.until(ExpectedConditions.elementToBeClickable(doneBtn)).click();
	}
	
	public void clickExplorePlans() throws InterruptedException {
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
//		BaseClass.smallWait();
		wait.until(ExpectedConditions.elementToBeClickable(explorePlans)).click();
	}
	
	
	
	
	/* public void clickExplorePlans() throws InterruptedException {
    String originalUrl = driver.getCurrentUrl();

    try {
        js.executeScript("arguments[0].scrollIntoView(true);", explorePlans);
        
        WebElement exploreBtn = wait.until(ExpectedConditions.elementToBeClickable(explorePlans));
        exploreBtn.click();
        
    } catch (Exception e) {
        System.out.println("Standard click on 'Explore Plans' failed. Retrying with JavaScript.");
        js.executeScript("arguments[0].click();", explorePlans);
    }
    
    try {
        wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe(originalUrl)));
        System.out.println("Successfully navigated to the next page.");
    } catch (TimeoutException e) {
        System.out.println("Timeout waiting for navigation. The 'Explore Plans' button might not have worked.");
        throw new IllegalStateException("Failed to navigate to the next page after clicking 'Explore Plans'.", e);
    }
}*/
	
	public void clickStudentPlans() throws InterruptedException {
	    wait.until(ExpectedConditions.visibilityOf(studentPlans));
	    
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(studentPlans)).click();
	    } catch (ElementClickInterceptedException e) {
	        js.executeScript("arguments[0].click();", studentPlans);
	    }
	}
	
	public void clickTraveller1() throws InterruptedException {
//		BaseClass.smallWait();
		wait.until(ExpectedConditions.elementToBeClickable(traveller1)).click();
	}
	
	public void clickTraveller2() {
		wait.until(ExpectedConditions.elementToBeClickable(traveller2)).click();
	}
	
	public void clickSelectDays() {
		Select date = new Select(selectDays);
		date.selectByValue("1");
	}
	
	public void clickApplyBtn() {
		wait.until(ExpectedConditions.elementToBeClickable(applyBtn)).click();
	}
	
	public void clickSortBy() {
		wait.until(ExpectedConditions.elementToBeClickable(sortBy)).click();
	}
	
	public void clickSelectFilter() {
		wait.until(ExpectedConditions.elementToBeClickable(selectFilter)).click();
	}
	
	public List<WebElement> getInsuranceName(){
		return insuranceName;
	}
	
	public List<WebElement> getInsurancePremiumPrice(){
		return insurancePremiumPrice;
	}
}
