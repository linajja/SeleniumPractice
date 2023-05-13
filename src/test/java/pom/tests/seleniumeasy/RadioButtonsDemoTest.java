package pom.tests.seleniumeasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.pages.seleniumeasy.BasicRadioButtonPage;
import pom.pages.seleniumeasy.HomePage;
import pom.tests.TestBase;

public class RadioButtonsDemoTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        HomePage.open();
        HomePage.clickOnMenuItemElements();
        HomePage.clickOnMenuItemButtons();
    }

    @DataProvider(name="radioGroupButtonGender")
    public Object[][] dataProviderGroupRadioButton(){
        return new Object[][]{
                {"Male","Male","0 - 5", "0 - 5"},
                {"Male","Male","5 - 15", "5 - 15"},
                {"Male","Male","15 - 50", "15 - 50"},
                {"Female", "Female","0 - 5", "0 - 5"},
                {"Female", "Female","5 - 15", "5 - 15"},
                {"Female", "Female","15 - 50", "15 - 50"},
        };
    }
    @Test(dataProvider = "radioGroupButtonGender")
    public void testGroupRadioButton(String inputGender,String expectedResultGender,String inputAgeGroup,String expectedResultAgeGroup){

        String actualResult;

        BasicRadioButtonPage.clickOnGroupRadioButtons(inputGender, inputAgeGroup);
        actualResult=BasicRadioButtonPage.readMessageGenderAndAgeGroup();

        Assert.assertTrue(
                actualResult.contains(expectedResultGender) && actualResult.contains(expectedResultAgeGroup),
                String.format(
                        "Actual: %s , Expected: %s and %s",
                        actualResult,
                        expectedResultGender,
                        expectedResultAgeGroup
                )
        );

    }
}
