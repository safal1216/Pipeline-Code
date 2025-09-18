package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.NewsletterSignupPage;

public class SCRUM146Steps {
    WebDriver driver = new ChromeDriver();
    NewsletterSignupPage signupPage = new NewsletterSignupPage(driver);

    @Given("I open the homepage")
    public void iOpenTheHomepage() {
        driver.get("https://example.com");
    }

    @Then("A newsletter signup form should be present on the homepage")
    public void aNewsletterSignupFormShouldBePresentOnTheHomepage() {
        assert signupPage.isSignupFormVisible();
    }

    @When("I attempt to submit the form without an email address")
    public void iAttemptToSubmitTheFormWithoutAnEmailAddress() {
        signupPage.clickSignupButton();
    }

    @Then("Form submission should be prevented, and I should be prompted to enter an email")
    public void formSubmissionShouldBePrevented() {
        // Add validation logic for form submission
    }

    @When("I inspect the newsletter signup form")
    public void iInspectTheNewsletterSignupForm() {
        // Add logic to inspect the form
    }

    @Then("A clear \"Sign Up\" or \"Subscribe\" button should be present")
    public void aClearSignupButtonShouldBePresent() {
        // Add validation logic for button presence
    }

    @When("I submit the form with a valid email address")
    public void iSubmitTheFormWithAValidEmailAddress() {
        signupPage.enterEmail("test@example.com");
        signupPage.clickSignupButton();
    }

    @Then("I should receive a confirmation message upon successful submission")
    public void iShouldReceiveAConfirmationMessage() {
        // Add validation logic for confirmation message
    }

    @When("I submit the form with invalid email formats")
    public void iSubmitTheFormWithInvalidEmailFormats() {
        signupPage.enterEmail("invalid-email");
        signupPage.clickSignupButton();
    }

    @Then("The system should validate email format and prevent submission of invalid formats")
    public void theSystemShouldValidateEmailFormat() {
        // Add validation logic for email format
    }
}