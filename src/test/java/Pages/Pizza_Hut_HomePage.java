package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Pizza_Hut_HomePage {

	WebDriver driver;
	
	public Pizza_Hut_HomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//locators
	@FindBy(xpath="//div[contains(@class, 'relative')]")
	private WebElement PopUp;
	@FindBy(xpath="//input[@placeholder='Enter your location for delivery']")
	private WebElement enterLocation;
	@FindBy(xpath="//input[@placeholder='Enter your location for delivery']")
	private WebElement select_first_dropdown_option;
	
	//actions on locators
	
	public void popupDisplayed() {
		
		PopUp.isDisplayed();
		System.out.println("Pop Up displayed");
	}
	
	public void enterLocation(String Location) {
		
		enterLocation.sendKeys(Location);
	}
	
	public Pizza_Hut_DetailPage select_first_auto_populate_drop_down_option() {
		
		select_first_dropdown_option.sendKeys(Keys.ENTER);
		return new Pizza_Hut_DetailPage(driver);
	}
}




