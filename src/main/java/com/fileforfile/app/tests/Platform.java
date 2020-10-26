package com.fileforfile.app.tests;

import com.fileforfile.app.model.MobileCapabilityType;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class Platform {
    private static final String PLATFORM_ANDROID = "android";
    private static final String PLATFORM_IOS = "ios";
    private static final String APPIUM_URL = "http://127.0.0.1:4723/wd/hub";
    private DesiredCapabilities capabilities = new DesiredCapabilities();
    private static Platform instance;

    private Platform() {
    }

    public static Platform getInstance() {
        if (instance == null) {
            instance = new Platform();
        }
        return instance;
    }

    public AppiumDriver getDriver() throws Exception {
        String platform = System.getenv("PLATFORM");
        switch (platform) {
            case PLATFORM_ANDROID:
                return new AndroidDriver(new URL(APPIUM_URL), setAndroidCapabilities());
            case PLATFORM_IOS:
                return new IOSDriver(new URL(APPIUM_URL), setIosCapabilities());
            default:
                throw new Exception("Set the correct environment variable. Can't get run platform " + platform);
        }
    }

    private DesiredCapabilities setAndroidCapabilities() {
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Mi A1");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
        capabilities.setCapability(MobileCapabilityType.APP_PACKAGE, "com.fileforlife.app");
        capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY, ".presentation.ui.activity.enter.EnterActivity");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        capabilities.setCapability(MobileCapabilityType.APP, "/home/user/Downloads/app-devServer-debug.apk");
        return capabilities;
    }

    private DesiredCapabilities setIosCapabilities() {
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8 Jelvix");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.4");
        capabilities.setCapability(MobileCapabilityType.APP, "/home/user/Downloads/app-devServer-debug.apk");
        return capabilities;
    }

    private String getPlatformEnvVariable() {
        return System.getenv("PLATFORM");
    }

    private boolean isPlatform(String myPlatform) {
        return myPlatform.equals(getPlatformEnvVariable());
    }

    public boolean isAndroidPlatform() {
        return isPlatform(PLATFORM_ANDROID);
    }

    public boolean isIosPlatform() {
        return isPlatform(PLATFORM_IOS);
    }
}
