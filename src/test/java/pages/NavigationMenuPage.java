package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.DriverManager;

import java.util.List;

public class NavigationMenuPage {

    WebDriver driver = DriverManager.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);

    private By navigationMenu = By.id("navigation-menu");
    private By menuItems = By.cssSelector("#navigation-menu a");
    private By highlightedSection = By.cssSelector("#navigation-menu .highlighted");

    public void openAnyPage() {
        driver.get("https://example.com/any-page");
    }

    public boolean isNavigationMenuVisible() {
        WebElement menu = wait.until(ExpectedConditions.visibilityOfElementLocated(navigationMenu));
        return menu.isDisplayed();
    }

    public void openWebsite() {
        driver.get("https://example.com");
    }

    public void inspectMenuItems() {
        List<WebElement> items = driver.findElements(menuItems);
        for (WebElement item : items) {
            System.out.println("Menu item: " + item.getText());
        }
    }

    public boolean areRequiredLinksPresent() {
        List<WebElement> items = driver.findElements(menuItems);
        String[] requiredLinks = {"Essays", "Collections", "Curator's Choice", "Shop", "About", "Search"};
        for (String link : requiredLinks) {
            boolean found = items.stream().anyMatch(item -> item.getText().equals(link));
            if (!found) return false;
        }
        return true;
    }

    public void clickOnMenuItems() {
        List<WebElement> items = driver.findElements(menuItems);
        for (WebElement item : items) {
            item.click();
            driver.navigate().back();
        }
    }

    public boolean isNavigationCorrect() {
        // Implement logic to verify navigation correctness
        return true;
    }

    public void navigateToDifferentSections() {
        // Implement logic to navigate to different sections
    }

    public boolean isCurrentSectionHighlighted() {
        WebElement highlighted = driver.findElement(highlightedSection);
        return highlighted != null && highlighted.isDisplayed();
    }

    public void accessOnMobileDevices() {
        // Implement logic to simulate mobile device access
    }

    public boolean isMobileNavigationFunctional() {
        // Implement logic to verify mobile navigation functionality
        return true;
    }
}