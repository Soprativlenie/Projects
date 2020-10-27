package com.fileforfile.app.pages;/* Created by user on 29.07.20 */

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Page {

    protected AndroidDriver driver;
    protected static WebDriverWait wait;
    protected static TouchAction action;
    protected static JavascriptExecutor js;
    private Duration defaultLook = Duration.ofSeconds(20); //default look for elements
    private Duration fastLook = Duration.ofSeconds(7); // wait for 7 sec


    public Page(AndroidDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 7);
        setDefaultTiming();
        action = new TouchAction(driver);
        js = driver;
    }

    protected void setDefaultTiming() {
        PageFactory.initElements(new AppiumFieldDecorator(driver, defaultLook), this);
    }

    protected void setFastLookTiming() {
        PageFactory.initElements(new AppiumFieldDecorator(driver, fastLook), this);
    }

    public String getCurrentActivity() {
        return driver.currentActivity();
    }


}
