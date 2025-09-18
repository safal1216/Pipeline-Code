package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LatestArticlesAndCollectionsPage;
import org.junit.Assert;

public class LatestArticlesAndCollectionsSteps {

    LatestArticlesAndCollectionsPage articlesPage = new LatestArticlesAndCollectionsPage();

    @Given("I open the homepage")
    public void iOpenTheHomepage() {
        articlesPage.openHomepage();
    }

    @Then("A section for latest articles and collections should be displayed")
    public void aSectionForLatestArticlesAndCollectionsShouldBeDisplayed() {
        Assert.assertTrue(articlesPage.isSectionDisplayed());
    }

    @Given("I inspect items in the latest articles and collections section")
    public void iInspectItemsInTheLatestArticlesAndCollectionsSection() {
        articlesPage.inspectSectionItems();
    }

    @Then("Each item should show a thumbnail image, title, and publication date")
    public void eachItemShouldShowAThumbnailImageTitleAndPublicationDate() {
        Assert.assertTrue(articlesPage.areItemsValid());
    }

    @Given("I observe the order of items in the section")
    public void iObserveTheOrderOfItemsInTheSection() {
        articlesPage.observeItemOrder();
    }

    @Then("Items should be sorted with the most recent first")
    public void itemsShouldBeSortedWithTheMostRecentFirst() {
        Assert.assertTrue(articlesPage.isSortedByDate());
    }

    @Given("I click on an item in the latest articles and collections section")
    public void iClickOnAnItemInTheLatestArticlesAndCollectionsSection() {
        articlesPage.clickOnItem();
    }

    @Then("I should be taken to the full article or collection page")
    public void iShouldBeTakenToTheFullArticleOrCollectionPage() {
        Assert.assertTrue(articlesPage.isNavigationToFullPageCorrect());
    }
}