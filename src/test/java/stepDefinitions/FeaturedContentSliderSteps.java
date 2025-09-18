package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.FeaturedContentSliderPage;
import org.junit.Assert;

public class FeaturedContentSliderSteps {

    FeaturedContentSliderPage sliderPage = new FeaturedContentSliderPage();

    @Given("I open the homepage")
    public void iOpenTheHomepage() {
        sliderPage.openHomepage();
    }

    @Then("A featured content slider should be present on the homepage")
    public void aFeaturedContentSliderShouldBePresentOnTheHomepage() {
        Assert.assertTrue(sliderPage.isSliderPresent());
    }

    @Then("The slider should display at least 3 featured items")
    public void theSliderShouldDisplayAtLeast3FeaturedItems() {
        Assert.assertTrue(sliderPage.hasMinimumFeaturedItems(3));
    }

    @Given("I inspect each item in the slider")
    public void iInspectEachItemInTheSlider() {
        sliderPage.inspectSliderItems();
    }

    @Then("Each item should have an image, title, and brief description")
    public void eachItemShouldHaveAnImageTitleAndBriefDescription() {
        Assert.assertTrue(sliderPage.areSliderItemsValid());
    }

    @Given("I use arrow buttons to navigate through the slider")
    public void iUseArrowButtonsToNavigateThroughTheSlider() {
        sliderPage.navigateUsingArrows();
    }

    @Then("I should be able to navigate through the slider using arrow buttons")
    public void iShouldBeAbleToNavigateThroughTheSliderUsingArrowButtons() {
        Assert.assertTrue(sliderPage.isArrowNavigationFunctional());
    }

    @Given("I use dots to navigate through the slider")
    public void iUseDotsToNavigateThroughTheSlider() {
        sliderPage.navigateUsingDots();
    }

    @Then("I should be able to navigate through the slider using dots")
    public void iShouldBeAbleToNavigateThroughTheSliderUsingDots() {
        Assert.assertTrue(sliderPage.isDotNavigationFunctional());
    }

    @Given("I click on a featured item in the slider")
    public void iClickOnAFeaturedItemInTheSlider() {
        sliderPage.clickOnFeaturedItem();
    }

    @Then("I should be taken to the full article or collection page")
    public void iShouldBeTakenToTheFullArticleOrCollectionPage() {
        Assert.assertTrue(sliderPage.isNavigationToFullPageCorrect());
    }
}