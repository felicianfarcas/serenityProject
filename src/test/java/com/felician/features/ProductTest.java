package com.felician.features;

import com.felician.steps.serenity.LoginSteps;
import com.felician.steps.serenity.ProductSteps;
import com.felician.steps.serenity.SearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class ProductTest {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    LoginSteps loginSteps;
    SearchSteps searchSteps;
    ProductSteps productSteps;

    @Test
    public void checkreview() {
        loginSteps.useSearchBar();
      searchSteps.clickResultedProduct();
        productSteps.writeComment();
    }

}
