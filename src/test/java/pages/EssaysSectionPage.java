package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class EssaysSectionPage {
    WebDriver driver;

    public EssaysSectionPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By essaysSection = By.id("essays-section");
    private By essayItems = By.cssSelector("#essays-section .essay-item");
    private By pagination = By.cssSelector("#essays-section .pagination");

    // Methods
    public boolean isEssaysSectionVisible() {
        return driver.findElement(essaysSection).isDisplayed();
    }

    public List<WebElement> getEssayItems() {
        return driver.findElements(essayItems);
    }

    public void clickEssayItem(int index) {
        getEssayItems().get(index).click();
    }

    public boolean isPaginationVisible() {
        return driver.findElement(pagination).isDisplayed();
    }
}