@navigate
Feature: Navigation Menu

  Scenario: Navigation through Fleet Vehicles
    Given the user is on the login page
    And the user enters the sales manager information
    When the user should navigate to Fleet Vehicles
    Then the user should be on Vehicles page


@db
  Scenario: Navigation through Marketing Campaigns
    Given the user is on the login page
    And the user enters the sales manager information
    When the user should navigate to Marketing Campaigns
    Then the user should be on Campaigns page



  Scenario: Navigation through Calendar Events
    Given the user is on the login page
    And the user enters the sales manager information
    When the user should navigate to Activities Calendar Events
    Then the user should be on Calendar Events page