package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    // Locators
    private By navigationMenu = By.id("nav-menu");
    private By menuItemEssays = By.linkText("Essays");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public boolean isNavigationMenuVisible() {
        return driver.findElement(navigationMenu).isDisplayed();
    }

    public void clickOnEssaysMenuItem() {
        driver.findElement(menuItemEssays).click();
    }
}