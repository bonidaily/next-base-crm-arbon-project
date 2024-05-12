@PRG3-577
Feature: As a user, I should be able to access to the Company page.

  @PRG3-577
  Scenario: Verify that the user can see the following modules on the Company page shown as design.
    Given user is logged in with valid credentials
    When user clicks Company page
    Then user should be able to see modules:
      | Official Information |
      | Our Life             |
      | About Company        |
      | Photo Company        |
      | Video                |
      | Career               |
      | Business News(RSS)   |
      | More                 |