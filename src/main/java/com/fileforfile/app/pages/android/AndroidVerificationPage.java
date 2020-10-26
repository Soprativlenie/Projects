package com.fileforfile.app.pages.android;/* Created by user on 15.10.20 */

import com.fileforfile.app.pages.Page;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AndroidVerificationPage extends Page {

    public AndroidVerificationPage(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.fileforlife.app:id/verificationCodeEditText")
    private AndroidElement verificationInput;


    public boolean isThisVerificationScreen() {
        return wait.withMessage("").until(ExpectedConditions.visibilityOf(verificationInput)).isDisplayed();
    }
}
