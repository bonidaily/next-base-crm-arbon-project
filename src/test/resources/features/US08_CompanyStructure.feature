@PRG3-553
Feature: As a user, I should be able to use functions on Company Structure under Employee menu.

  @PRG3-554
  Scenario Outline: Verify that the Company Structure is visible for all user types
    Given user is logged in with valid "<username>" and "<password>"
    When user clicks on Employee page
    Then user should see Company Structure
    Examples:
      | username             | password |
      | hr1@cydeo.com        | UserUser |
      | helpdesk1@cydeo.com  | UserUser |
      | marketing1@cydeo.com | UserUser |

    @PRG3-555
    Scenario: Verify that the HR user can add a department from the Company Structure
      Given user is logged in with username "hr1@cydeo.com" and password "UserUser"
      Then user clicks on Employee page
      And user click Add Department
      Then user should be able to write department name
      And user should be able to select parent department
      And user should be able to select supervisor from structure
      When user clicks Add
      Then user should be able to see

      @PRG3-556
  Scenario Outline: verify that the add department is not displayed for helpdesk and marketing users
        Given user is logged in with given "<username>" and "<password>"
        When user clicks on Employee page
        Then user should not be able to see Add department
        Examples:
        | username             | password |
        | helpdesk1@cydeo.com  | UserUser |
        | marketing1@cydeo.com | UserUser |

