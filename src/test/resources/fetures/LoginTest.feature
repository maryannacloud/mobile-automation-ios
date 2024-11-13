Feature: Test Login Functionality

  Scenario: verify user can login with valid credentials
    Given user open application
    Then verify user is on login screen
    When user login with username "standard_user" and password "secret_sauce"
    Then verify user is on the home screen

  Scenario: verify user can logout
    Given user open application
    Then verify user is on login screen
    When user login with username "standard_user" and password "secret_sauce"
    Then verify user is on the home screen
    Then click on the hamburger menu
    Then click on logout button
    Then verify user is on login screen

  Scenario: Verify user see error for the locked out user
    Given user open application
    Then verify user is on login screen
    When user login with username "standard_user" and password "secret_sauce"
    Then verify locked out user error message is displayed
      | Sorry, this user has been locked out. |
