package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.EssaysSectionPage;
import org.junit.Assert;

public class EssaysSectionSteps {

    EssaysSectionPage essaysPage = new EssaysSectionPage();

    @Given("I navigate to the Essays section")
    public void iNavigateToTheEssaysSection() {
        essaysPage.navigateToEssaysSection();
    }

    @Then("The Essays section should display a list of available essays")
    public void theEssaysSectionShouldDisplayAListOfAvailableEssays() {
        Assert.assertTrue(essaysPage.isEssaysListDisplayed());
    }

    @Given("I inspect individual essays in the list")
    public void iInspectIndividualEssaysInTheList() {
        essaysPage.inspectEssaysList();
    }

    @Then("Each essay should show a thumbnail image, title, author, and brief description")
    public void eachEssayShouldShowAThumbnailImageTitleAuthorAndBriefDescription() {
        Assert.assertTrue(essaysPage.areEssaysValid());
    }

    @Given("I observe the order of essays in the list")
    public void iObserveTheOrderOfEssaysInTheList() {
        essaysPage.observeEssaysOrder();
    }

    @Then("Essays should be sorted with the most recent first")
    public void essaysShouldBeSortedWithTheMostRecentFirst() {
        Assert.assertTrue(essaysPage.isSortedByDate());
    }

    @Given("I navigate through the essays list")
    public void iNavigateThroughTheEssaysList() {
        essaysPage.navigateThroughEssaysList();
    }

    @Then("The list should be paginated with options to navigate between pages")
    public void theListShouldBePaginatedWithOptionsToNavigateBetweenPages() {
        Assert.assertTrue(essaysPage.isPaginationFunctional());
    }

    @Given("I count the number of essays on a single page")
    public void iCountTheNumberOfEssaysOnASinglePage() {
        essaysPage.countEssaysOnPage();
    }

    @Then("There should be at least 10 essays per page")
    public void thereShouldBeAtLeast10EssaysPerPage() {
        Assert.assertTrue(essaysPage.hasMinimumEssaysPerPage(10));
    }
}