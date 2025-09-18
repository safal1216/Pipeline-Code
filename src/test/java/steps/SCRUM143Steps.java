package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.NavigationMenuPage;

public class SCRUM143Steps {
    WebDriver driver = new ChromeDriver();
    NavigationMenuPage navigationMenuPage = new NavigationMenuPage(driver);

    @Given("I open any page of the website")
    public void iOpenAnyPageOfTheWebsite() {
        driver.get("https://example.com");
    }

    @Then("The main navigation menu should be visible and accessible")
    public void theMainNavigationMenuShouldBeVisibleAndAccessible() {
        assert navigationMenuPage.isNavigationMenuVisible();
    }

    @Given("I open the website")
    public void iOpenTheWebsite() {
        driver.get("https://example.com");
    }

    @Then("The menu should include links to Essays, Collections, Curator's Choice, Shop, About, and Search")
    public void theMenuShouldIncludeLinksToRequiredSections() {
        assert navigationMenuPage.getMenuItems().size() >= 6;
    }

    @When("I click on each menu item")
    public void iClickOnEachMenuItem() {
        for (String item : new String[]{"Essays", "Collections", "Curator's Choice", "Shop", "About", "Search"}) {
            navigationMenuPage.clickMenuItem(item);
        }
    }

    @Then("I should be taken to the corresponding section for each menu item")
    public void iShouldBeTakenToTheCorrespondingSectionForEachMenuItem() {
        // Add validation logic for each section
    }

    @When("I navigate to different sections of the website")
    public void iNavigateToDifferentSectionsOfTheWebsite() {
        for (String item : new String[]{"Essays", "Collections", "Curator's Choice", "Shop", "About", "Search"}) {
            navigationMenuPage.clickMenuItem(item);
        }
    }

    @Then("The current section should be highlighted in the navigation menu")
    public void theCurrentSectionShouldBeHighlightedInTheNavigationMenu() {
        // Add validation logic for highlighting
    }

    @Given("I access the website on various mobile devices")
    public void iAccessTheWebsiteOnVariousMobileDevices() {
        // Add logic for mobile device testing
    }

    @Then("The navigation menu should be accessible and function correctly on mobile devices")
    public void theNavigationMenuShouldBeAccessibleAndFunctionCorrectlyOnMobileDevices() {
        // Add validation logic for mobile functionality
    }
}