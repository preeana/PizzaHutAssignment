package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pizza_Hut_DetailPage {

WebDriver driver;
	
	public Pizza_Hut_DetailPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//locators
	
	@FindBy(name="toggle-button-0")
	private WebElement veg_flag_button;
	
	@FindBy(linkText="Pizzas")
	private WebElement Pizzas_menu_bar;

	@FindBy(linkText="Drinks")
	private WebElement drinks_menu;

	
	//action on locators
	
	public void navigate_to_details_page() throws InterruptedException {
		Thread.sleep(5000);
		String expectedName="Online Pizza Order, Pizza Deals, Pizza Hut Online Orders | Pizza Hut India";
		String actualName=driver.getTitle();
		Assert.assertEquals(expectedName, actualName);
	}
	
	public void validate_vegetarian_radio_button_flag_is_off() {
		
		String  expectedVal= "false";
		String actualVal = veg_flag_button.getAttribute("value");
		Assert.assertEquals(expectedVal, actualVal);
		System.out.println("Vegetarian radio button flag is off");
	}
	
	public Pizza_Hut_OrderPage clicks_on_Pizzas_menu_bar_option() {
		
		Pizzas_menu_bar.click();
		return new Pizza_Hut_OrderPage(driver);
	}
	
	public Pizza_Hut_OrderPage click_drink_menu_bar_option() {
		
		drinks_menu.click();
		return new Pizza_Hut_OrderPage(driver);
	}
	
}
