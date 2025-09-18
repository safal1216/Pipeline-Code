package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.EssaysSectionPage;

public class SCRUM147Steps {
    WebDriver driver = new ChromeDriver();
    EssaysSectionPage essaysSectionPage = new EssaysSectionPage(driver);

    @Given("I navigate to the Essays section")
    public void iNavigateToTheEssaysSection() {
        driver.get("https://example.com/essays");
    }

    @Then("The Essays section should display a list of available essays")
    public void theEssaysSectionShouldDisplayAListOfAvailableEssays() {
        assert essaysSectionPage.isEssaysSectionVisible();
    }

    @When("I inspect individual essays in the list")
    public void iInspectIndividualEssaysInTheList() {
        // Add logic to inspect essays
    }

    @Then("Each essay should show a thumbnail image, title, author, and brief description")
    public void eachEssayShouldShowRequiredInformation() {
        // Add validation logic for each essay
    }

    @When("I observe the order of essays in the list")
    public void iObserveTheOrderOfEssaysInTheList() {
        // Add logic to observe order
    }

    @Then("Essays should be sorted with the most recent first")
    public void essaysShouldBeSortedWithTheMostRecentFirst() {
        // Add validation logic for sorting
    }

    @When("I navigate through the essays list")
    public void iNavigateThroughTheEssaysList() {
        // Add logic for pagination
    }

    @Then("The list should be paginated with options to navigate between pages")
    public void theListShouldBePaginated() {
        assert essaysSectionPage.isPaginationVisible();
    }

    @When("I count the number of essays on a single page")
    public void iCountTheNumberOfEssaysOnASinglePage() {
        // Add logic to count essays
    }

    @Then("There should be at least 10 essays per page")
    public void thereShouldBeAtLeast10EssaysPerPage() {
        assert essaysSectionPage.getEssayItems().size() >= 10;
    }
}