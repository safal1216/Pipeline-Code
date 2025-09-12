Feature: Validate Home Page Functionalities

  Scenario: Navigate to the home page
    Given User opens the browser
    And navigates to the home page
    When User performs a search action
    Then The system displays the search results successfully