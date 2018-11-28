package com.demo.tuananh.testauto;

import com.demo.tuananh.testauto.base.SettupLogin;

import org.junit.Test;
import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;

public class ChangePassWord extends SettupLogin {

    @Test
    public void test(){
        MobileElement e9 = (MobileElement) driver.findElementByAccessibilityId("navigation open");
        e9.click();
        MobileElement e10 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[7]/android.widget.CheckedTextView");
        e10.click();

        MobileElement el1 = findElementOrNull(By.id("com.huunghia.hoangdang.diemdanh:id/btn_changePassword"));
        el1.click();
        MobileElement el2 = findElementOrNull(By.id("com.huunghia.hoangdang.diemdanh:id/current_password_editText"));
        el2.sendKeys("123");
        MobileElement el3 = (MobileElement) driver.findElementById("com.huunghia.hoangdang.diemdanh:id/new_password_editText");
        el3.sendKeys("123");
        MobileElement el4 = (MobileElement) driver.findElementById("android:id/button1");
        el4.click();
        waittingIdShowAndHide("android:id/body");
        MobileElement el5 = findElementOrNull(By.id("android:id/button2"));
        el5.click();
        MobileElement el6 = findElementOrNull(By.id("com.huunghia.hoangdang.diemdanh:id/btn_changePassword"));
        el6.click();
        MobileElement el7 = findElementOrNull(By.id("com.huunghia.hoangdang.diemdanh:id/current_password_editText"));
        el7.sendKeys("123456");
        MobileElement el8 = (MobileElement) driver.findElementById("com.huunghia.hoangdang.diemdanh:id/new_password_editText");
        el8.sendKeys("12345678");
        MobileElement el9 = (MobileElement) driver.findElementById("com.huunghia.hoangdang.diemdanh:id/showPassword_chxbox");
        el9.click();
        MobileElement el10 = (MobileElement) driver.findElementById("android:id/button1");
        el10.click();
        waittingIdShowAndHide("android:id/body");
        MobileElement el11 = findElementOrNull(By.id("com.huunghia.hoangdang.diemdanh:id/btn_changePassword"));
        el11.click();
        MobileElement el12 = findElementOrNull(By.id("com.huunghia.hoangdang.diemdanh:id/current_password_editText"));
        el12.sendKeys("12345678");
        MobileElement el13 = (MobileElement) driver.findElementById("com.huunghia.hoangdang.diemdanh:id/new_password_editText");
        el13.sendKeys("123456");
        MobileElement el14 = (MobileElement) driver.findElementById("com.huunghia.hoangdang.diemdanh:id/showPassword_chxbox");
        el14.click();
        MobileElement el15 = (MobileElement) driver.findElementById("android:id/button1");
        el15.click();
        waittingIdShowAndHide("android:id/body");
    }

}
