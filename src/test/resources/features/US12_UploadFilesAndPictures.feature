@PRG3-587
Feature: As a user, I should be able to upload files and pictures to appreciation

  Background:
    Given user is logged in with valid credentials

  @PRG3-588
  Scenario: verify that user can upload files and pictures
    When user clicks the module More
    Then user clicks Appreciation under More module
    Then user clicks upload button
    Then user is able to upload files and pictures
    When user clicks send
    Then user should be able to see the file is sent

  @PRG3-589
  Scenario: Verify that the user can insert the files and images into the text.
    When user clicks the module More
    Then user clicks Appreciation under More module
    Then user clicks upload button
    Then user is able to upload files and pictures
    When user clicks insert in text button
    Then user is able to see link in text

  @PRG3-590
  Scenario:Verify that the user can remove files and images at any time before sending
    When user clicks the module More
    Then user clicks Appreciation under More module
    Then user clicks upload button
    Then user is able to upload files and pictures
    When user clicks insert in text button
    And user is able to see link in text
    Then user should be able to remove files and images before sending




