package pom.pages.seleniumeasy;

import pom.pages.Common;
import pom.pages.Locators;

public class HomePage {
    public static void open() {
        Common.setUpDriver();
        Common.openUrl("http://demo.seleniumeasy.com/");
    }

    public static void clickOnMenuItemElements() {
        Common.clickOnElementByAction(
                Locators.SeleniumEasy.Home.menuItemElements);
    }

    public static void clickOnMenuItemButtons() {
        Common.clickOnElementByAction(
                Locators.SeleniumEasy.Home.menuItemButton);
    }
}
