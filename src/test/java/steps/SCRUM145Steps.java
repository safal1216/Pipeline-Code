package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LatestArticlesPage;

public class SCRUM145Steps {
    WebDriver driver = new ChromeDriver();
    LatestArticlesPage latestArticlesPage = new LatestArticlesPage(driver);

    @Given("I open the homepage")
    public void iOpenTheHomepage() {
        driver.get("https://example.com");
    }

    @Then("A section for latest articles and collections should be displayed")
    public void aSectionForLatestArticlesAndCollectionsShouldBeDisplayed() {
        assert latestArticlesPage.isLatestArticlesSectionVisible();
    }

    @When("I inspect items in the latest articles and collections section")
    public void iInspectItemsInTheLatestArticlesAndCollectionsSection() {
        // Add logic to inspect items
    }

    @Then("Each item should show a thumbnail image, title, and publication date")
    public void eachItemShouldShowRequiredElements() {
        // Add validation logic for each item
    }

    @When("I observe the order of items in the section")
    public void iObserveTheOrderOfItemsInTheSection() {
        // Add logic to observe order
    }

    @Then("Items should be sorted with the most recent first")
    public void itemsShouldBeSortedWithTheMostRecentFirst() {
        // Add validation logic for sorting
    }

    @When("I click on an item in the latest articles and collections section")
    public void iClickOnAnItemInTheLatestArticlesAndCollectionsSection() {
        latestArticlesPage.clickArticleItem(0);
    }

    @Then("I should be taken to the full article or collection page")
    public void iShouldBeTakenToTheFullArticleOrCollectionPage() {
        // Add validation logic for navigation
    }
}