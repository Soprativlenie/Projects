package com.fileforfile.app.ui.android;/* Created by user on 30.07.20 */

import com.fileforfile.app.ui.Page;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public class AndroidLoginPage extends Page {
    private static final String LOGIN_SCREEN_ACTIVITY = ".presentation.ui.activity.login.LoginActivity";

    public AndroidLoginPage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.fileforlife.app:id/backImageView")
    private AndroidElement backButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/proceedLogInButton")
    private AndroidElement loginButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/resendPasswordTextView")
    private AndroidElement forgotPasswordButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/contactUsTextView")
    private AndroidElement contactUsLink;

    @AndroidFindBy(id = "com.fileforlife.app:id/emailLogInEditText")
    private AndroidElement emailInput;

    @AndroidFindBy(id = "com.fileforlife.app:id/passwordLogInEditText")
    private AndroidElement passwordInput;

    @AndroidFindBy(id = "com.fileforlife.app:id/passwordCheckBox")
    private AndroidElement passwordToggleButton;

    @AndroidFindBy(className = "android.widget.LinearLayout")
    private List<AndroidElement> mainContent;

    @AndroidFindBy(className = "android.widget.TextView")
    private List<AndroidElement> textViews;

    @AndroidFindBy(className = "android.widget.ImageView")
    private List<AndroidElement> imageViews;

    @AndroidFindBy(className = "android.widget.EditText")
    private List<AndroidElement> inputs;

    public void waitUntilTheLoginPageIsLoaded() {
        for (AndroidElement element : mainContent) {
            wait.withMessage(element + "isNotPresent").until(visibilityOf(element));
            System.out.println(element);
        }
    }

    public boolean isAllWidgetsAreDisplaying() {
        return isWidgetsAreDisplaying(textViews) && isWidgetsAreDisplaying(imageViews)
                && isWidgetsAreDisplaying(inputs);
    }

    public void fillEmailInput(String email) {
        emailInput.sendKeys(email);
    }

    public void fillPasswordInput(String password) {
        passwordInput.sendKeys(password);
    }

    public void tapLoginInButton() {
        wait.withMessage("There's no the Login button").until(visibilityOf(loginButton));
        loginButton.click();
    }

    public void tapForgotPasswordButton() {
        wait.withMessage("There's no the Forgot Password button")
                .until(visibilityOf(forgotPasswordButton));
        forgotPasswordButton.click();
    }

    public void tapContactUsLink() {
        wait.withMessage("There's no Contact Us Link").until(visibilityOf(contactUsLink));
        contactUsLink.click();
    }

    public void tapTogglePasswordButton() {
        wait.withMessage("There's no Toggle password button")
                .until(visibilityOf(passwordToggleButton));
        passwordToggleButton.click();
    }

    public void tapBackButton() {
        wait.withMessage("There's no Back button").until(visibilityOf(backButton));
        backButton.click();
    }

    private boolean isWidgetsAreDisplaying(List<AndroidElement> widgets) {
        for (AndroidElement widget : widgets) {
            if (!widget.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    public String getLoginPageActivity() {
        return LOGIN_SCREEN_ACTIVITY;
    }

}
