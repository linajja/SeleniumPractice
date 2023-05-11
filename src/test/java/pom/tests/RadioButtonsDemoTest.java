package pom.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.HomePage;

public class RadioButtonsDemoTest extends TestBase{
    @BeforeMethod
    @Override
    public void setUp() {
        HomePage.open();
        HomePage.clickOnMenuItemElements();
        HomePage.clickOnMenuItemButtons();
    }
    @Test
    public void test(){

    }
}
