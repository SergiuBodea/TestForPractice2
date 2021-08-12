
@login
Feature: User should be able to login

  Background:
    Given the user is on the login page

@driver @VYT-123
  Scenario: Login as a driver

    When the user enters the driver information
    Then the user should be able to login


@sales_manager @VYT-123
  Scenario: Login as sales manager

    When the user enters the sales manager information
    Then the user should be able to login


@store_manager @smoke
  Scenario: Login as store manager

    When the user enters the store moanager information
      And we hope for the best
    Then the user should be able to login