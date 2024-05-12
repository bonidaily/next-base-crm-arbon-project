@PRG3-563
Feature: As a user, I should be able to create a poll by clicking on Poll tab in the Activity Stream

  Background:
    Given user is logged in with valid credentials

  @PRG3-564
  Scenario: Verify that the delivery is 'All employees' by default.
    When user clicks Activity stream page
    Then user clicks Poll Tab
    Then use should be able to see All employees by default

  @PRG3-565
  Scenario: Verify that the user can create a poll by adding questions and multiple answers.
    When user clicks Activity stream page
    Then user clicks Poll Tab
    Then user writes a message
    Then user writes a question
    Then user writes first answer
    Then user writes second answer
    When user clicks send
    Then user should be able to see the survey displayed

  @PRG3-566
  Scenario: Verify that the user can select the “Allow multiple choice” checkbox.
    When user clicks Activity stream page
    Then user clicks Poll Tab
    Then user is able to click on multiple choices

  @PRG3-567
  Scenario: verify that user see an error message when sending without title
    When user clicks Activity stream page
    Then user clicks Poll Tab
    Then user writes a question
    Then user writes first answer
    Then user writes second answer
    When user clicks send
    Then user should see an error message "The message title is not specified"

  @PRG3-568
  Scenario: verify user see error message when trying to send a message without specifying at least one person
    When user clicks Activity stream page
    Then user clicks Poll Tab
    Then user writes a message
    Then user writes a question
    Then user writes first answer
    Then user writes second answer
    When user does not specify at least one person to recieve the message
    And user clicks send
    Then user should see an error message "Please specify at least one person."

  @PRG3-569
  Scenario: verify user see error message when user send a message without question
    When user clicks Activity stream page
    Then user clicks Poll Tab
    Then user should writes a message
    Then user writes first answer
    Then user writes second answer
    When user clicks send
    Then user should see an error message "The question text is not specified."

  @PRG3-570
  Scenario: verify user see error message when user send a message without answers
    When user clicks Activity stream page
    Then user clicks Poll Tab
    Then user writes a new message
    Then user writes a question
    When user clicks send
    Then user should see an error message "The question \"Do you enjoy your life as SDET\" has no answers."
