package pom.pages;

public class HomePage {
    public static void open() {
        Common.setUpDriver();
        Common.openUrl("http://demo.seleniumeasy.com/");
    }

    public static void clickOnMenuItemElements() {
        Common.clickOnElementByAction(
                Locators.Home.menuItemElements);
    }

    public static void clickOnMenuItemButtons() {
        Common.clickOnElementByAction(
                Locators.Home.menuItemButton);
    }
}
