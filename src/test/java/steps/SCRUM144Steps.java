package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.FeaturedContentSliderPage;

public class SCRUM144Steps {
    WebDriver driver = new ChromeDriver();
    FeaturedContentSliderPage sliderPage = new FeaturedContentSliderPage(driver);

    @Given("I open the homepage")
    public void iOpenTheHomepage() {
        driver.get("https://example.com");
    }

    @Then("A featured content slider should be present on the homepage")
    public void aFeaturedContentSliderShouldBePresentOnTheHomepage() {
        assert sliderPage.isSliderVisible();
    }

    @Then("The slider should display at least 3 featured items")
    public void theSliderShouldDisplayAtLeast3FeaturedItems() {
        assert sliderPage.getSliderItems().size() >= 3;
    }

    @When("I inspect each item in the slider")
    public void iInspectEachItemInTheSlider() {
        // Add logic to inspect slider items
    }

    @Then("Each item should have an image, title, and brief description")
    public void eachItemShouldHaveRequiredElements() {
        // Add validation logic for each item
    }

    @When("I use arrow buttons to navigate through the slider")
    public void iUseArrowButtonsToNavigateThroughTheSlider() {
        sliderPage.navigateUsingArrow("next");
        sliderPage.navigateUsingArrow("prev");
    }

    @Then("I should be able to navigate through the slider using arrow buttons")
    public void iShouldBeAbleToNavigateThroughTheSliderUsingArrowButtons() {
        // Add validation logic for navigation
    }

    @When("I use dots to navigate through the slider")
    public void iUseDotsToNavigateThroughTheSlider() {
        sliderPage.navigateUsingDot(0);
    }

    @Then("I should be able to navigate through the slider using dots")
    public void iShouldBeAbleToNavigateThroughTheSliderUsingDots() {
        // Add validation logic for navigation
    }

    @When("I click on a featured item in the slider")
    public void iClickOnAFeaturedItemInTheSlider() {
        sliderPage.clickSliderItem(0);
    }

    @Then("I should be taken to the full article or collection page")
    public void iShouldBeTakenToTheFullArticleOrCollectionPage() {
        // Add validation logic for navigation
    }
}