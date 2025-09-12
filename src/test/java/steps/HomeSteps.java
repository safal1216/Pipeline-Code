package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utils.DriverFactory;
import org.junit.Assert;

public class HomeSteps {
    WebDriver driver;
    HomePage homePage;

    @Given("User opens the browser")
    public void user_opens_the_browser() {
        driver = DriverFactory.getDriver();
        homePage = new HomePage(driver);
    }

    @When("User performs a search action")
    public void user_performs_a_search_action() {
        homePage.performSearch("automation tools");
    }

    @Then("The system displays the search results successfully")
    public void system_displays_search_results() {
        boolean isDisplayed = homePage.verifySearchResults();
        Assert.assertTrue("Search results are not displayed!", isDisplayed);
    }
}