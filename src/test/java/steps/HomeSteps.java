package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;
import utils.DriverFactory;

public class HomeSteps {
    WebDriver driver;
    HomePage homePage;

    @Given("User opens the browser")
    public void user_opens_the_browser() {
        driver = DriverFactory.getDriver();
        homePage = new HomePage(driver);
    }

    @Given("navigates to the home page")
    public void navigates_to_the_home_page() {
        driver.get("https://example.com");
    }

    @Then("The main navigation menu should be visible")
    public void the_main_navigation_menu_should_be_visible() {
        Assert.assertTrue(homePage.isNavigationMenuVisible(), "Navigation menu is not visible!");
    }

    @When("User clicks on the Essays menu item")
    public void user_clicks_on_the_essays_menu_item() {
        homePage.clickOnEssaysMenuItem();
    }

    @Then("User should be navigated to the Essays section")
    public void user_should_be_navigated_to_the_essays_section() {
        Assert.assertTrue(driver.getCurrentUrl().contains("/essays"), "User is not navigated to the Essays section!");
    }
}