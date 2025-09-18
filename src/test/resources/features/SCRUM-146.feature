Feature: Newsletter Signup Form
  As a user, I want to sign up for the newsletter so that I can receive updates and news.

  Scenario: Verify the presence of newsletter signup form on homepage
    Given I open the homepage
    Then A newsletter signup form should be present on the homepage

  Scenario: Verify the form requires an email address input
    When I attempt to submit the form without an email address
    Then Form submission should be prevented, and I should be prompted to enter an email

  Scenario: Verify the presence of a clear signup button
    When I inspect the newsletter signup form
    Then A clear "Sign Up" or "Subscribe" button should be present

  Scenario: Verify successful form submission
    When I submit the form with a valid email address
    Then I should receive a confirmation message upon successful submission

  Scenario: Verify email format validation
    When I submit the form with invalid email formats
    Then The system should validate email format and prevent submission of invalid formats