Feature: Perform registration process for new users and Sign Out

  Scenario: Create 1st user
    Given Go to Sign up page
    When Providing "1st" user information
    Then Verify that user is succesfully created

  Scenario: Create 2nd user
    Given Go to Sign up page
    When Providing "2nd" user information
    Then Verify that user is succesfully created
