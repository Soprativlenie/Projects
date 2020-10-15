package com.fileforfile.app.ui.android;/* Created by user on 30.07.20 */

import com.fileforfile.app.ui.Page;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class AndroidSignUpPage extends Page {
    private final static String SIGN_UP_SCREEN_ACTIVITY = ".presentation.ui.activity.signup.SignUpActivity";

    public AndroidSignUpPage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.fileforlife.app:id/firstNameSignUpEditText")
    private AndroidElement firstNameInput;

    @AndroidFindBy(id = "com.fileforlife.app:id/lastNameSignUpEditText")
    private AndroidElement lastNameInput;

    @AndroidFindBy(id = "com.fileforlife.app:id/emailSignUpEditText")
    private AndroidElement emailInput;

    @AndroidFindBy(id = "com.fileforlife.app:id/birthDateSignUpEditText")
    private AndroidElement dateOfBirthInput;

    @AndroidFindBy(id = "com.fileforlife.app:id/passwordSignUpEditText")
    private AndroidElement passwordInput;

    @AndroidFindBy(id = "com.fileforlife.app:id/confirmPasswordSignUpEditText")
    private AndroidElement confirmPasswordInput;

    @AndroidFindBy(id = "com.fileforlife.app:id/proceedSignUpButton")
    private AndroidElement signUpButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/notReceiveMarketingCheckBox")
    private AndroidElement receiveNewsLetterCheckbox;

    @AndroidFindBy(id = "com.fileforlife.app:id/passwordCheckBox")
    public AndroidElement passwordCheckbox;

    @AndroidFindBy(id = "com.fileforlife.app:id/confirmPasswordCheckBox")
    public AndroidElement confirmPasswordCheckbox;

    @AndroidFindBy(id = "com.fileforlife.app:id/backImageView")
    public AndroidElement backButton;

    @AndroidFindBy(xpath = "//*[contains(@text,'Sign Up')]")
    public AndroidElement signUpTextView;

    @AndroidFindBy(id = "android:id/datePicker")
    private AndroidElement datePicker;

    @AndroidFindBy(id = "android:id/button1")
    private AndroidElement datePickerOkButton;

    @AndroidFindBy(id = "com.fileforlife.app:id/alertTitle")
    private AndroidElement passwordAlert;

    @AndroidFindBy(id = "android:id/button1")
    private AndroidElement okButtonOnThePassworAlert;

    @AndroidFindBy(id = "com.fileforlife.app:id/invalidFirstNameTextView")
    private AndroidElement firstNameErrorMessage;

    @AndroidFindBy(id = "com.fileforlife.app:id/invalidLastNameTextView")
    private AndroidElement lastNameErrorMessage;

    @AndroidFindBy(id = "com.fileforlife.app:id/invalidEmailTextView")
    private AndroidElement emailErrorMessage;

    @AndroidFindBy(id = "com.fileforlife.app:id/invalidBirthDateTextView")
    private AndroidElement dateOfBirthErrorMessage;

    @AndroidFindBy(id = "com.fileforlife.app:id/invalidPasswordTextView")
    private AndroidElement passwordErrorMessage;

    @AndroidFindBy(id = "com.fileforlife.app:id/invalidConfirmPasswordTextView")
    private AndroidElement confirmPasswordErrorMessage;

    public String getSignUpScreenActivity() {
        return SIGN_UP_SCREEN_ACTIVITY;
    }

    public void swipeByCoordinates() throws InterruptedException {
        int x = 542;
        int star_Y = 672;
        int end_y = 955;
        Duration duration = Duration.ofSeconds(2000);
        WaitOptions waitOptions = new WaitOptions().withDuration(duration);

        action.press(new PointOption().withCoordinates(x, star_Y)).waitAction(waitOptions).moveTo(new PointOption()
                .withCoordinates(x, end_y)).release().perform();

    }

    public AndroidSignUpPage enterName(String name) {
        firstNameInput.sendKeys(name);
        return this;
    }

    public AndroidSignUpPage enterLastName(String lastName) {
        lastNameInput.sendKeys(lastName);
        return this;
    }

    public AndroidSignUpPage enterEmail(String email) {
        emailInput.sendKeys(email);
        return this;
    }

    public AndroidSignUpPage enterPassword(String password) {
        passwordInput.sendKeys(password);
        return this;
    }

    public AndroidSignUpPage enterConfirmPassword(String confirmPassword) {
        confirmPasswordInput.sendKeys(confirmPassword);
        return this;
    }

    public AndroidSignUpPage checkTheReceiveNewsLetterCheckbox() {
        receiveNewsLetterCheckbox.click();
        return this;
    }

    public AndroidSignUpPage tapDateInput() {
        dateOfBirthInput.click();
        return this;
    }

    public AndroidSignUpPage tapPasswordInput(){
        passwordInput.click();
        return this;
    }

    public AndroidSignUpPage tapOkButtonOnThePasswordAlert(){
        wait.withMessage("Password alert isn't displayed").until(ExpectedConditions.visibilityOf(passwordAlert));
        okButtonOnThePassworAlert.click();
        return this;
    }

    public AndroidSignUpPage tapOkButtonOnTheDatePicker(){
        wait.withMessage("Date picker isn't displayed").until(ExpectedConditions.visibilityOf(datePicker));
        datePickerOkButton.click();
        return this;
    }

    public void tapSingUpButton() {
//       action.moveTo(new PointOption().withCoordinates(607,1885)).perform();
       signUpButton.click();
    }

    public boolean isFirstNameErrorMessageDisplayed() {
        return firstNameErrorMessage.isDisplayed();
    }

    public boolean isLastNameErrorMessageDisplayed() {
        return lastNameErrorMessage.isDisplayed();
    }

    public boolean isEmailErrorMessageDisplayed() {
        return emailErrorMessage.isDisplayed();
    }

    public boolean isDateOfBirthErrorMessageDisplayed() {
        return dateOfBirthErrorMessage.isDisplayed();
    }
    public boolean isDateAlertDisplayed(){
        return datePicker.isDisplayed();
    }

    public boolean isPasswordErrorMessageDisplayed() {
        return passwordErrorMessage.isDisplayed();
    }

    public boolean isConfirmPasswordErrorMessageDisplayed() {
        return confirmPasswordErrorMessage.isDisplayed();
    }

    public boolean isPasswordAlertDisplayed(){
        return wait.withMessage("Password alert isn't displayed").until(ExpectedConditions.visibilityOf(passwordAlert))
                .isDisplayed();
    }
}
