package com.felician.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


@DefaultUrl ("http://qa4.fasttrackit.org:8008/?page_id=120")
public class InvalidLoginPage extends PageObject {

    @FindBy (id= "username")
    private WebElementFacade emailField;

    @FindBy (id= "password")
    private WebElementFacade passwordField;

    @FindBy (css = ".login p.form-row button")
    private WebElementFacade loginButon;


    public void setEmailField(){
        waitFor(emailField);
        typeInto(emailField, "6343463@gmail.com");
    }

    public void setPasswordField(){
        typeInto(passwordField, "gggh4567890.");
    }

    public void clickLoginButton() {
        clickOn(loginButon);
    }

}
