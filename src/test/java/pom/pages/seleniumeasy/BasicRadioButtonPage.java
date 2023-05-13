package pom.pages.seleniumeasy;

import pom.pages.Common;
import pom.pages.Locators;

public class BasicRadioButtonPage {
    public static void clickOnGroupRadioButtons(String inputGender, String inputAgeGroup) {
  Common.clickOnFewElementByAction(
          Locators.SeleniumEasy.BasicRadioButton.inputGroupRadioByGender(inputGender),
          Locators.SeleniumEasy.BasicRadioButton.inputGroupRadioByAgeGroup(inputAgeGroup),
          Locators.SeleniumEasy.BasicRadioButton.buttonGetCheckedValuesGroup
  );
    }

    public static String readMessageGenderAndAgeGroup() {
      return Common.getTextFromElement(Locators.SeleniumEasy.BasicRadioButton.paragraphGenderAndAgeGroup);
    }
}
