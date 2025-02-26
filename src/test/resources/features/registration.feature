Feature: Registration
  Scenario: User navigates to the registration page
    Given The user is on the homepage
    When The user clicks on the "Get Started" button
    Then The user fill the credentials
    And The user clicks on agreement
    Then The user clicks signup button