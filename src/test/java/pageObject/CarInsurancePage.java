package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CarInsurancePage extends BasePage {
	public CarInsurancePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[text()=\"Click here \"]")
	WebElement clickHere;
	
	@FindBy(xpath="//span[text()='Delhi']")
	WebElement selectCity;
	
	@FindBy(xpath="//SPAN[text()='MAHINDRA']")
	WebElement selectBrand;
	
	@FindBy(xpath="//input[@placeholder='Search Car Model']")
	WebElement selectModel;
	
	@FindBy(xpath="//div[@class='options open']/div[1]")
	WebElement suggestModel;
	
	@FindBy(xpath="//li[text()='Petrol']")
	WebElement selectFuelType;
	
	@FindBy(xpath="//input[@placeholder='Search Car Vaiants']")
	WebElement carVariant;
	
	@FindBy(xpath="//div[@class='options open']/div[1]")
	WebElement suggestvariant;
	
	@FindBy(xpath="//input[@placeholder='Full name']")
	WebElement fullName;
	
	@FindBy(xpath="//input[@placeholder='Mobile number']")
	WebElement mobileNumber;
	
	@FindBy(xpath="//div[@class='errorMsg']")
	WebElement errorMsg;
	
	public void Hereclick(){
		wait.until(ExpectedConditions.elementToBeClickable(clickHere)).click();
	}
	
	public void clickCity(){
		wait.until(ExpectedConditions.elementToBeClickable(selectCity)).click();
	}
	
	public void clickBrand() {
		wait.until(ExpectedConditions.elementToBeClickable(selectBrand)).click();
	}
	
	public void clickModel() {
		wait.until(ExpectedConditions.visibilityOf(selectModel)).sendKeys("XUV 3XO");
	}
	
	public void clickSuggestModel() {
		wait.until(ExpectedConditions.elementToBeClickable(suggestModel)).click();
	}
    
	public void clickFuelType() {
		wait.until(ExpectedConditions.elementToBeClickable(selectFuelType)).click();
	}
	
	public void clickCarVariant() {
		wait.until(ExpectedConditions.visibilityOf(carVariant)).sendKeys("AX5");
	}
	
	public void clickSuggestVariant() {
		wait.until(ExpectedConditions.elementToBeClickable(suggestvariant)).click();
	}
	
	public void sendFullName(String name) {
		wait.until(ExpectedConditions.visibilityOf(fullName)).sendKeys(name);
	}
	
	public void sendMobileNumber(String mob) {
		wait.until(ExpectedConditions.visibilityOf(mobileNumber)).sendKeys(mob);
	}
	
	public String showErrorMsg() {
		return errorMsg.getText();
	}
}
