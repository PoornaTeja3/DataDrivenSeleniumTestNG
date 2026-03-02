Feature: Data Table Demo

  Scenario: Login using multiple users

    Given user is on login page
    When user enters credentials
      | username | password |
      | admin    | admin123 |
      | user1    | pass123  |
    Then user should see homepage