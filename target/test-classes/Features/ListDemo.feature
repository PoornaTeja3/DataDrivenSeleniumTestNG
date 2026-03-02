Feature: List Demo

  Scenario: Login using username list

    Given user is on login page
    When user enters usernames
      | admin |
      | user1 |
      | test  |
    Then user should see homepage