Feature: Contact Page Verification
  Scenario: Verify elements on the Contact page
    Given The user is on the Contact page
    Then The page title should be displayed
    Then The country field should be displayed
    Then The address field should be displayed
    Then The Reg. Number should be displayed