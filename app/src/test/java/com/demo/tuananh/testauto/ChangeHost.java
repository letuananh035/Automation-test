package com.demo.tuananh.testauto;

import com.demo.tuananh.testauto.base.SettupTest;

import org.junit.Test;
import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;

public class ChangeHost extends SettupTest{
    @Test
    public void test(){
        MobileElement el2 = (MobileElement) driver.findElementById("com.huunghia.hoangdang.diemdanh:id/setting_host");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementById("com.huunghia.hoangdang.diemdanh:id/editText_inputhost");
        el3.sendKeys("http://api-andoroid.000webhostapp.com/");
        MobileElement el4 = (MobileElement) driver.findElementById("com.huunghia.hoangdang.diemdanh:id/button_changehostbyhand");
        el4.click();
        MobileElement el6 = (MobileElement) driver.findElementById("com.huunghia.hoangdang.diemdanh:id/button_changehostonline");
        el6.click();
        findElementOrNull(By.id("android:id/body"));
    }
}
