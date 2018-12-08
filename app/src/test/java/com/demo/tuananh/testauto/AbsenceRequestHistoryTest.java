package com.demo.tuananh.testauto;

import com.demo.tuananh.testauto.base.SettupLogin;

import org.apache.tools.ant.taskdefs.Sleep;
import org.junit.Test;
import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class AbsenceRequestHistoryTest extends SettupLogin {

    @Test
    public void test(){
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("navigation open");
        el1.click();
        MobileElement el2 = findElementOrNull(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[4]/android.widget.CheckedTextView"));
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("More options");
        el3.click();
        MobileElement el4 = findElementOrNull(By.id("com.huunghia.hoangdang.diemdanh:id/title"));
        el4.click();
        new Sleep().doSleep(2000);
        (new TouchAction(driver)).tap(PointOption.point(433, 290)).perform();
        new Sleep().doSleep(500);
        MobileElement el6 = (MobileElement) driver.findElementById("android:id/button2");
        el6.click();
        new Sleep().doSleep(500);
        MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
        el7.click();
    }

}