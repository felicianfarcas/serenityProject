package com.felician.steps.serenity;

import com.felician.pages.HomePage;
import com.felician.pages.RegistrationPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.steps.WaitForBuilder;

public class RegistrationSteps extends ScenarioSteps {

    HomePage homePage;
    RegistrationPage registrationPage;

    @Step
    public void navigateToHomepage(){
        homePage.open();
    }

    @Step
    public void goToMyAccountButton() {
        homePage.clickMyAccountButton();
    }

    @Step
    public void setRegistrationEmail() {
        registrationPage.setEmailAddress("felician.farcas@yahoo.com");
    }

    @Step
    public void setPassword() {
        registrationPage.setPassword("Felician1234567890,");
    }

    @Step
    public void clickOnRegisterButton() {
        registrationPage.clickOnRegisterButton();
    }

    @StepGroup
    public void Register(){
        navigateToHomepage();
        goToMyAccountButton();
        setRegistrationEmail();
        setPassword();
        clickOnRegisterButton();
    }
}
