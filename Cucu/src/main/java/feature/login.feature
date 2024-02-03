Feature: 

  Background: 
    Given Login Page must display

  Scenario: 
    When Fill the username
    And Fill the password
    And Click on login
    Then Home Page must Display

  Scenario: 
    When Fill the username
    And Fill the invalid password
    And Click on login
    Then Home Page must not  Display

  Scenario: 
    When Fill the blank username 
    And Fill the blank password
    And Click on login
    Then Home Page must not  Display

  Scenario: 
    When Fill the wrong username
    And Fill the wrong password
    And Click on login
    Then Home Page must not  Display
