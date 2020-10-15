package com.fileforfile.app.ui.android;/* Created by user on 31.07.20 */

import com.fileforfile.app.ui.Page;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class ResetPasswordPage extends Page {
    private static final String
            RESET_PASSWORD_SCREEN_ACTIVITY = ".presentation.ui.activity.resetPassword.ResetPasswordActivity";

    public ResetPasswordPage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.fileforlife.app:id/backImageView")
    private AndroidElement backButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/emailEditText")
    private AndroidElement emailInput;

    @AndroidFindBy(id = "com.fileforlife.app:id/confirmButton")
    private AndroidElement confirmButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/termsConditionsTextView")
    private AndroidElement termsButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/invalidEmailTextView")
    private AndroidElement invalidMessageText;

    @AndroidFindBy(className = "android.widget.TextView")
    private List<AndroidElement> textViews;

    @AndroidFindBy(className = "android.widget.IamgeView")
    private List<AndroidElement> imageViews;

    @AndroidFindBy(className = "android.widget.EditText")
    private List<AndroidElement> inputs;

    public String getResetPasswordScreenActivity() {
        return RESET_PASSWORD_SCREEN_ACTIVITY;
    }
}
