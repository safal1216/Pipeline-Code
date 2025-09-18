Feature: Newsletter Signup Form Verification

  Scenario: Verify the presence of newsletter signup form on homepage
    Given I open the homepage
    Then A newsletter signup form should be present on the homepage

  Scenario: Verify the form requires an email address input
    Given I attempt to submit the form without an email address
    Then Form submission should be prevented, and user should be prompted to enter an email

  Scenario: Verify the presence of a clear signup button
    Given I inspect the newsletter signup form
    Then A clear "Sign Up" or "Subscribe" button should be present

  Scenario: Verify successful form submission
    Given I submit the form with a valid email address
    Then User should receive a confirmation message upon successful submission

  Scenario: Verify email format validation
    Given I submit the form with invalid email formats
    Then The system should validate email format and prevent submission of invalid formats