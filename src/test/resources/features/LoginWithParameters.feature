Feature: Login as a diff user


  Scenario: login as different users
    Given the user is on the login page
    When the user logs in using "User11" and "UserUser123"
    Then the user should be able to login
    And the title contains "Dashboard"