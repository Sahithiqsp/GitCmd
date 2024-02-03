Feature: 

  Background: 
    Given Login Page must display

  Scenario Outline:

    When Fill the username <un>
    And Fill the password <pwd>
    And Click on login
    Then Home Page must Display
    
   Examples:
   |un|pwd|
   |"admin"|"admin"|
   |"admin"|" "|
   |"  "|"  "|
   |1234|3333|
   