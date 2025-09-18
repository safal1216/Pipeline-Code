package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class LatestArticlesPage {
    WebDriver driver;

    public LatestArticlesPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By latestArticlesSection = By.id("latest-articles");
    private By articleItems = By.cssSelector("#latest-articles .article-item");

    // Methods
    public boolean isLatestArticlesSectionVisible() {
        return driver.findElement(latestArticlesSection).isDisplayed();
    }

    public List<WebElement> getArticleItems() {
        return driver.findElements(articleItems);
    }

    public void clickArticleItem(int index) {
        getArticleItems().get(index).click();
    }
}