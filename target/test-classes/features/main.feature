Feature: Main

  Background:
    Given user should open login page
    When user should enter valid credentials
    Then should see main page and verify

@wip
  Scenario: As a user, I should be able to search a product
    Given Go to searchbar and type "bilgisayar"
    And User should go to second page and verify
    And User should select a random product
    And Selected product's description and price should stored as txt file
    And User should add selected product to basket
    And Verify that product price and product price in basket
    And Increase product amount and verify
    And Delete product from basket and verify basket is free