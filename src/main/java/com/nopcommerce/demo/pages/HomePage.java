package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

/**
 * Created by Jay
 */
public class HomePage extends Utility {

    By loginLink = By.linkText("Log in");
    By registerLink = By.xpath("//a[@class='ico-register']");

    public void clickOnLoginLink() {
        Reporter.log("Clicking on login link : " + loginLink.toString() + "<br>");
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        Reporter.log("Clicking on login link : " + registerLink.toString() + "<br>");
        clickOnElement(registerLink);
    }
}
