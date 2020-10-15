package com.fileforfile.app.tests;/* Created by user on 29.07.20 */


import org.testng.Assert;
import org.testng.annotations.Test;


public class SmokeTest extends TestBase {

    @Test
    public void shouldVerifyingTheMainContentIsLoaded_WhenUserOnThePreviewScreen() {
        Assert.assertTrue(androidPreviewPage.isPreviewPageLoaded());
    }

    @Test
    public void should_ReturnUserToPreviewScreen_WhenUserTapOnTheBacKButtonOnTheLoginScreen() {
        androidPreviewPage.tapLoginButton();
        androidLoginPage.fillEmailInput("testig@mailinator.com");
        androidLoginPage.fillPasswordInput("Zaqwsx21.");
        androidLoginPage.tapLoginInButton();
        Assert.assertEquals(androidPreviewPage.getActivity(), androidLoginPage.getCurrentActivity());
    }

    @Test(enabled = false, description = "The test method the verifying the swipe action")
    public void should_swipeScreen() throws InterruptedException {
        androidPreviewPage.tapSignUpButton();
        androidSignUpPage.tapDateInput();
        androidSignUpPage.swipeByCoordinates();
    }

    @Test
    public void should_RegisterUser_When_TheUserFillFormAndTapTheSignUpButton() {
        androidPreviewPage.tapSignUpButton();
        androidSignUpPage
                .enterName("Igor")
                .enterLastName("Gabelya")
                .enterEmail("poqw@mailinator.com")
                .tapDateInput()
                .tapOkButtonOnTheDatePicker()
                .tapOkButtonOnThePasswordAlert()
                .enterPassword("Zaqwsx21.")
                .enterConfirmPassword("Zaqwsx21.")
                .tapSingUpButton();
        Assert.assertTrue(verificationPage.isThisVerificationScreen());
    }

    @Test
    public void should_showErrorMessage_When_UserLeavesTheFirstNameFieldEmpty() {
        androidPreviewPage.tapSignUpButton();
        androidSignUpPage
                .enterLastName("Bla")
                .enterEmail("poqw@mailinator.com")
                .tapDateInput()
                .tapOkButtonOnTheDatePicker()
                .tapOkButtonOnThePasswordAlert()
                .enterPassword("Zaqwsx21.")
                .enterConfirmPassword("Zaqwsx21.")
                .tapSingUpButton();
        Assert.assertTrue(androidSignUpPage.isFirstNameErrorMessageDisplayed());
    }

    @Test
    public void should_VerifyThatPasswordAlertIsDisplayed_When_UserTapThePasswordField() {
        androidPreviewPage.tapSignUpButton();
        androidSignUpPage
                .tapPasswordInput();
        Assert.assertTrue(androidSignUpPage.isPasswordAlertDisplayed());
    }

    @Test
    public void should_ShowTheErrorMessage_When_UserLeavesTheLastNameInputEmpty() {
        androidPreviewPage.tapSignUpButton();
        androidSignUpPage
                .enterName("Igor")
                .enterEmail("poqw@mailinator.com")
                .tapDateInput()
                .tapOkButtonOnTheDatePicker()
                .tapOkButtonOnThePasswordAlert()
                .enterPassword("Zaqwsx21.")
                .enterConfirmPassword("Zaqwsx21.")
                .tapSingUpButton();
        Assert.assertTrue(androidSignUpPage.isLastNameErrorMessageDisplayed());
    }

    @Test
    public void should_ShowTheDatePicker_When_UserTapsTheDateOfBirthInput() {
        androidPreviewPage.tapSignUpButton();
        androidSignUpPage
                .tapDateInput();
        Assert.assertTrue(androidSignUpPage.isDateAlertDisplayed());
    }

    @Test
    public void should_ShowErrorMessage_When_UserDifferentPasswordToThePasswordFields() {
        androidPreviewPage.tapSignUpButton();
        androidSignUpPage
                .enterName("Igor")
                .enterLastName("Gabelya")
                .enterEmail("poqw@mailinator.com")
                .tapDateInput()
                .tapOkButtonOnTheDatePicker()
                .tapOkButtonOnThePasswordAlert()
                .enterPassword("Zaqwsx21.")
                .enterConfirmPassword("Zaqwsx21.1")
                .tapSingUpButton();
        Assert.assertTrue(androidSignUpPage.isConfirmPasswordErrorMessageDisplayed());
    }


}
