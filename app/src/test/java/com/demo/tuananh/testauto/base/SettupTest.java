package com.demo.tuananh.testauto.base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.function.Function;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SettupTest {
    protected AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "8.1");
        desiredCapabilities.setCapability("deviceName", "Mi Mix 2");
        desiredCapabilities.setCapability("noReset", true);
        desiredCapabilities.setCapability("app", "C:\\Users\\Tuan Anh\\Desktop\\app-debug.apk");

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    protected MobileElement findElementOrNull(By by) {
        try {
            waitUntil(ExpectedConditions.visibilityOfElementLocated(by), 10);
            return (MobileElement) driver.findElement(by);
        } catch (TimeoutException ex) {
            return null;
        }
    }

    private void waitUntil(Function<WebDriver, WebElement> isTrue, int timeoutSeconds) throws TimeoutException {
        WebDriverWait wait = new WebDriverWait(driver, timeoutSeconds);
        wait.until(isTrue);
    }
}

