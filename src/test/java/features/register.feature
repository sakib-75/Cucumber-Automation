Feature: Perform registration process for new users and Sign Out
  Scenario: Create user one
    Given Initialize the browser with chrome
    And Navigate to "http://automationpractice.com" site
    And Go to Sign in page
    And Provide "first" user email and click on Create an account
    When Providing "first" user information
    Then Verify that user is succesfully created
    And close browsers

  Scenario: Create user two
    Given Initialize the browser with chrome
    And Navigate to "http://automationpractice.com" site
    And Go to Sign in page
    And Provide "second" user email and click on Create an account
    When Providing "second" user information
    Then Verify that user is succesfully created
    And close browsers
