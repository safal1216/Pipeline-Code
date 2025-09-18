Feature: Essays Section Verification

  Scenario: Verify the presence of Essays section
    Given I navigate to the Essays section
    Then The Essays section should display a list of available essays

  Scenario: Verify each essay displays required information
    Given I inspect individual essays in the list
    Then Each essay should show a thumbnail image, title, author, and brief description

  Scenario: Verify essays are sorted by publication date
    Given I observe the order of essays in the list
    Then Essays should be sorted with the most recent first

  Scenario: Verify pagination of essays list
    Given I navigate through the essays list
    Then The list should be paginated with options to navigate between pages

  Scenario: Verify the number of essays per page
    Given I count the number of essays on a single page
    Then There should be at least 10 essays per page