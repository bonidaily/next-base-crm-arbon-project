@PRG3-543
Feature:  As a user, I should be able to access my profile page.

  Background:
    Given user is logged in with valid credentials

  @PRG3-545
  Scenario: verify that user see five options on My profile page
    When user clicks on the profile name
    And user clicks on My Profile
    Then user is able to see five options on my Profile page
      | General       |
      | Drive         |
      | Tasks         |
      | Calendar      |
      | Conversations |

  @PRG3-546
  Scenario: verify the email under general tab is same as user account
    When user clicks on the profile name
    And user clicks on My Profile
    Then user should see the email under general tab is same as user account