package com.fileforfile.app.tests;/* Created by user on 29.07.20 */


import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


public class SmokeTest extends TestBase {

    @Test
    public void shouldVerifyingTheMainContentIsLoaded_WhenUserOnThePreviewScreen() {
        Assert.assertTrue(androidPreviewPage.isPreviewPageLoaded());
    }

    @Test
    public void shouldVerifyingTheBackButtonReturnsUserToPreviewScreen_WhenUserTapOnTheBacKButtonOnTheLoginScreen() {
        androidPreviewPage.tapLoginButton();
        androidLoginPage.fillEmailInput("testig@mailinator.com");
        androidLoginPage.fillPasswordInput("Zaqwsx21.");
        androidLoginPage.tapLoginInButton();
        Assert.assertEquals(androidPreviewPage.getActivity(), androidLoginPage.getCurrentActivity());
    }

    @Ignore
    public void blabla() throws InterruptedException {
        androidPreviewPage.tapSignUpButton();
        androidSignUpPage.tapDateInput();
        androidSignUpPage.swipeByCoordinates();
    }

    @Test
    public void shouldFillTheSignUpForm(){
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
    public void firstNameAlert(){
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
    public void passwordAlert(){
        androidPreviewPage.tapSignUpButton();
        androidSignUpPage
                .tapPasswordInput();
        Assert.assertTrue(androidSignUpPage.isPasswordAlertDisplayed());
    }

    @Test
    public void LastNameAlert(){
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
    public void DateOfBirthAlert(){
        androidPreviewPage.tapSignUpButton();
        androidSignUpPage
                .tapDateInput();
        Assert.assertTrue(androidSignUpPage.isDateAlertDisplayed());
    }

    @Test
    public void PasswordDoesntMatch(){
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
