package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.NavigationMenuPage;

public class NavigationMenuSteps {

    NavigationMenuPage navigationMenuPage = new NavigationMenuPage();

    @Given("I open any page of the website")
    public void iOpenAnyPageOfTheWebsite() {
        navigationMenuPage.openAnyPage();
    }

    @Then("The main navigation menu should be visible and accessible")
    public void theMainNavigationMenuShouldBeVisibleAndAccessible() {
        Assert.assertTrue(navigationMenuPage.isNavigationMenuVisible());
    }

    @Given("I open the website")
    public void iOpenTheWebsite() {
        navigationMenuPage.openWebsite();
    }

    @When("I inspect the menu items")
    public void iInspectTheMenuItems() {
        navigationMenuPage.inspectMenuItems();
    }

    @Then("The menu should include links to Essays, Collections, Curator's Choice, Shop, About, and Search")
    public void theMenuShouldIncludeLinksToRequiredSections() {
        Assert.assertTrue(navigationMenuPage.areRequiredLinksPresent());
    }

    @When("I click on each menu item")
    public void iClickOnEachMenuItem() {
        navigationMenuPage.clickOnMenuItems();
    }

    @Then("I should be taken to the corresponding section for each menu item")
    public void iShouldBeTakenToTheCorrespondingSectionForEachMenuItem() {
        Assert.assertTrue(navigationMenuPage.isNavigationCorrect());
    }

    @Given("I navigate to different sections of the website")
    public void iNavigateToDifferentSectionsOfTheWebsite() {
        navigationMenuPage.navigateToDifferentSections();
    }

    @Then("The current section should be highlighted in the navigation menu")
    public void theCurrentSectionShouldBeHighlightedInTheNavigationMenu() {
        Assert.assertTrue(navigationMenuPage.isCurrentSectionHighlighted());
    }

    @Given("I access the website on various mobile devices")
    public void iAccessTheWebsiteOnVariousMobileDevices() {
        navigationMenuPage.accessOnMobileDevices();
    }

    @Then("The navigation menu should be accessible and function correctly on mobile devices")
    public void theNavigationMenuShouldBeAccessibleAndFunctionCorrectlyOnMobileDevices() {
        Assert.assertTrue(navigationMenuPage.isMobileNavigationFunctional());
    }
}