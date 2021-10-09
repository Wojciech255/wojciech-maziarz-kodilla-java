package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.WebDriver;

public class FacebookTestingApp {

    public static final String XPATH_SELECT = "//div[contains(@class, \"_6ltg\")]/a";
    // class="_42ft"

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com");


    }
}
