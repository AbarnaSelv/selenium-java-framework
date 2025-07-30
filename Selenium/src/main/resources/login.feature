Feature: Login functionality

  Scenario: Valid login
    Given I launch the browser
    When I enter valid credentials
    Then I should land on the dashboard
