package com.demo.tuananh.testauto;

import com.demo.tuananh.testauto.base.SettupLogin;
import com.demo.tuananh.testauto.base.SettupTest;

import org.junit.Test;
import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;

public class ViewAccountTest extends SettupLogin {

    @Test
    public void test(){
        MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("navigation open");
        el8.click();
        MobileElement el9 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[7]/android.widget.CheckedTextView");
        el9.click();
    }

}
