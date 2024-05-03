package Pages;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pizza_Hut_OrderPage {

WebDriver driver;

	
	public Pizza_Hut_OrderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//locators
	@FindBy(xpath="//div[contains(@class,'list-item__name')]")
	List<WebElement> pizza_prod_list;
		
	@FindBy(xpath="//a[contains(@class,'basket-item-product-edit-button')]")
	private WebElement check_basket_msg;
	@FindBy(xpath="//div[contains(@class,'basket-item-product-title')]")
	private WebElement check_pizzaname;
	

	@FindBy(className="subtotal")
	private WebElement subTotal_val;
	@FindBy(className="display-supplement-value")
	private WebElement handlingCharges_val;
	@FindBy(css="div.flex-col:nth-child(3) > div:nth-child(1) > span:nth-child(3)")
	private WebElement tax_val;
	@FindBy(className="amountdue")
	private WebElement checkout_val;
	
	@FindBy(xpath="//span[contains(@class,'bg-green-dark')]")
	private WebElement item_count;
	
	@FindBy(xpath="div//[contains(@class,'mb-20')]")
	private WebElement validate_item_count;
	
	@FindBy(css=".text-right > span:nth-child(1)")
	private WebElement total_price_count;
	
	@FindBy(xpath="//div[contains(@class,'list-item__name')]")
	List<WebElement> add_drinks;
	
	@FindBy(xpath="//button[contains(@class,'icon-close')]")
	private WebElement close_icon;

	@FindBy(xpath="//div[contains(@class,'basket-checkout')]")
	private WebElement validate_pricetag;

	@FindBy(css="span.absolute:nth-child(2) > span:nth-child(1)")
	private WebElement click_checkout_btn;
	
	@FindBy(css=".pt-20")
	private WebElement error_msg;

	
	
	public void add_pizza() {
		
		String[] pizza_list = {"Mazedar Makhni PaneerNEW"};
		List<WebElement> products= pizza_prod_list;
		int j=0;
		for(int i=0;i<products.size();i++)
		{
			String prod_name=products.get(i).getText().trim();	
			List pizza_ordered = Arrays.asList(pizza_list);	
			if(pizza_ordered.contains(prod_name))
			{
				j++;
				driver.findElements(By.xpath("//span[text()='Add']")).get(i).click();
				if(j==1)
				{
					break;
				}
			}
		 }
	}
	
	public void pizza_added() {
			
		String basketText="Click to make changes";
		String actual_basketText=check_basket_msg.getText();
		if(actual_basketText.contains(basketText))
		{
			String expected_pizzaname="Mazedar Makhni Paneer";
			String actual_pizzaname=check_pizzaname.getText();
			if(actual_pizzaname.contains(expected_pizzaname))
			{
				System.out.println(actual_pizzaname+" is added to basket");
			}
			
		}
		else
		{
			System.out.println("Basket is empty");
		}
	}	
	
	public void validate_checkout_price() {
		
		String[] sub_total= subTotal_val.getText().split("₹");		
		Double formatted_sub_total=Double.parseDouble(sub_total[1].trim());
		
		String[] handling_charges=handlingCharges_val.getText().split("₹");
		Double formatted_handling_charges=Double.parseDouble(handling_charges[1].trim());
		
		String[] total_tax= tax_val.getText().split("₹");
		Double formatted_total_tax=Double.parseDouble(total_tax[1].trim());

		Double expectedAmt = formatted_sub_total + formatted_handling_charges + formatted_total_tax;

		String[] total_amt= checkout_val.getText().split("₹");		
		Double formatted_total_amt=Double.parseDouble(total_amt[1].trim());
		
		//Assert.assertEquals(expectedAmt, formatted_total_amt);
		if(expectedAmt.equals(formatted_total_amt))
		{
			System.out.println("Pizza price plus Tax is checkout price");
		}
		else
		{
			System.out.println("Pizza price plus Tax is not checkout price");	
		}
	}
	
	public void validate_item_count() {
		
		item_count.isDisplayed();
		System.out.println(item_count.getText()+" is added");
	}
			
	public void validate_total_price_count() {
		
		total_price_count.isDisplayed();
		String checkout_count=total_price_count.getText();
		System.out.println(checkout_count+" Amount is displayed on Checkout button");
	}
	
	public void add_drinks() {
		
		//pepsi option
		String[] drinks_list = {"Pepsi - 475ml"};
		List<WebElement> drinks= add_drinks;
		int j=0;
		for(int i=0;i<drinks.size();i++)
		{
			String drink_name=drinks.get(i).getText().trim();
			List drinks_ordered = Arrays.asList(drinks_list);	
			if(drinks_ordered.contains(drink_name))
			{
				j++;
				//Thread.sleep(5000);
				driver.findElements(By.xpath("//span[text()='Add']")).get(i).click();
				if(j==1)
				{
					break;
				}
			}
		}
		
	}
	
	
	public void validate_itemcount_increased() {
		
		item_count.isDisplayed();
		String updateditemcount = item_count.getText();
		Assert.assertEquals(updateditemcount,"2 items");
		System.out.println(updateditemcount+" count is added");
	}
	
	public void validate_total_price_more_than_before(){
		
		Double expected_total_amt=413.7;
		
		String[] new_total_amt=checkout_val.getText().split("₹");
		Double actual_new__total_amt=Double.parseDouble(new_total_amt[1].trim());

		if(actual_new__total_amt > expected_total_amt)
		{
			System.out.println("Total Price "+actual_new__total_amt+" is now more than before " +expected_total_amt);
		}
	}
	
	public void remove_the_Pizza_item_from_Basket() {
		
		close_icon.click();
	}
	
	public void price_tag_removed_from_checkout_button() {
		
		String pricetag=validate_pricetag.getText();
		if(pricetag.contains("₹"))
		{
			System.out.println("Price tag is not displayed");
		}
		else
		{
			System.out.println("Price tag is displayed");
		}
	}
	
	public void validate_itemcount_reduced() {

		String itemcount=item_count.getText();
		System.out.println("Item count is reduced to  "+itemcount);
		Assert.assertEquals(itemcount, "1 item");
	}
	
	public void click_checkout_btn() {
		
		click_checkout_btn.click();
	}
	
	public void error_msg() {
		
		if(error_msg.isDisplayed())
		{
			String message= error_msg.getText();
			System.out.println(message+" is getting displayed");
		}
		else
		{
			System.out.println("Minimum order required pop up didnot get displayed");
		}
	}
	
}