$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:pizzahut.feature");
formatter.feature({
  "name": "Feature1 to test pizzahut site",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate Pizzahut site launch",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "User launch Pizzahut application with \"\u003cURL\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User see pop up for delivery asking for enter location",
  "keyword": "When "
});
formatter.step({
  "name": "User type address as \"\u003cLocation\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "User select first auto populate drop down option",
  "keyword": "And "
});
formatter.step({
  "name": "User navigate to details page",
  "keyword": "When "
});
formatter.step({
  "name": "User validate vegetarian radio button flag is off",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on Pizzas menu bar option",
  "keyword": "And "
});
formatter.step({
  "name": "User select add button of any pizza from Recommended",
  "keyword": "When "
});
formatter.step({
  "name": "User see that the pizza is getting added under Your Basket",
  "keyword": "Then "
});
formatter.step({
  "name": "User validate pizza price plus Tax is checkout price",
  "keyword": "And "
});
formatter.step({
  "name": "User validate checkout button contains Item count",
  "keyword": "Then "
});
formatter.step({
  "name": "User validate checkout button contains total price count",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on Drinks option",
  "keyword": "Then "
});
formatter.step({
  "name": "User select Pepsi option to add into the Basket",
  "keyword": "And "
});
formatter.step({
  "name": "User see 2 items are showing under checkout button",
  "keyword": "Then "
});
formatter.step({
  "name": "User see total price is now more than before",
  "keyword": "And "
});
formatter.step({
  "name": "User remove the Pizza item from Basket",
  "keyword": "Then "
});
formatter.step({
  "name": "see Price tag got removed from the checkout button",
  "keyword": "And "
});
formatter.step({
  "name": "User see 1 item showing in checkout button",
  "keyword": "And "
});
formatter.step({
  "name": "User Clicks on Checkout button",
  "keyword": "Then "
});
formatter.step({
  "name": "User see minimum order required pop up is getting displayed",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "URL",
        "Location"
      ]
    },
    {
      "cells": [
        "https://www.pizzahut.co.in/",
        "lulu center bengaluru"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate Pizzahut site launch",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch Pizzahut application with \"https://www.pizzahut.co.in/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Test_Steps_POM.user_launch_Pizzahut_application_with(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User see pop up for delivery asking for enter location",
  "keyword": "When "
});
formatter.match({
  "location": "Test_Steps_POM.User_see_pop_up_for_delivery_asking_for_enter_location()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User type address as \"lulu center bengaluru\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps_POM.User_type_address_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select first auto populate drop down option",
  "keyword": "And "
});
formatter.match({
  "location": "Test_Steps_POM.User_select_first_auto_populate_drop_down_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigate to details page",
  "keyword": "When "
});
formatter.match({
  "location": "Test_Steps_POM.User_navigate_to_details_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User validate vegetarian radio button flag is off",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps_POM.User_validate_vegetarian_radio_button_flag_is_off()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Pizzas menu bar option",
  "keyword": "And "
});
formatter.match({
  "location": "Test_Steps_POM.User_clicks_on_Pizzas_menu_bar_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select add button of any pizza from Recommended",
  "keyword": "When "
});
formatter.match({
  "location": "Test_Steps_POM.User_select_add_button_of_any_pizza_from_Recommended()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User see that the pizza is getting added under Your Basket",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps_POM.User_see_that_the_pizza_is_getting_added_under_Your_Basket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User validate pizza price plus Tax is checkout price",
  "keyword": "And "
});
formatter.match({
  "location": "Test_Steps_POM.User_validate_pizza_price_plus_Tax_is_checkout_price()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User validate checkout button contains Item count",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps_POM.User_validate_checkout_button_contains_Item_count()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User validate checkout button contains total price count",
  "keyword": "And "
});
formatter.match({
  "location": "Test_Steps_POM.User_validate_checkout_button_contains_total_price_count()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Drinks option",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps_POM.User_clicks_on_Drinks_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select Pepsi option to add into the Basket",
  "keyword": "And "
});
formatter.match({
  "location": "Test_Steps_POM.User_select_Pepsi_option_to_add_into_the_Basket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User see 2 items are showing under checkout button",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps_POM.User_see_2_items_are_showing_under_checkout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User see total price is now more than before",
  "keyword": "And "
});
formatter.match({
  "location": "Test_Steps_POM.User_see_total_price_is_now_more_than_before()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User remove the Pizza item from Basket",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps_POM.User_remove_the_Pizza_item_from_Basket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "see Price tag got removed from the checkout button",
  "keyword": "And "
});
formatter.match({
  "location": "Test_Steps_POM.see_Price_tag_got_removed_from_the_checkout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User see 1 item showing in checkout button",
  "keyword": "And "
});
formatter.match({
  "location": "Test_Steps_POM.User_see_1_item_showing_in_checkout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks on Checkout button",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Steps_POM.User_Clicks_on_Checkout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User see minimum order required pop up is getting displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Test_Steps_POM.User_see_minimum_order_required_pop_up_is_getting_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});