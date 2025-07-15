package com.Selenium.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxTest {
    public static void main(String[] args) {
        // Set path to your geckodriver
        String driverPath = System.getProperty("user.dir") + "\\drivers\\geckodriver-v0.29.1-win32\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", driverPath);

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");

        System.out.println("Page Title: " + driver.getTitle());
        driver.quit();
    }
}
