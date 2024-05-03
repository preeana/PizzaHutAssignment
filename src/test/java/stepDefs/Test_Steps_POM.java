package stepDefs;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

import Pages.Pizza_Hut_DetailPage;
import Pages.Pizza_Hut_HomePage;
import Pages.Pizza_Hut_OrderPage;
import Base.Base;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.NoSuchElementException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Steps_POM extends Base  {
	
	WebDriver driver;
	Pizza_Hut_HomePage ph_homepage;
	Pizza_Hut_DetailPage ph_detailpage;
	Pizza_Hut_OrderPage ph_orderpage ; 
	
	@Given("User launch Pizzahut application with {string}")
		public void user_launch_Pizzahut_application_with(String URL) throws IOException, InterruptedException {
	 
			driver = initializeBrowser();
			driver.navigate().to(URL);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		}

	@When("User see pop up for delivery asking for enter location")
		public void User_see_pop_up_for_delivery_asking_for_enter_location() {
	
			ph_homepage =new Pizza_Hut_HomePage(driver);
			ph_homepage.popupDisplayed();
	  	}

	@Then("User type address as {string}")
		public void User_type_address_as(String Location) throws InterruptedException{
			Thread.sleep(5000);
			ph_homepage.enterLocation(Location);
		}

	@And("User select first auto populate drop down option")
		public void User_select_first_auto_populate_drop_down_option() throws InterruptedException{

			Thread.sleep(5000);
			ph_homepage.select_first_auto_populate_drop_down_option();

			// handling dynamic popup which appears on specific time duration
			try {
					driver.findElement(By.className("pt-40")).click();
					System.out.println("Dynamic pop-up appeared");
				} catch (NoSuchElementException e) {
					System.out.println("Dynamic Pop-up didn't appeare");
				}
		
		}

	@When("User navigate to details page")
		public void User_navigate_to_details_page() throws InterruptedException {
			
			ph_detailpage =new Pizza_Hut_DetailPage(driver);
			ph_detailpage.navigate_to_details_page();
		}	

	@Then("User validate vegetarian radio button flag is off")
		public void User_validate_vegetarian_radio_button_flag_is_off() {

			ph_detailpage.validate_vegetarian_radio_button_flag_is_off();
		}

	@And("User clicks on Pizzas menu bar option")
		public void User_clicks_on_Pizzas_menu_bar_option() {
		
			ph_detailpage.clicks_on_Pizzas_menu_bar_option();
	}
		
	@When("User select add button of any pizza from Recommended")
		public void User_select_add_button_of_any_pizza_from_Recommended() throws InterruptedException {
		
			ph_orderpage =new Pizza_Hut_OrderPage(driver);
			ph_orderpage.add_pizza();
		  }

	@Then("User see that the pizza is getting added under Your Basket")
		public void User_see_that_the_pizza_is_getting_added_under_Your_Basket() {
			ph_orderpage.pizza_added();
		}

	@And("User validate pizza price plus Tax is checkout price")
		public void User_validate_pizza_price_plus_Tax_is_checkout_price() {
			ph_orderpage.validate_checkout_price();
		}

	@Then("User validate checkout button contains Item count")
		public void User_validate_checkout_button_contains_Item_count() {
			ph_orderpage.validate_item_count();
		}

	@And("User validate checkout button contains total price count")

		public void User_validate_checkout_button_contains_total_price_count() {
			 ph_orderpage.validate_total_price_count();
		}

	@Then("User clicks on Drinks option")
		public void User_clicks_on_Drinks_option() {
			ph_detailpage.click_drink_menu_bar_option();
		}

	@And("User select Pepsi option to add into the Basket")
		public void User_select_Pepsi_option_to_add_into_the_Basket()  {

			ph_orderpage.add_drinks();

		}

	@Then("User see 2 items are showing under checkout button")
		public void User_see_2_items_are_showing_under_checkout_button() {
			ph_orderpage.validate_itemcount_increased();
		}

	@And("User see total price is now more than before")
		public void User_see_total_price_is_now_more_than_before() {
			ph_orderpage.validate_total_price_more_than_before();
		}

	@Then("User remove the Pizza item from Basket")
		public void User_remove_the_Pizza_item_from_Basket() throws InterruptedException {
			ph_orderpage.remove_the_Pizza_item_from_Basket();
		}

	@And("see Price tag got removed from the checkout button")
		public void see_Price_tag_got_removed_from_the_checkout_button() {
			ph_orderpage.price_tag_removed_from_checkout_button();
		}
	
	@And("User see 1 item showing in checkout button")
		public void User_see_1_item_showing_in_checkout_button() {
			ph_orderpage.validate_itemcount_reduced();
		}

	@Then("User Clicks on Checkout button")
		public void User_Clicks_on_Checkout_button() throws InterruptedException {
			ph_orderpage.click_checkout_btn();
		}

	@And("User see minimum order required pop up is getting displayed")
		public void User_see_minimum_order_required_pop_up_is_getting_displayed() {
			ph_orderpage.error_msg();
	}
	
	
	@After
	    public void tearDown() {
		 
	   	 driver.quit();
	    }
}