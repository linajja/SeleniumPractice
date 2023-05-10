package pom.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pom.pages.Common;


@Listeners()
public abstract class TestBase {
    @BeforeMethod
    public abstract void setUp();
    @AfterMethod
    public void tearDown() {
        Common.closeDriver();
    }
}
