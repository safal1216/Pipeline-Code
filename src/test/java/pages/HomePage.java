package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    // Locators
    private By searchBox = By.id("search-box");
    private By searchResults = By.id("results");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void performSearch(String searchTerm) {
        driver.findElement(searchBox).sendKeys(searchTerm);
        driver.findElement(searchBox).submit();
    }

    public boolean verifySearchResults() {
        return driver.findElement(searchResults).isDisplayed();
    }
}