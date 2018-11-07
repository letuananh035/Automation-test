package com.demo.tuananh.testauto;

import com.demo.tuananh.testauto.base.SettupLogin;

import org.junit.Test;
import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class AboutTest extends SettupLogin {

    @Test
    public void test(){
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("navigation open");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[8]/android.widget.CheckedTextView");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[4]");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[3]");
        el4.click();
        findElementOrNull(By.id("android:id/button_once"));
        (new TouchAction(driver)).tap(PointOption.point(648, 635)).perform();
        MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]");
        el5.click();
        findElementOrNull(By.id("android:id/button_once"));
        (new TouchAction(driver)).tap(PointOption.point(648, 635)).perform();
        MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
        el6.click();
    }

}
