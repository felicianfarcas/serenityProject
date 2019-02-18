package com.felician.steps.serenity;

import com.felician.pages.LogoutPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class LogoutSteps extends ScenarioSteps {
    LogoutPage logoutPage;

    @Step
    public void LogoutButton() {
        logoutPage.logoutButton();
    }
}
