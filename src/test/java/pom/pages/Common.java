package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pom.utils.Driver;

public class Common {
    public static void setUpDriver() {
        Driver.setDriver();
    }

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static void closeDriver() {
        Driver.closeDriver();
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

    public static void clickOnElementByAction(By locator) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(getElement(locator)).click().build().perform();
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }
}
