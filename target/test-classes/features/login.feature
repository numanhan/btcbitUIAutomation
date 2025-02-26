Feature: Login
  Scenario: User navigates to the login page and logs in
    Given The user is on the homepage for login
    When The user clicks on login button
    Then The user inputs login credentials
    Then The user clicks on Sign In
    Then User verifies page text