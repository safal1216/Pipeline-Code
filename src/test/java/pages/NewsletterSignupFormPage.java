package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.DriverManager;

public class NewsletterSignupFormPage {

    WebDriver driver = DriverManager.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);

    private By signupForm = By.id("newsletter-signup-form");
    private By emailInput = By.id("email-input");
    private By signupButton = By.id("signup-button");
    private By confirmationMessage = By.id("confirmation-message");
    private By emailRequiredMessage = By.id("email-required-message");
    private By invalidEmailMessage = By.id("invalid-email-message");

    public void openHomepage() {
        driver.get("https://example.com");
    }

    public boolean isSignupFormPresent() {
        WebElement form = wait.until(ExpectedConditions.visibilityOfElementLocated(signupForm));
        return form.isDisplayed();
    }

    public void submitFormWithoutEmail() {
        driver.findElement(signupButton).click();
    }

    public boolean isEmailRequiredMessageDisplayed() {
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(emailRequiredMessage));
        return message.isDisplayed();
    }

    public void inspectSignupForm() {
        WebElement form = driver.findElement(signupForm);
        System.out.println("Signup form: " + form.getText());
    }

    public boolean isSignupButtonPresent() {
        WebElement button = driver.findElement(signupButton);
        return button.isDisplayed();
    }

    public void submitFormWithValidEmail() {
        driver.findElement(emailInput).sendKeys("test@example.com");
        driver.findElement(signupButton).click();
    }

    public boolean isConfirmationMessageDisplayed() {
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(confirmationMessage));
        return message.isDisplayed();
    }

    public void submitFormWithInvalidEmail() {
        driver.findElement(emailInput).sendKeys("invalid-email");
        driver.findElement(signupButton).click();
    }

    public boolean isInvalidEmailMessageDisplayed() {
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(invalidEmailMessage));
        return message.isDisplayed();
    }
}