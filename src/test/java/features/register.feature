Feature: Perform registration process for new users and Sign Out
  Scenario: Create 1st user
    Given Initialize the browser with chrome
    And Navigate to "https://letcode.in/" site
    And Go to Sign up page
    When Providing "1st" user information
    Then Verify that user is succesfully created
    And close browsers

  Scenario: Create 2nd user
    Given Initialize the browser with chrome
    And Navigate to "https://letcode.in/" site
    And Go to Sign up page
    When Providing "2nd" user information
    Then Verify that user is succesfully created
    And close browsers

