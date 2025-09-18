package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class NavigationMenuPage {
    WebDriver driver;

    public NavigationMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By navigationMenu = By.id("nav-menu");
    private By menuItems = By.cssSelector("#nav-menu a");

    // Methods
    public boolean isNavigationMenuVisible() {
        return driver.findElement(navigationMenu).isDisplayed();
    }

    public List<WebElement> getMenuItems() {
        return driver.findElements(menuItems);
    }

    public void clickMenuItem(String itemName) {
        for (WebElement item : getMenuItems()) {
            if (item.getText().equalsIgnoreCase(itemName)) {
                item.click();
                break;
            }
        }
    }
}