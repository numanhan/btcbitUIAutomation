Feature: Contact Page Verification
  Scenario: Verify elements on the Contact page
    Given The user is on the Contact page
    Then The page title should be displayed
    And The name input field should be displayed
    And The email input field should be displayed
    And The message input field should be displayed
    And The submit button should be displayed