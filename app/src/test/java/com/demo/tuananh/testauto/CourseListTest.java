package com.demo.tuananh.testauto;

import com.demo.tuananh.testauto.base.SettupLogin;

import org.junit.Test;
import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;

import static org.junit.Assert.assertEquals;

public class CourseListTest extends SettupLogin {

    @Test
    public void test(){
        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("navigation open");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[2]/android.widget.CheckedTextView");
        el3.click();

        findElementOrNull(By.id("com.huunghia.hoangdang.diemdanh:id/choose_course_student_listView"));

        MobileElement el4a = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]");
        String text = el4a.getText();
        assertEquals(text, "CS162");

        MobileElement el4b = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.TextView[2]");
        text = el4b.getText();
        assertEquals(text, "Introduction to Computer Science II");

        MobileElement el4c = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.TextView[3]");
        text = el4c.getText();
        assertEquals(text, "Total: 0 Absences: 0 A-Percent: NaN%");

        MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.LinearLayout");
        el4.click();

        findElementOrNull(By.id("com.huunghia.hoangdang.diemdanh:id/attendance_detail_listView"));
        MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
        el6.click();
    }

}