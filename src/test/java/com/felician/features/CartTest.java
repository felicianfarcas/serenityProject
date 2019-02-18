package com.fast.features;

import com.fast.steps.serenity.AddToCartSteps;
import com.fast.steps.serenity.CartSteps;
import com.felician.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTest {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    LoginSteps loginSteps;
    AddToCartSteps addToCartSteps;
    CartSteps cartSteps;


    @Test
    public void validProcceedCheckout () {
        loginSteps.goToShop();
        addToCartSteps.addAlbumToCart();
        cartSteps.ProceedToCheckout();
    }

}