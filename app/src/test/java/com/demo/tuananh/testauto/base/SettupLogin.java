package com.demo.tuananh.testauto.base;

import org.openqa.selenium.By;
import java.net.MalformedURLException;

import io.appium.java_client.MobileElement;

public class SettupLogin extends  SettupTest {

    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        loginTest();
    }

    @Override
    public void tearDown() {
        logoutTest();
        super.tearDown();
    }

    private void loginTest() {
        MobileElement el5 = (MobileElement) driver.findElementById("com.huunghia.hoangdang.diemdanh:id/email_editText");
        if(!el5.getText().equals("")){
            el5.clear();
        }
        el5.sendKeys("1651006");
        MobileElement el6 = (MobileElement) driver.findElementById("com.huunghia.hoangdang.diemdanh:id/password_editText");
        el6.sendKeys("123456");
        driver.hideKeyboard();
        MobileElement el7 = (MobileElement) driver.findElementById("com.huunghia.hoangdang.diemdanh:id/login_button");
        el7.click();
        findElementOrNull(By.id("navigation open"));
    }

    private void logoutTest(){
        MobileElement el3 = findElementOrNull(By.id("navigation open"));
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[9]/android.widget.CheckedTextView");
        el4.click();
    }
}
