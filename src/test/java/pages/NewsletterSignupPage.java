package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewsletterSignupPage {
    WebDriver driver;

    public NewsletterSignupPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By signupForm = By.id("newsletter-signup");
    private By emailInput = By.id("email");
    private By signupButton = By.id("signup-button");

    // Methods
    public boolean isSignupFormVisible() {
        return driver.findElement(signupForm).isDisplayed();
    }

    public void enterEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void clickSignupButton() {
        driver.findElement(signupButton).click();
    }
}