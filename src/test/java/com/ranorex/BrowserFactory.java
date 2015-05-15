package com.ranorex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by User on 18.04.15.
 */
public class BrowserFactory {
    enum Browsers {IE, CHROME, FIREFOX}


    public static WebDriver createDriver() {
        String browserName = System.getProperty("browserName").toUpperCase();
        System.out.print(browserName);
        Browsers b = Browsers.valueOf(browserName);
        switch (b) {
            case CHROME:
                return new ChromeDriver();
            case FIREFOX:
                return new FirefoxDriver();
            default:
                return new FirefoxDriver();

        }


    }
}