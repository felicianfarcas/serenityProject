package com.felician.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;

@DefaultUrl("http://qa4.fasttrackit.org:8008/?page_id=120")
public class LoginPage extends PageObject {

    @FindBy (id= "username")
    private WebElementFacade emailField;

    @FindBy (id= "password")
    private WebElementFacade passwordField;

    @FindBy (css = ".login p.form-row button")
    private WebElementFacade loginButon;

    @FindBy (css= "li.menu-item-123 a")
    private WebElementFacade ShopButton;

    @FindBy (css= "label input.search-field ")
    private WebElementFacade searchBar;

    @FindBy (css = "li.woocommerce-MyAccount-navigation-link--orders a")
    private WebElementFacade orderButton;



    public void setEmailField(){
        waitFor(emailField);
        typeInto(emailField, "felician.farcas@gmail.com");
    }

    public void setPasswordField(){
       typeInto(passwordField, "Felician1234567890.");
    }

    public void clickLoginButton() {
        clickOn(loginButon);
    }

    public void clickOnShopButton() {
        clickOn(ShopButton);
    }

    public void clickOnSearchBar() {
        clickOn(searchBar);
    }

    public void searchProduct() {
        searchBar.sendKeys("Album" , Keys.ENTER);
    }

    public void clickOnOrderButton(){
        clickOn(orderButton);
    }

}

