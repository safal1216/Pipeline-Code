package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.NewsletterSignupFormPage;
import org.junit.Assert;

public class NewsletterSignupFormSteps {

    NewsletterSignupFormPage signupFormPage = new NewsletterSignupFormPage();

    @Given("I open the homepage")
    public void iOpenTheHomepage() {
        signupFormPage.openHomepage();
    }

    @Then("A newsletter signup form should be present on the homepage")
    public void aNewsletterSignupFormShouldBePresentOnTheHomepage() {
        Assert.assertTrue(signupFormPage.isSignupFormPresent());
    }

    @Given("I attempt to submit the form without an email address")
    public void iAttemptToSubmitTheFormWithoutAnEmailAddress() {
        signupFormPage.submitFormWithoutEmail();
    }

    @Then("Form submission should be prevented, and user should be prompted to enter an email")
    public void formSubmissionShouldBePreventedAndUserShouldBePromptedToEnterAnEmail() {
        Assert.assertTrue(signupFormPage.isEmailRequiredMessageDisplayed());
    }

    @Given("I inspect the newsletter signup form")
    public void iInspectTheNewsletterSignupForm() {
        signupFormPage.inspectSignupForm();
    }

    @Then("A clear \"Sign Up\" or \"Subscribe\" button should be present")
    public void aClearSignUpOrSubscribeButtonShouldBePresent() {
        Assert.assertTrue(signupFormPage.isSignupButtonPresent());
    }

    @Given("I submit the form with a valid email address")
    public void iSubmitTheFormWithAValidEmailAddress() {
        signupFormPage.submitFormWithValidEmail();
    }

    @Then("User should receive a confirmation message upon successful submission")
    public void userShouldReceiveAConfirmationMessageUponSuccessfulSubmission() {
        Assert.assertTrue(signupFormPage.isConfirmationMessageDisplayed());
    }

    @Given("I submit the form with invalid email formats")
    public void iSubmitTheFormWithInvalidEmailFormats() {
        signupFormPage.submitFormWithInvalidEmail();
    }

    @Then("The system should validate email format and prevent submission of invalid formats")
    public void theSystemShouldValidateEmailFormatAndPreventSubmissionOfInvalidFormats() {
        Assert.assertTrue(signupFormPage.isInvalidEmailMessageDisplayed());
    }
}