$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/main.feature");
formatter.feature({
  "name": "Main",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user should open login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.LoginStepDefinition.user_should_open_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.LoginStepDefinition.user_should_enter_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "should see main page and verify",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.LoginStepDefinition.should_see_main_page_and_verify()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "As a user, I should be able to search a product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "Go to searchbar and type \"bilgisayar\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.MainStepDefinition.go_to_searchbar_and_type(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should go to second page and verify",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.ProductListStepDefinition.user_should_go_to_second_page_and_verify()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select a random product",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.ProductListStepDefinition.user_should_select_a_random_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Selected product\u0027s description and price should stored as txt file",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.ProductListStepDefinition.selected_product_s_description_and_price_should_stored_as_txt_file()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should add selected product to basket",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.ProductListStepDefinition.user_should_add_selected_product_to_basket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that product price and product price in basket",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.BasketStepDefinition.verify_that_product_price_and_product_price_in_basket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Increase product amount and verify",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.BasketStepDefinition.increase_product_amount_and_verify()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Delete product from basket and verify basket is free",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.BasketStepDefinition.delete_product_from_basket_and_verify_basket_is_free()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});