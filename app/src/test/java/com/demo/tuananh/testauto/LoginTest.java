package com.demo.tuananh.testauto;

import com.demo.tuananh.testauto.base.SettupTest;

import org.junit.Test;
import org.openqa.selenium.By;


import io.appium.java_client.MobileElement;


public class LoginTest extends SettupTest {

    @Test
    public void loginTestFailed() {
        MobileElement el5 = (MobileElement) driver.findElementById("com.huunghia.hoangdang.diemdanh:id/email_editText");
        if(!el5.getText().equals("")){
            el5.clear();
        }
        el5.sendKeys("1651006");
        MobileElement el6 = (MobileElement) driver.findElementById("com.huunghia.hoangdang.diemdanh:id/password_editText");
        el6.sendKeys("");
        driver.hideKeyboard();
        MobileElement el7 = (MobileElement) driver.findElementById("com.huunghia.hoangdang.diemdanh:id/login_button");
        el7.click();
        findElementNull(By.id("navigation open"));
    }

}
