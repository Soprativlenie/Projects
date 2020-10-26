package com.fileforfile.app.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public abstract class LoginPage extends Page {
    protected static String
            BACK_BUTTON,
            LOGIN_BUTTON,
            FORGOT_PASSWORD_BUTTON,
            CONTACT_US_LINK,
            EMAIL_INPUT,
            PASSWORD_INPUT,
            PASSWORD_TOGGLE_BUTTON,
            MAIN_CONTENT,
            TEXT_VIEWS,
            IMAGES_VIEWS,
            INPUTS;

    public LoginPage(AppiumDriver driver) {
        super(driver);
    }

    public LoginPage fillAnEmailInput() {
        try {
            wait.withMessage("Can't see login button").until(ExpectedConditions.visibilityOfElementLocated(
                    getLocatorByString(LOGIN_BUTTON)));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return this;
    }


}
