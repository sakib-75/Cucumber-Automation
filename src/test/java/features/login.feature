Feature: Login into Application

  Scenario Outline: Positive test validating login
    Given Initialize the browser with chrome
    And Navigate to "https://letcode.in/" site
    And Go to Log in page
    When User enters <email> and <password> and logs in
    Then Verify that user is succesfully logged in
    And Close browsers
    Examples:
      | email                | password |
      | sakib1233@gmail.com  | 123@#$   |
      | mehedi1213@gmail.com | 14323@#$ |