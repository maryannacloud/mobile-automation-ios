Feature: Verify Navigation

  Scenario: Verify product navigation
    Given user open application
    Then verify user is on login screen
    When user login with username "standard_user" and password "secret_sauce"
    Then verify user is on home screen
    And verify details of product on homepage and product details page


  Scenario: Verify cart quantity is getting updated
    Given user open application
    Then verify user is on login screen
    When user login with username "standard_user" and password "secret_sauce"
    Then verify user is on home screen
    When user click on the product "Sauce Labs Backpack"
    Then verify product details page is displayed
    When user click on add to cart button
    Then verify cart icon display the quantity count "1"
    When user click on home burger menu
    And click on the ALL ITEMS menu
    Then verify user is on home screen
    When user click on the product "Sauce Labs Bike Light"
    Then verify product details page is displayed
    When user click on add to cart button
    Then verify cart icon display the quantity count "2"

  Scenario: Verify user can place order
    Given user open application
    Then verify user is on login screen
    When user login with username "standard_user" and password "secret_sauce"
    Then verify user is on home screen
    When user click on the product "Sauce Labs Backpack"
    Then verify product details page is displayed
    When user click on add to cart button
    Then verify cart icon display the quantity count "1"
    When user click on cart icon
    Then verify user is on cart page
    When user click on checkout button
    Then verify user is on checkout page
    When user fills all the checkout details
    And click on continue button on checkout page
    Then verify user is on review page
    When user click on finish button on review page
    Then verify user is on order confirmation page
    When user click on Back to Home button
    Then verify user is on home screen