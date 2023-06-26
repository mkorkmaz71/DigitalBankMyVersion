@ui
Feature: Validate login functionality

  Scenario: Verify user can login
    Given user open website
    Then verify user is on login page
    When user login with username "login.username" and password "login.password"
    Then verify user is on home page


  Scenario: Verify user can not login
    Given user open website
    Then verify user is on login page
    When user login with username "invalid.username" and password "invalid.password"
    Then verify invalid login error message is displayed