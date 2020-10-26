package com.fileforfile.app.tests;/* Created by user on 03.08.20 */

import com.fileforfile.app.pages.android.AndroidLoginPage;
import com.fileforfile.app.pages.android.AndroidPreviewPage;
import com.fileforfile.app.pages.android.AndroidSignUpPage;
import com.fileforfile.app.pages.android.AndroidVerificationPage;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    private AppiumDriver driver;

    protected AndroidLoginPage androidLoginPage;
    protected AndroidPreviewPage androidPreviewPage;
    protected AndroidSignUpPage androidSignUpPage;
    protected AndroidVerificationPage androidVerificationPage;


    @BeforeClass
    public void setUp() throws Exception {
        driver = Platform.getInstance().getDriver();
        androidLoginPage = new AndroidLoginPage(driver);
        androidPreviewPage = new AndroidPreviewPage(driver);
        androidSignUpPage = new AndroidSignUpPage(driver);
        androidVerificationPage = new AndroidVerificationPage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
