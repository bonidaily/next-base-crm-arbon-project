@B33G3-112
Feature: As a user, I should be able to send appreciation by clicking on Appreciation tab in the Activity Stream

  Background:
    Given user is logged in with valid credentials

  @B33G3-105
  Scenario: verify user can send an appreciation by filling in the mandatory fields
    When user clicks the module More
    And user clicks Appreciation under More module
    Then user should write a message
    And user should remove delivery to all employees
    And user should specify at least one person
    When user clicks send
    Then user should be able to see the message on Activity Stream mainpage

  @B33G3-106
  Scenario: verify user see error message when trying to send a message without content
    When user clicks the module More
    And user clicks Appreciation under More module
    Then user should specify at least one person
    When user clicks send
    Then user should see an error message "The message title is not specified."

  @B33G3-107
  Scenario: verify user see error message when trying to send a message without specifying at least one person
    When user clicks the module More
    And user clicks Appreciation under More module
    Then user should write a message
    When user does not specify at least one person to recieve the message
    And user clicks send
    Then user should see an error message "Please specify at least one person."

  @B33G3-108
  Scenario: verify user see delivery by default is All employees
    When user clicks the module More
    And user clicks Appreciation under More module
    Then user should be able to see delivery by default is "All employees"

  @B33G3-109
  Scenario: verify user is able to cancel sending appreciation at any time before sending
    When user clicks the module More
    And user clicks Appreciation under More module
    Then user should write a message
    And user should specify at least one person
    When user clicks cancel
    Then user is able to cancel sending




