package com.demo.tuananh.testauto;

import com.demo.tuananh.testauto.base.SettupLogin;

import org.apache.tools.ant.taskdefs.Sleep;
import org.junit.Test;
import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;

public class UploadAndDeleteImageTest  extends SettupLogin {

    @Test
    public void test(){
        findElementOrNull(By.id("com.huunghia.hoangdang.diemdanh:id/use_checklist_button"));
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("navigation open");
        el1.click();
        MobileElement el2 = findElementOrNull(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[6]/android.widget.CheckedTextView"));
        el2.click();



        MobileElement el3 = findElementOrNull(By.id("com.huunghia.hoangdang.diemdanh:id/UploadButton"));
        el3.click();

        findElementOrNull(By.id("com.huunghia.hoangdang.diemdanh:id/title_template"));
        MobileElement el4 = findElementOrNull(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]"));
        el4.click();
       // findElementOrNull(By.id("com.android.camera2:id/three_dots"));
        MobileElement el5 = findElementOrNull(By.id("com.android.camera2:id/shutter_button"));
        el5.click();
        MobileElement el6 = findElementOrNull(By.id("com.android.camera2:id/done_button"));
        el6.click();
        waittingIdShowAndHide("android:id/body");
        MobileElement el13 = findElementOrNull(By.id("com.huunghia.hoangdang.diemdanh:id/lineimageview"));
        el13.click();
        MobileElement el14 = findElementOrNull(By.id("android:id/button2"));
        el14.click();
        new Sleep().doSleep(3000);
        driver.navigate().back();
    }

}