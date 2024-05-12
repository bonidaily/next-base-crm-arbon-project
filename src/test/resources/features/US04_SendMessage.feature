@PRG3-579
Feature: As a user, I should be able to send appreciation by clicking on Appreciation tab in the Activity Stream

  Background:
    Given user is logged in with valid credentials

  @PRG3-580
  Scenario: verify user can send a message by filling in the mandatory fields
    When user clicks Activity stream page
    And user clicks Message module
    Then user should write a message
    And user should remove delivery to all employees
    And user should specify at least one person
    When user clicks send
    Then user should be able to see the message on Activity Stream mainpage

  @PRG3-581
  Scenario: verify user see error message when trying to send a message without content
    When user clicks Activity stream page
    And user clicks Message module
    Then user should specify at least one person
    When user clicks send
    Then user should see an error message "The message title is not specified."

  @PRG3-582
  Scenario: verify user see error message when trying to send a message without specifying at least one person
    When user clicks Activity stream page
    And user clicks Message module
    Then user should write a message
    When user does not specify at least one person to recieve the message
    And user clicks send
    Then user should see an error message "Please specify at least one person."

  @PRG3-583
  Scenario: verify user see delivery by default is All employees
    When user clicks Activity stream page
    And user clicks Message module
    Then user should be able to see delivery by default is "All employees"

  @PRG3-584
  Scenario: verify user is able to cancel sending message at any time before sending
    When user clicks Activity stream page
    And user clicks Message module
    Then user should write a message
    And user should specify at least one person
    When user clicks cancel
    Then user is able to cancel sending
