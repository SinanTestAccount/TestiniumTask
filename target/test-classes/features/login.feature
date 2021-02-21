Feature: Login


  Scenario: As a user, I should be able to login with valid credentials
    Given user should open login page
    When user should enter valid credentials
    Then should see main page and verify
