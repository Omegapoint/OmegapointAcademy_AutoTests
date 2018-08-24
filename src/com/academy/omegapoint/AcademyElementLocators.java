package com.academy.omegapoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AcademyElementLocators extends InvokingAcademy {

    public void loginCheck() {          //element locator to find the login button and act on it

        driver.findElement(By.linkText("Logga in")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.id("userNameInput")).sendKeys("prashant.mundepi@omegapoint.se");
        driver.findElement(By.id("passwordInput")).sendKeys("Ff5WAh$NDfZ@");
        driver.findElement(By.id("submitButton")).click();
    }


    public void kurserCheck() {         //element locator to find the kurser and act on it

      /*  try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Kurser"))).click();           //explicit wait is used here

      //  WebElement kurser = driver.findElement(By.linkText("Kurser"));
      //  clickOn(driver, kurser, 5);
    }


    public void kompetensdagarCheck() {         //element locator to find the kompetensdagar and act on it

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Kompetensdagar"))).click();       //explicit wait is used here
    }


    public void bokCirklarCheck() {             //element locator to find the bokCirklar and act on it

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Bokcirklar"))).click();        //explicit wait is used here
    }

    public void studieCirklarCheck() {             //element locator to find the studieCirklar and act on it

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Studiecirklar"))).click();       //explicit wait is used here
    }

    public void studentKonferensCheck() {             //element locator to find the studentKonferens and act on it

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Studentkonferens"))).click();       //explicit wait is used here

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().back();
    }

    public void works() {             //element locator to find the Works and act on it

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Works"))).click();       //explicit wait is used here
    }

    public void OPKoKo() {             //element locator to find the OPKoKo and act on it

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("OPKoKo"))).click();       //explicit wait is used here
    }

    public void profil() {             //element locator to find the profil and act on it

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Profil"))).click();       //explicit wait is used here
    }

    public void logoutCheck() {             //element locator to find the logout and act on it

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logga ut"))).click();       //explicit wait is used here
    }

    public void kompetensdagartitleCheck() {         //element locator to find the title kompetensdagar and act on it

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='overview-page']/main/a[1]/div/section/h4"))).click();      //explicit wait is used here

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().back();
    }

    public void bokCirklartitleCheck() {             //element locator to find the title bokCirklar and act on it

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='overview-page']/main/a[2]/div/section/h4"))).click();  //explicit wait is used here

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().back();
    }

    public void kursertitleCheck() {             //element locator to find the title kurser and act on it

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='overview-page']/main/a[3]/div/section/h4"))).click();        //explicit wait is used here

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().back();
    }

    public void studiecirklartitleCheck() {             //element locator to find the title studiecirklar and act on it

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='overview-page']/main/a[4]/div/section/h4"))).click();        //explicit wait is used here
        driver.navigate().back();

    }

    public void incorrectLoginDetails() {          //element locator to find the login button and act on it with incorrect credentials

        driver.findElement(By.linkText("Logga in")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.id("userNameInput")).sendKeys("prashant.mundepi@omegapoint.se");
        driver.findElement(By.id("passwordInput")).sendKeys("Newuser@123");
        driver.findElement(By.id("submitButton")).click();


    }

}
