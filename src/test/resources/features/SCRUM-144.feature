Feature: Featured Content Slider Verification

  Scenario: Verify the presence of featured content slider on homepage
    Given I open the homepage
    Then A featured content slider should be present on the homepage

  Scenario: Verify the slider displays at least 3 featured items
    Given I open the homepage
    Then The slider should display at least 3 featured items

  Scenario: Verify each slider item has required elements
    Given I inspect each item in the slider
    Then Each item should have an image, title, and brief description

  Scenario: Verify slider navigation using arrow buttons
    Given I use arrow buttons to navigate through the slider
    Then I should be able to navigate through the slider using arrow buttons

  Scenario: Verify slider navigation using dots
    Given I use dots to navigate through the slider
    Then I should be able to navigate through the slider using dots

  Scenario: Verify clicking on a featured item opens the full article/collection
    Given I click on a featured item in the slider
    Then I should be taken to the full article or collection page