package com.academy.omegapoint;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InvokingAcademy {

       WebDriver driver = new SafariDriver();

       WebDriverWait wait = new WebDriverWait(driver, 10);               // to be used as explicit wait

       String home =driver.getCurrentUrl();


    public void invokeOmegapointAcademy() {               //Code to invoke Omegapoint Academy

        driver.get("https://omegapoint.academy/");
        driver.manage().window().maximize();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public void exitOmegapointAcademy() {                 // Code to close Omegapoint Academy browser window

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

        driver.quit();
    }

    public static void main(String[] args) {
        //System.out.println("This automation is for Omegapoint Academy");
    }

/*
    public void clickOn(WebDriver driver, WebElement element, int timeout) {

        new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }*/

}
