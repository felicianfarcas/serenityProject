package com.felician.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://qa4.fasttrackit.org:8008")
public class HomePage extends PageObject {

    @FindBy (css= ".menu-item-122 a")
    private WebElementFacade myAccountButton;

    public void clickMyAccountButton(){
        waitFor(myAccountButton);
        clickOn(myAccountButton);
    }
}
