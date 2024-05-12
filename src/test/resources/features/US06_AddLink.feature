@PRG3-548
Feature:As a user, I should be able to add link in message.
  Background:
    Given user is logged in with valid credentials

  @PRG3-549
  Scenario:verify that the user can attach a link to specified text
    When user clicks Message module
    And user clicks link
    Then user is able to add a Link Url
    And user is able to add a Link text
    When user clicks Save
    And user clicks send
    Then user can see the link displayed in main page of Message


    @PRG3-550
  Scenario:verify that the user is redireected to specified url
    When user clicks Message module
    And user clicks link
    Then user is able to add a Link Url
    And user is able to add a Link text
    When user clicks Save
    And user clicks send
    When user clicks the link that is displayed in main page of Message
    Then user is redirected to the specified url