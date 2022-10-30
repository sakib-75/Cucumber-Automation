Feature: Login into Application

  Scenario Outline: Positive test validating login
    Given Go to Log in page
    When User enters <email> and <password> and logs in
    Then Verify that user is successfully logged in
    Examples:
      | email                | password |
      | sakib1233@gmail.com  | 123@#$   |
      | mehedi1213@gmail.com | 14323@#$ |