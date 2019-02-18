package com.felician.features;

import com.felician.pages.InvalidLoginPage;
import com.felician.steps.serenity.InvalodLoginSteps;
import com.felician.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class InvalidLoginTest {
    @Managed(uniqueSession = true)
    WebDriver driver;

    @Steps
    InvalodLoginSteps invalodLoginSteps;

    @Test
    public void InvalodLoginTest(){
     invalodLoginSteps.navigateToHomepage();
     invalodLoginSteps.goToMyAccountButton();
     invalodLoginSteps.SetEmailFalse();
     invalodLoginSteps.SetPasswordFalse();
     invalodLoginSteps.clickOnloginButton();
    }

}
