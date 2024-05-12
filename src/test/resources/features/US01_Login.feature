@PRG3-523
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  @PRG3-525
  Scenario Outline: Verify login with different user types
    When user is enter valid "<username>" and "<password>"
    Then the user should be redirected to the home page
    Examples:
      | username             | password |
      | hr1@cydeo.com        | UserUser |
      | helpdesk1@cydeo.com  | UserUser |
      | marketing1@cydeo.com | UserUser |

  @PRG3-526
  Scenario Outline: verify error message is displayed when user enters invalid credentials
    When user enter invalid "<username>" or "<password>"
    Then user should see error message "Incorrect login or password"
    Examples:
      | username            | password |
      | hr1@.com            | UserUser |
      | helpdesk1@cydeo.com | 123345   |

    @@PRG3-527
  Scenario: verify error message is displayed when if username or password is empty
    When user enter username only username
    Then user should see error message "Please fill out this field"








