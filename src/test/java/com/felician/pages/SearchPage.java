package com.felician.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa4.fasttrackit.org:8008")
public class SearchPage extends PageObject {


    @FindBy(css = "label input.search-field")
    private static WebElementFacade albumProduct;



    public void clickOnResultedProduct() {
        clickOn(albumProduct);
    }
}
