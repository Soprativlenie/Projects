package com.fileforfile.app.ui.ios;/* Created by user on 30.07.20 */

import com.fileforfile.app.ui.Page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class IosLoginPage extends Page {
    private static String ACTIVITY = "";

    public IosLoginPage(AndroidDriver driver) {
        super(driver);
    }

    @iOSBy(xpath = "")
    private IOSElement logInText;

    @iOSBy(id = "")
    private IOSElement loginButton;

    @iOSBy(id = "")
    private IOSElement forgotPasswordButton;

    @iOSBy(id = "")
    private IOSElement contactUsLink;

    @iOSBy(id = "")
    private IOSElement emailInput;

    @iOSBy(id = "")
    private IOSElement passwordInput;




    public boolean isEmailFieldDisplaying() {
        wait.withMessage("There is no email field").until(ExpectedConditions.visibilityOf(emailInput));
        return emailInput.isDisplayed();
    }

    public boolean isPasswordFieldDisplaying() {
        wait.withMessage("There is no password field").until(ExpectedConditions.visibilityOf(passwordInput));
        return passwordInput.isDisplayed();
    }


    public boolean isLoginInTextDisplaying(){
        wait.until(ExpectedConditions.visibilityOf(logInText));
        return logInText.isDisplayed();
    }
}
