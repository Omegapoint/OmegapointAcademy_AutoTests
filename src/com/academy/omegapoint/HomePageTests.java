package com.academy.omegapoint;

import org.testng.annotations.*;

public class HomePageTests extends AcademyElementLocators {



    @BeforeTest()

    public void academyHomePage() {
        invokeOmegapointAcademy();
        }


        @Test(priority =  0)                 // Test to verify the login, providing credentials and then successfull log out

        public void verifyLogin() {

        loginCheck();
        System.out.println("first test is passed");
        }

        @Test(priority = 1)                 // Test to verify the kurser link

        public void verifyKurser() {

        kurserCheck();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Test(priority = 2)                 // Test to verify the kompetensdagar link

        public void verifyKompetensdagar() {

        kompetensdagarCheck();
    }

    @Test(priority = 3)                 // Test to verify the Bokcirklar link

    public void verifyBokcirklar() {

        bokCirklarCheck();
    }

    @Test(priority = 4)                 // Test to verify the Studiecirklar link

    public void verifyStudiecirklar() {

        studieCirklarCheck();
    }

    @Test(priority = 5)                 // Test to verify the Studentkonferens link

    public void verifyStudentKonferens() {

        studentKonferensCheck();
    }

    @Test(priority = 6)                 // Test to verify the Works link

    public void verifyWorks() {

        works();
    }

    @Test(priority = 7)                 // Test to verify the OPKoKo link

    public void verifyOPKoKo() {

        OPKoKo();
    }

    @Test(priority =  8)                 // Test to verify the Profil link

    public void verifyProfil() {

        profil();
    }


    @Test(priority =  9)                 // Test to verify the logout link

    public void verifyLogout() {

        logoutCheck();
        System.out.println("last test is passed");
    }




    @AfterTest()

    public void exitAcademyBrowser() {
        exitOmegapointAcademy();
        }


}
