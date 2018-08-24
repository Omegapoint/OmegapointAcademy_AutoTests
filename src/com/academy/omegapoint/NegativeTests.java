package com.academy.omegapoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;

public class NegativeTests extends AcademyElementLocators {

    @BeforeTest()

    public void academyHomePage() {
        invokeOmegapointAcademy();
    }

    @Test(priority = 0)

    public void verifyIncorrectLogin() {

        incorrectLoginDetails();
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("errorText"))).isDisplayed(), "Error text is not displayed");

    }


    @AfterTest()

    public void exitAcademyBrowser() {
        exitOmegapointAcademy();

    }
}
