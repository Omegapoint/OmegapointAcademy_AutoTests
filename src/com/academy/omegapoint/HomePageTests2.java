package com.academy.omegapoint;

import org.testng.annotations.*;

public class HomePageTests2 extends AcademyElementLocators {

    @BeforeTest()

    public void academyHomePage() {
        invokeOmegapointAcademy();
    }


    @Test(priority = 0)                                      // Test to verify the the title kompetensdagar on home page

    public void verifytitleKompetensdagar() {

        kompetensdagartitleCheck();
    }

    @Test(priority = 1)                                      // Test to verify the the title bokcirklar on home page

    public void verifytitlebokCirklar() {

        bokCirklartitleCheck();
    }

    @Test(priority = 2)                                      // Test to verify the the title kurser on home page

    public void verifytitleKurser() {

        kursertitleCheck();
    }

    @Test(priority = 3)                                      // Test to verify the the title studiecirklar on home page

    public void verifytitleStudiecirklar() {

        studiecirklartitleCheck();
    }

    @AfterTest()

    public void exitAcademyBrowser() {
        exitOmegapointAcademy();
    }
}

