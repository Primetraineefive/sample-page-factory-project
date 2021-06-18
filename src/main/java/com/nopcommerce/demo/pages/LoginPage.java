package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;


/**
 * Created by Jay
 */
public class LoginPage extends Utility {

    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginBtn = By.xpath("//input[@class='button-1 login-button']");
    By welcomeText = By.xpath("//div[@class='page-title']//h1");

    public void enterEmailId(String email) {
        Reporter.log("Entering email address : " + email + " to email field : " + emailField.toString() + "<br>");
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        Reporter.log("Entering password : " + password + " to password field : " + passwordField.toString() + "<br>");
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        Reporter.log("Clicking on login button : " + loginBtn.toString() + "<br>");
        clickOnElement(loginBtn);
    }

    public String getWelcomeText() {
        Reporter.log("Getting text from : " + welcomeText.toString() + "<br>");
        return getTextFromElement(welcomeText);
    }

    public void loginToApplication(String username, String password) {
        enterEmailId(username);
        enterPassword(password);
        clickOnLoginButton();
    }


}
