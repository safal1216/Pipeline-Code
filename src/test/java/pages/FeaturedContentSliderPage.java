package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class FeaturedContentSliderPage {
    WebDriver driver;

    public FeaturedContentSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By slider = By.id("featured-slider");
    private By sliderItems = By.cssSelector("#featured-slider .slider-item");
    private By nextArrow = By.cssSelector("#featured-slider .next-arrow");
    private By prevArrow = By.cssSelector("#featured-slider .prev-arrow");
    private By dots = By.cssSelector("#featured-slider .dots button");

    // Methods
    public boolean isSliderVisible() {
        return driver.findElement(slider).isDisplayed();
    }

    public List<WebElement> getSliderItems() {
        return driver.findElements(sliderItems);
    }

    public void navigateUsingArrow(String direction) {
        if (direction.equalsIgnoreCase("next")) {
            driver.findElement(nextArrow).click();
        } else if (direction.equalsIgnoreCase("prev")) {
            driver.findElement(prevArrow).click();
        }
    }

    public void navigateUsingDot(int index) {
        driver.findElements(dots).get(index).click();
    }

    public void clickSliderItem(int index) {
        getSliderItems().get(index).click();
    }
}