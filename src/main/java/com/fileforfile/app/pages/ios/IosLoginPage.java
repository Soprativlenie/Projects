package com.fileforfile.app.pages.ios;/* Created by user on 30.07.20 */

import com.fileforfile.app.pages.LoginPage;

import io.appium.java_client.AppiumDriver;


public class IosLoginPage extends LoginPage {
    static {
        BACK_BUTTON = "";
        LOGIN_BUTTON = "";
        FORGOT_PASSWORD_BUTTON = "";
        CONTACT_US_LINK = "";
        EMAIL_INPUT = "";
        PASSWORD_INPUT = "";
        PASSWORD_TOGGLE_BUTTON = "";
        MAIN_CONTENT = "";
        TEXT_VIEWS = "";
        IMAGES_VIEWS = "";
        INPUTS = "";
    }


    public IosLoginPage(AppiumDriver driver) {
        super(driver);
    }
}
