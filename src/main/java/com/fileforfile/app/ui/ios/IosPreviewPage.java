package com.fileforfile.app.ui.ios;/* Created by user on 30.07.20 */

import com.fileforfile.app.ui.Page;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class IosPreviewPage extends Page {

    public IosPreviewPage(WebDriver driver) {
        super((AndroidDriver) driver);
    }

    @iOSBy(id = "")
    private IOSElement loginButton;

    @iOSBy(id = "")
    private IOSElement signUpButton;

    @iOSBy(className = "")
    private List<IOSElement> mainContent;


    public void tapLoginButton() {
        wait.withMessage("There is no login button").until(
                ExpectedConditions.visibilityOf(loginButton));
        loginButton.click();
    }

    public boolean isPreviewPageLoaded() {
        setFastLookTiming();
        boolean isMainContainerLoad = !mainContent.isEmpty();
        setDefaultTiming();
        System.out.println("The number of elements is" + mainContent.size());
        return isMainContainerLoad;
    }
}
