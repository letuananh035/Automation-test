package com.demo.tuananh.testauto;

import com.demo.tuananh.testauto.base.SettupTest;

import org.apache.tools.ant.taskdefs.Sleep;
import org.junit.Test;
import org.openqa.selenium.By;


import io.appium.java_client.MobileElement;


public class LoginTest extends SettupTest {

    @Test
    public void loginTestFailed() {
        loginTest("1651006","");
    }

    @Test
    public void loginTestSuccess() {
        loginTest("1651006","123456");
        logoutTest();
    }

    private void loginTest(String username, String password){
        MobileElement el5 = (MobileElement) driver.findElementById("com.huunghia.hoangdang.diemdanh:id/email_editText");
        if(!el5.getText().equals("")){
            el5.clear();
        }
        el5.sendKeys(username);
        MobileElement el6 = (MobileElement) driver.findElementById("com.huunghia.hoangdang.diemdanh:id/password_editText");
        if(!el6.getText().equals("")){
            el6.clear();
        }
        el6.sendKeys(password);
        //driver.hideKeyboard();
        MobileElement el7 = (MobileElement) driver.findElementById("com.huunghia.hoangdang.diemdanh:id/login_button");
        el7.click();
        findElementNull(By.id("navigation open"));
    }

    private void logoutTest(){
        new Sleep().doSleep(1000);
        MobileElement el3 = findElementOrNull(By.xpath("//android.widget.ImageButton[@content-desc=\"navigation open\"]"));
        el3.click();
        MobileElement el4 = findElementOrNull(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[9]/android.widget.CheckedTextView"));
        el4.click();
        findElementNull(By.id("com.huunghia.hoangdang.diemdanh:id/use_checklist_button"));
    }

}
