package com.demo.tuananh.testauto;

import com.demo.tuananh.testauto.base.SettupLogin;

import org.junit.Test;
import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;

import static org.junit.Assert.assertEquals;

public class AbsenceRequestTest extends SettupLogin {

    @Test
    public void test(){
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("navigation open");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[4]/android.widget.CheckedTextView");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementById("com.huunghia.hoangdang.diemdanh:id/reason_editText");
        el3.sendKeys("Demo test");
        MobileElement el4 = (MobileElement) driver.findElementById("com.huunghia.hoangdang.diemdanh:id/etxt_fromdate");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementById("android:id/button1");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementById("com.huunghia.hoangdang.diemdanh:id/etxt_todate");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementById("android:id/button1");
        el7.click();
        driver.navigate().back();
        MobileElement el8 = (MobileElement) driver.findElementById("com.huunghia.hoangdang.diemdanh:id/send_ar_button");
        el8.click();

        waittingIdShowAndHide("android:id/body");
    }

}