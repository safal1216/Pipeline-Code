Feature: Latest Articles and Collections Section Verification

  Scenario: Verify the presence of latest articles and collections section on homepage
    Given I open the homepage
    Then A section for latest articles and collections should be displayed

  Scenario: Verify each item in the section has required elements
    Given I inspect items in the latest articles and collections section
    Then Each item should show a thumbnail image, title, and publication date

  Scenario: Verify items are sorted by publication date
    Given I observe the order of items in the section
    Then Items should be sorted with the most recent first

  Scenario: Verify clicking on an item opens the full article/collection
    Given I click on an item in the latest articles and collections section
    Then I should be taken to the full article or collection page