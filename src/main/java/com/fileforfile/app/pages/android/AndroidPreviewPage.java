package com.fileforfile.app.pages.android;/* Created by user on 30.07.20 */

import com.fileforfile.app.pages.Page;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class AndroidPreviewPage extends Page {
    private static final String PREVIEW_SCREEN_ACTIVITY = ".presentation.ui.activity.enter.EnterActivity";

    public AndroidPreviewPage(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.fileforlife.app:id/logInButton")
    private AndroidElement loginButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/signUpButton")
    private AndroidElement signUpButton;

    @AndroidFindBy(className = "android.widget.LinearLayout")
    private List<AndroidElement> mainContent;


    public void tapLoginButton() {
        wait.withMessage("There is no login button").until(
                ExpectedConditions.visibilityOf(loginButton));
        loginButton.click();
    }

    public void tapSignUpButton() {
        wait.withMessage("There is no Sign Up button").until(
                ExpectedConditions.visibilityOf(signUpButton));
        signUpButton.click();
    }

    public boolean isPreviewPageLoaded() {
        setFastLookTiming();
        boolean isMainContainerLoad = !mainContent.isEmpty();
        setDefaultTiming();
        System.out.println("The number of elements is" + mainContent.size());
        return isMainContainerLoad;
    }

    public String getActivity() {
        return PREVIEW_SCREEN_ACTIVITY;
    }
}
