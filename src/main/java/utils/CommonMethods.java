package utils;

import drivers.PageDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonMethods {

    public static String getTitle() {
        return PageDriver.getCurrentDriver().getTitle();
    }

    public static void sendText(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    public static void elementHover(WebElement element) {
        Actions actions = new Actions(PageDriver.getCurrentDriver());
        actions.clickAndHold(element).build().perform();
    }

    public static void selectitem(WebElement element, String value) {
        Select selectItems = new Select(element);
        selectItems.selectByValue(value);
    }

    public static void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) PageDriver.getCurrentDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void waitForPageLoad() {
        WebDriverWait wait = new WebDriverWait(PageDriver.getCurrentDriver(), Duration.ofSeconds(30));
        wait.until((ExpectedCondition<Boolean>) wd -> {
            assert wd != null;
            return ((JavascriptExecutor) wd)
                    .executeScript("return document.readyState;")
                    .equals("complete");
        });
    }

}
