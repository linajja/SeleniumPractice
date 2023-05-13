package pom.pages;

import org.openqa.selenium.By;

public class Locators {
    public static class SeleniumEasy {
        public static class Home {

            public static By menuItemElements = By.xpath("//li[@class='dropdown']/a[contains(text(),'Input Forms')]");
            public static By menuItemButton = By.xpath("//div[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[3]/a");
        }

        public static class BasicRadioButton {

            public static By buttonGetCheckedValuesGroup = By.xpath("//button[@onclick='getValues();']");
            public static By paragraphGenderAndAgeGroup=By.xpath("//p[@class='groupradiobutton']");

            public static By inputGroupRadioByGender(String genderGroup) {
                return By.xpath("//input[@name='gender' and @value='" + genderGroup + "']");
            }

            public static By inputGroupRadioByAgeGroup(String group) {
                return By.xpath("//input[@name='ageGroup' and @value='" + group + "']");
            }
        }
    }
}
