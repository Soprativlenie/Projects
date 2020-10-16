package com.fileforfile.app.tests;/* Created by user on 03.08.20 */

import com.fileforfile.app.model.MobileCapabilityType;
import com.fileforfile.app.pages.android.AndroidLoginPage;
import com.fileforfile.app.pages.android.AndroidPreviewPage;
import com.fileforfile.app.pages.android.AndroidSignUpPage;
import com.fileforfile.app.pages.android.VerificationPage;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {
    private DesiredCapabilities capabilities;
    private AndroidDriver driver;
    private static final String APPIUM_URL = "http://127.0.0.1:4723/wd/hub";

    protected AndroidLoginPage androidLoginPage;
    protected AndroidPreviewPage androidPreviewPage;
    protected AndroidSignUpPage androidSignUpPage;
    protected VerificationPage verificationPage;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Mi A1");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
        capabilities.setCapability(MobileCapabilityType.APP_PACKAGE, "com.fileforlife.app");
        capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY, ".presentation.ui.activity.enter.EnterActivity");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        capabilities.setCapability(MobileCapabilityType.APP, "/home/user/Downloads/app-devServer-debug.apk");
        driver = new AndroidDriver(new URL(APPIUM_URL), capabilities);

        androidLoginPage = new AndroidLoginPage(driver);
        androidPreviewPage = new AndroidPreviewPage(driver);
        androidSignUpPage = new AndroidSignUpPage(driver);
        verificationPage = new VerificationPage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
