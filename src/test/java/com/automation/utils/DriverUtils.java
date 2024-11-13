package com.automation.utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;

public class DriverUtils {

    static AppiumDriver driver;

    public static void createDriver(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("appium:automationName", "XCUITest");
        capabilities.setCapability("deviceName", "iPhone 15 Pro");
        capabilities.setCapability("appium:app", "/Users/marynanesterenko/IdeaProjects/mobile-automation-ios/SauceDemo.zip");

        driver = new AppiumDriver(capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

    public static AppiumDriver getDriver() {
        return driver;
    }
}
