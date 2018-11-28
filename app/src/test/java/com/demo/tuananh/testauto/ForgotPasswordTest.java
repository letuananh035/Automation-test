package com.demo.tuananh.testauto;

import com.demo.tuananh.testauto.base.SettupTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;

public class ForgotPasswordTest  extends SettupTest {

    @Test
    public void test() {
        MobileElement el1 = (MobileElement) driver.findElementById("com.huunghia.hoangdang.diemdanh:id/forgot_pw_textView");
        el1.click();

        MobileElement el2 = findElementOrNull(By.id("com.huunghia.hoangdang.diemdanh:id/email_reset_editText"));
        el2.sendKeys("123");
        MobileElement el3 = (MobileElement) driver.findElementById("android:id/button1");
        el3.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@text, 'Wrong Email')]")));


//        el1.click();
//        el2.sendKeys("123");
//        el3.click();
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@text, 'Wrong Email')]")));
    }

}