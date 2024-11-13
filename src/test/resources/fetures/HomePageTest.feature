Feature: Verify different features available on homepage

  Scenario: Verify user can sort the products alphabetically
    Given user open application
    Then verify user is on login screen
    When user login with username "standard_user" and password "secret_sauce"
    Then verify user is on home screen
    When user click on filter icon
    And select the filter "Name (A to Z)"
    Then verify all the product sorted by alphabetically


  Scenario: Verify product navigation
    Given user open application
    Then verify user is on login screen
    When user login with username "standard_user" and password "secret_sauce"
    Then verify user is on home screen
    When user click on filter icon
    And select the filter "Price (high to low)"
    Then verify all the product sorted by price in descending order