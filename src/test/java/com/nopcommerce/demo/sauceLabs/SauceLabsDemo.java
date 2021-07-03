package com.nopcommerce.demo.sauceLabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

/**
 * Created by Jay
 */
public class SauceLabsDemo {
    //https://wiki.saucelabs.com/display/DOCS/Example+Selenium+Scripts+for+Automated+Website+Tests
    //https://wiki.saucelabs.com/display/DOCS/Java+Test+Setup+Example

    public static final String USERNAME = "oauth-primetraineefive-83ce3";
    public static final String ACCESS_KEY = "18af915c-428e-4c60-b954-10dee0951444";
    public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

    public static void main(String[] args) throws Exception {


        DesiredCapabilities caps = DesiredCapabilities.chrome();
        //set your user name and access key to run tests in Sauce
        caps.setCapability("username", USERNAME);

        //set your sauce labs access key
        caps.setCapability("accessKey", ACCESS_KEY);
        /*caps.setCapability("browserName", "Chrome");
        caps.setCapability("platform", "Windows 7");
        caps.setCapability("version", "43.0");*/
        //set browser to Safari
        caps.setCapability("browserName", "Safari");

        //set operating system to macOS version 10.13
        caps.setCapability("platform", "macOS 10.13");

        //set the browser version to 11.1
        caps.setCapability("version", "11.1");

        //set the build name of the application
        caps.setCapability("build", "Onboarding Sample App - Java-TestNG");

        WebDriver driver = new RemoteWebDriver(new URL("https://ondemand.eu-central-1.saucelabs.com/wd/hub"), caps);

        driver.get("https://courses.letskodeit.com/practice");
        System.out.println("title of page is: " + driver.getTitle());

        Thread.sleep(3000);

        driver.quit();
    }
}
