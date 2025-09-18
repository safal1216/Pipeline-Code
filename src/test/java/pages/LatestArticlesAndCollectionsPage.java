package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.DriverManager;

import java.util.List;

public class LatestArticlesAndCollectionsPage {

    WebDriver driver = DriverManager.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);

    private By section = By.id("latest-articles-section");
    private By sectionItems = By.cssSelector("#latest-articles-section .item");
    private By thumbnail = By.cssSelector(".item-thumbnail");
    private By title = By.cssSelector(".item-title");
    private By publicationDate = By.cssSelector(".item-date");

    public void openHomepage() {
        driver.get("https://example.com");
    }

    public boolean isSectionDisplayed() {
        WebElement sectionElement = wait.until(ExpectedConditions.visibilityOfElementLocated(section));
        return sectionElement.isDisplayed();
    }

    public void inspectSectionItems() {
        List<WebElement> items = driver.findElements(sectionItems);
        for (WebElement item : items) {
            System.out.println("Item: " + item.getText());
        }
    }

    public boolean areItemsValid() {
        List<WebElement> items = driver.findElements(sectionItems);
        for (WebElement item : items) {
            boolean hasThumbnail = item.findElement(thumbnail) != null;
            boolean hasTitle = !item.findElement(title).getText().isEmpty();
            boolean hasDate = !item.findElement(publicationDate).getText().isEmpty();
            if (!hasThumbnail || !hasTitle || !hasDate) {
                return false;
            }
        }
        return true;
    }

    public void observeItemOrder() {
        // Implement logic to observe item order
    }

    public boolean isSortedByDate() {
        // Implement logic to verify sorting by date
        return true;
    }

    public void clickOnItem() {
        WebElement firstItem = driver.findElements(sectionItems).get(0);
        firstItem.click();
    }

    public boolean isNavigationToFullPageCorrect() {
        // Implement logic to verify navigation to full page
        return true;
    }
}