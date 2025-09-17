package utils;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserHelper {

    //wait until the element is visible
    public static WebElement waitForElementVisibility(WebDriver driver, WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(driver, timeToWaitInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    //wait until the element is clickable and click on it
    public static WebElement waitUntilElementClickableAndClick(WebDriver driver, WebElement element, int timeToWaitInSec) {

        WebDriverWait wait = new WebDriverWait(driver, timeToWaitInSec);
        WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(element));
        clickableElement.click();
        return clickableElement;
    }


    // fluent wait if needed
  //  public static WebElement fluentWait(WebDriver driver, WebElement element, int timeToWaitInSec) {
//        Wait<WebDriver> wait = new FluentWait<>(driver)
  // }


}
