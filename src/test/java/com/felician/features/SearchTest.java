package com.felician.features;

import com.felician.steps.serenity.LoginSteps;
import com.felician.steps.serenity.SearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchTest {
    @Managed (uniqueSession = true)
    private WebDriver driver;

    @Steps
    LoginSteps loginSteps;
    SearchSteps searchSteps;

    @Test
    public void selectFromResults () {
     loginSteps.useSearchBar();
     searchSteps.clickResultedProduct();
    }
}
