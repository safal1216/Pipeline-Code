package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.DriverManager;

import java.util.List;

public class FeaturedContentSliderPage {

    WebDriver driver = DriverManager.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);

    private By slider = By.id("featured-slider");
    private By sliderItems = By.cssSelector("#featured-slider .slider-item");
    private By arrowButtons = By.cssSelector("#featured-slider .arrow");
    private By dots = By.cssSelector("#featured-slider .dot");

    public void openHomepage() {
        driver.get("https://example.com");
    }

    public boolean isSliderPresent() {
        WebElement sliderElement = wait.until(ExpectedConditions.visibilityOfElementLocated(slider));
        return sliderElement.isDisplayed();
    }

    public boolean hasMinimumFeaturedItems(int minItems) {
        List<WebElement> items = driver.findElements(sliderItems);
        return items.size() >= minItems;
    }

    public void inspectSliderItems() {
        List<WebElement> items = driver.findElements(sliderItems);
        for (WebElement item : items) {
            System.out.println("Item: " + item.getText());
        }
    }

    public boolean areSliderItemsValid() {
        List<WebElement> items = driver.findElements(sliderItems);
        for (WebElement item : items) {
            boolean hasImage = item.findElement(By.tagName("img")) != null;
            boolean hasTitle = !item.findElement(By.className("title")).getText().isEmpty();
            boolean hasDescription = !item.findElement(By.className("description")).getText().isEmpty();
            if (!hasImage || !hasTitle || !hasDescription) {
                return false;
            }
        }
        return true;
    }

    public void navigateUsingArrows() {
        List<WebElement> arrows = driver.findElements(arrowButtons);
        for (WebElement arrow : arrows) {
            arrow.click();
        }
    }

    public boolean isArrowNavigationFunctional() {
        // Implement logic to verify arrow navigation
        return true;
    }

    public void navigateUsingDots() {
        List<WebElement> dotElements = driver.findElements(dots);
        for (WebElement dot : dotElements) {
            dot.click();
        }
    }

    public boolean isDotNavigationFunctional() {
        // Implement logic to verify dot navigation
        return true;
    }

    public void clickOnFeaturedItem() {
        WebElement firstItem = driver.findElements(sliderItems).get(0);
        firstItem.click();
    }

    public boolean isNavigationToFullPageCorrect() {
        // Implement logic to verify navigation to full page
        return true;
    }
}