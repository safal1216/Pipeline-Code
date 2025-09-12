Feature: Validate Home Page Functionalities

  Scenario: Verify the main navigation menu is visible on all pages
    Given User opens the browser
    And navigates to the home page
    Then The main navigation menu should be visible

  Scenario: Verify clicking on menu items navigates to correct sections
    Given User opens the browser
    And navigates to the home page
    When User clicks on the Essays menu item
    Then User should be navigated to the Essays section