package com.fileforfile.app.pages.android;/* Created by user on 30.07.20 */

import com.fileforfile.app.pages.LoginPage;
import io.appium.java_client.AppiumDriver;


public class AndroidLoginPage extends LoginPage {
    static {
        BACK_BUTTON = "id:com.fileforlife.app:id/backImageView";
        LOGIN_BUTTON = "id:com.fileforlife.app:id/proceedLogInButton";
        FORGOT_PASSWORD_BUTTON = "id:com.fileforlife.app:id/resendPasswordTextView";
        CONTACT_US_LINK = "com.fileforlife.app:id/contactUsTextView";
        EMAIL_INPUT = "id:com.fileforlife.app:id/emailLogInEditText";
        PASSWORD_INPUT = "id:com.fileforlife.app:id/passwordLogInEditText";
        PASSWORD_TOGGLE_BUTTON = "id:com.fileforlife.app:id/passwordCheckBox";
        MAIN_CONTENT = "";
        TEXT_VIEWS = "";
        IMAGES_VIEWS = "";
        INPUTS = "";
    }
    private static final String LOGIN_SCREEN_ACTIVITY = ".presentation.ui.activity.login.LoginActivity";


    public AndroidLoginPage(AppiumDriver driver) {
        super(driver);
    }


}
