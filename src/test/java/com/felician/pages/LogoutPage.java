package com.felician.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://qa4.fasttrackit.org:8008/?page_id=120")
public class LogoutPage extends PageObject {
    @FindBy (css="customer-logout")
    private WebElementFacade logoutButton;


    public void logoutButton() {
        clickOn(logoutButton);
    }
}
