@PRG3-558
Feature: user should be able to see all the options on the Activity stream page

  Background:
    Given user is logged in with valid credentials

  @PRG3-559
  Scenario: Verify that the user views five options on the Activity Stream page
    When user clicks Activity stream page
    Then user is able to see following modules
      | MESSAGE |
      | TASK    |
      | EVENT   |
      | POLL    |
      | MORE    |

  @PRG3-560
  Scenario: verify user see four modules after clicking more module
    When user clicks Activity stream page
    Then user clicks more
    Then user should be able to see following modules
      | File         |
      | Appreciation |
      | Announcement |
      | Workflow     |