package com.felician.steps.serenity;

import com.felician.pages.CartPage;
import com.felician.pages.HomePage;
import com.felician.pages.InvalidLoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class InvalodLoginSteps extends ScenarioSteps {

    HomePage homePage;
    InvalidLoginPage invalidLoginPage;

    @Step
    public void navigateToHomepage() {
        homePage.open();
    }

    @Step
    public void goToMyAccountButton() {
        homePage.clickMyAccountButton();
    }

    @Step
    public void SetEmailFalse(){
        invalidLoginPage.setEmailField();
    }

    @Step
    public void SetPasswordFalse(){
        invalidLoginPage.setPasswordField();
    }

    @Step
    public void clickOnloginButton(){
        invalidLoginPage.clickLoginButton();
    }

    public static class CartSteps extends ScenarioSteps {
        CartPage cartPage;
        @Step
        public void changeQuantity() {
            cartPage.addQuantity();
        }
        @Step
        public void checkQuantity () {
            Assert.assertTrue(cartPage.checkProductQuantity());
        }
        @Step
        public void clickUpdateButton (){
            cartPage.clickOnUpdateCart();
        }
        @Step
        public void clickCheckoutButton () {
            cartPage.clickOnCheckoutButton();
        }

        @StepGroup
        public void ProceedToCheckout () {
            changeQuantity();
            clickUpdateButton();
            checkQuantity();
            clickCheckoutButton();
        }
    }
}