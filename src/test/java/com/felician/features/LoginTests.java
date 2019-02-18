package com.felician.features;

import com.felician.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTests {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    LoginSteps loginSteps;

    @Test
    public void validLoginTest() {
        loginSteps.navigateToHomepage();
        loginSteps.goToMyAccountButton();
        loginSteps.SetEmail();
        loginSteps.SetPassword();
        loginSteps.clickOnloginButton();
    }


}
