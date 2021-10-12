package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookTestingApp {

    public static final String XPATH_ACCEPT = "//button[2]";
    public static final String XPATH_NEW_ACCOUNT = "//div[@class='_6ltg']/a";
    public static final String XPATH_SELECT_DAY ="//div[contains(@class,\"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH ="//div[contains(@class,\"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR ="//div[contains(@class,\"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com");
        driver.findElement(By.xpath(XPATH_ACCEPT)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(XPATH_NEW_ACCOUNT)).click();

        new WebDriverWait(driver, 2).until(ExpectedConditions.presenceOfElementLocated(By.xpath(XPATH_SELECT_DAY)));

        WebElement selectDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectBoard = new Select(selectDay);
        selectBoard.selectByValue("25");

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectBoard2 = new Select(selectMonth);
        selectBoard2.selectByValue("5");

        WebElement selectYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectBoard3 = new Select(selectYear);
        selectBoard3.selectByValue("1987");

    }
}
