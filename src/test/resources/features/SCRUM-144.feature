Feature: Featured Content Slider
  As a user, I want to interact with the featured content slider so that I can explore highlighted content.

  Scenario: Verify the presence of featured content slider on homepage
    Given I open the homepage
    Then A featured content slider should be present on the homepage

  Scenario: Verify the slider displays at least 3 featured items
    Given I open the homepage
    Then The slider should display at least 3 featured items

  Scenario: Verify each slider item has required elements
    When I inspect each item in the slider
    Then Each item should have an image, title, and brief description

  Scenario: Verify slider navigation using arrow buttons
    When I use arrow buttons to navigate through the slider
    Then I should be able to navigate through the slider using arrow buttons

  Scenario: Verify slider navigation using dots
    When I use dots to navigate through the slider
    Then I should be able to navigate through the slider using dots

  Scenario: Verify clicking on a featured item opens the full article/collection
    When I click on a featured item in the slider
    Then I should be taken to the full article or collection page