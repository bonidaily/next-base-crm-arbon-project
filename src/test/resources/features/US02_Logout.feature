@PRG3-539
Feature: As a user, I should be able to logout

  @PRG3-540
  Scenario: verify that user can logout after clicking "Log out" button
    Given user is logged in with valid credentials
    When user clicks on the profile name
    Then user should be able to click Log out

  @PRG3-541
  Scenario: verify user see 5 options under the profile name
    Given user is logged in with valid credentials
    When user clicks on the profile name
    Then user should be able to see five options
      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure notifications |
      | Log out                 |
