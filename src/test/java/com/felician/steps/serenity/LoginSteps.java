package com.felician.steps.serenity;

import com.felician.pages.HomePage;
import com.felician.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class LoginSteps extends ScenarioSteps {

    HomePage homePage;
    LoginPage loginPage;


    @Step
    public void navigateToHomepage(){
        homePage.open();
    }

     @Step
    public void goToMyAccountButton() {
    homePage.clickMyAccountButton();
    }

    @Step
    public void SetEmail(){
        loginPage.setEmailField();
    }

    @Step
    public void SetPassword(){
        loginPage.setPasswordField();
    }

    @Step
    public void clickOnloginButton(){
        loginPage.clickLoginButton();
    }


    @Step
    public void clickShopButton() {
        loginPage.clickOnShopButton();
    }

    @Step
    public void clickSearchBar(){
        loginPage.clickOnSearchBar();
    }

    @Step
    public void seachAlbum() {
        loginPage.searchProduct();
    }

    @Step
    public  void clickOnOrders(){
        loginPage.clickOnOrderButton();
    }

    @StepGroup
    public void Login(){
        navigateToHomepage();
        goToMyAccountButton();
        SetEmail();
        SetPassword();
        clickOnloginButton();
    }

    @StepGroup
    public void useSearchBar(){
        navigateToHomepage();
        clickSearchBar();
        seachAlbum();
    }

    @StepGroup
    public void goToOrders () {
        navigateToHomepage();
        goToMyAccountButton();
        SetEmail();
        SetPassword();
        clickOnOrders();
    }

    @StepGroup
    public void goToShop (){
        navigateToHomepage();
        goToMyAccountButton();
        SetEmail();
        SetPassword();
        clickShopButton();
    }

}
