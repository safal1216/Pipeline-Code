package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.DriverManager;

import java.util.List;

public class EssaysSectionPage {

    WebDriver driver = DriverManager.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);

    private By essaysSection = By.id("essays-section");
    private By essaysList = By.cssSelector("#essays-section .essay-item");
    private By thumbnail = By.cssSelector(".essay-thumbnail");
    private By title = By.cssSelector(".essay-title");
    private By author = By.cssSelector(".essay-author");
    private By description = By.cssSelector(".essay-description");
    private By pagination = By.cssSelector(".pagination");

    public void navigateToEssaysSection() {
        driver.get("https://example.com/essays");
    }

    public boolean isEssaysListDisplayed() {
        WebElement section = wait.until(ExpectedConditions.visibilityOfElementLocated(essaysSection));
        return section.isDisplayed();
    }

    public void inspectEssaysList() {
        List<WebElement> essays = driver.findElements(essaysList);
        for (WebElement essay : essays) {
            System.out.println("Essay: " + essay.getText());
        }
    }

    public boolean areEssaysValid() {
        List<WebElement> essays = driver.findElements(essaysList);
        for (WebElement essay : essays) {
            boolean hasThumbnail = essay.findElement(thumbnail) != null;
            boolean hasTitle = !essay.findElement(title).getText().isEmpty();
            boolean hasAuthor = !essay.findElement(author).getText().isEmpty();
            boolean hasDescription = !essay.findElement(description).getText().isEmpty();
            if (!hasThumbnail || !hasTitle || !hasAuthor || !hasDescription) {
                return false;
            }
        }
        return true;
    }

    public void observeEssaysOrder() {
        // Implement logic to observe essays order
    }

    public boolean isSortedByDate() {
        // Implement logic to verify sorting by date
        return true;
    }

    public void navigateThroughEssaysList() {
        WebElement paginationElement = driver.findElement(pagination);
        List<WebElement> pages = paginationElement.findElements(By.tagName("a"));
        for (WebElement page : pages) {
            page.click();
        }
    }

    public boolean isPaginationFunctional() {
        // Implement logic to verify pagination functionality
        return true;
    }

    public void countEssaysOnPage() {
        List<WebElement> essays = driver.findElements(essaysList);
        System.out.println("Number of essays on page: " + essays.size());
    }

    public boolean hasMinimumEssaysPerPage(int minEssays) {
        List<WebElement> essays = driver.findElements(essaysList);
        return essays.size() >= minEssays;
    }
}