Feature: Navigation Menu
  As a user, I want to interact with the navigation menu so that I can access different sections of the website.

  Scenario: Verify the main navigation menu is visible on all pages
    Given I open any page of the website
    Then The main navigation menu should be visible and accessible

  Scenario: Verify the navigation menu includes all required links
    Given I open the website
    Then The menu should include links to Essays, Collections, Curator's Choice, Shop, About, and Search

  Scenario: Verify clicking on menu items navigates to correct sections
    When I click on each menu item
    Then I should be taken to the corresponding section for each menu item

  Scenario: Verify current section is highlighted in the navigation menu
    When I navigate to different sections of the website
    Then The current section should be highlighted in the navigation menu

  Scenario: Verify navigation menu functionality on mobile devices
    Given I access the website on various mobile devices
    Then The navigation menu should be accessible and function correctly on mobile devices