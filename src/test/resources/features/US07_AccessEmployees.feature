@PRG3-529
Feature: As a user, I should be able to access the Employees page.

  @PRG3-530
  Scenario:verify that the user views the following 8 modules in the employees page
    Given user is logged in with valid credentials
    When user clicks employees
    Then user should be able to see 8 modules
      | Company Structure   |
      | Find Employee       |
      | Telephone Directory |
      | Staff Changes       |
      | Efficiency Report   |
      | Honored Employees   |
      | Birthdays           |
      | New page            |

  @PRG3-531
  Scenario: Verify that the user views the Company Structure as default by clicking the Employees Module.
    Given user is logged in with valid credentials
    When user clicks employees
    Then user is able to see the Company Structure as default