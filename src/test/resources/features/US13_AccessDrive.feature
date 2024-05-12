@PRG3-573
Feature:  As a user, I should be able to access the Drive page.

  @PRG3-574
  Scenario:Verify that the user can see the following 7 modules on the Drive page
    Given user is logged in with valid credentials
    When user clicks Drive page
    Then user is able to see 7 modules
      | My Drive                   |
      | All Documents              |
      | Company Drive              |
      | Sales and Marketing        |
      | Top Management’s documents |
      | Drive Cleanup              |
      | More                       |


