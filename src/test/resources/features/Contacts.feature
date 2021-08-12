Feature: Contacts page

  Scenario: Default page number
    Given the user is on the login page
    And the user enters the driver information
    When the user navigates to "Customers" "Contacts"
    Then default page number should be 1


  Scenario: Verify create Calendar Events
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigates to "Activities" "Calendar Events"
    Then the title contains "Calendars"


  Scenario: Menu Options Driver
    Given the user logged in as "driver"
    Then the user should see followig options
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |


  Scenario: Menu Options Sales Manager
    Given the user logged in as "sales manager"
    Then the user should see followig options
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |


  Scenario: login as a givn user
    Given the user is on the login page
    When the user logs in using following credentials
      | username  | user10      |
      | password  | UserUser123 |
      | firstname | Toney       |
      | lastname  | Hegmann     |
    Then the user should be able to login


  Scenario Outline: login as a given user
    Given the user is on the login page
    When the user logs in using following credentials
      | username  | <user>      |
      | password  | UserUser123 |
      | firstname | <firstName> |
      | lastname  | <lastName>  |
    Then the user should be able to login

    Examples:
      | user           | firstName | lastName |
      | user10         | Toney     | Hegmann   |
      | storemanager85 | Marcella   | Huels |






