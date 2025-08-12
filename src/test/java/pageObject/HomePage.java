package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	Actions action;
	
	public HomePage(WebDriver driver) {
		super(driver);
		action = new Actions(driver);
	}
	
	
	@FindBy(xpath="//div[@class='shadowHandlerBox']/following-sibling::p[normalize-space()='Travel Insurance']")
	WebElement travelInsurance;
	@FindBy(xpath="//div[@class='shadowHandlerBox']/following-sibling::p[normalize-space()='Car Insurance']") WebElement carInsurance;
	@FindBy(xpath="//a[text()='Insurance Products ']") WebElement insuranceProducts;
	@FindBy(xpath="(//div[@class=\"ruby-col-3 hidden-md\"])[2]/ul/li") List<WebElement> menuItems;
	
	
	public void clickTravelInsurance() {
		travelInsurance.click();
	}
	
	public void hoverOnInsuranceProducts() {
		action.moveToElement(insuranceProducts).perform();
	}
	
	public void printMenuItems() {
		System.out.println("Health Insurance Menu Items:");
		for(WebElement item : menuItems) {
			System.out.println(item.getText());
		}
		
	}
	
	public void clickCarInsurance() {
		action.moveToElement(carInsurance).click().perform();
	}
}
