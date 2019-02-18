package com.felician.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa4.fasttrackit.org:8008/?page_id=120")
public class RegistrationPage  extends PageObject {


    @FindBy (id= "reg_email")
    private WebElementFacade EmailAddress;

    @FindBy (id= "reg_password")
    private WebElementFacade Password;

    @FindBy (id= "p.woocommerce-FormRow button")
    private WebElementFacade RegisterButton;

    public void setEmailAddress(String emailAddress){
        typeInto(EmailAddress, emailAddress);
    }

    public void setPassword (String password){
        typeInto(Password,password);
    }

      public void clickOnRegisterButton() {
        clickOn(RegisterButton);
    }
}
