package pom.pages;

import org.openqa.selenium.By;

public class Locators {
    public static class Home{

        public static By menuItemElements= By.xpath("//li[@class='dropdown']/a[contains(text(),'Input Forms')]");
        public static By menuItemButton=By.xpath("//div[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[3]/a");
    }
}
