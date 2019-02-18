package com.felician.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa4.fasttrackit.org:8008/?product=album")
public class ProductPage extends PageObject {

    @FindBy( css="li.reviews_tab a")
    private WebElementFacade reviewButton;

    @FindBy (css = "a.star-4")
    private WebElementFacade rateStars;

    @FindBy (css="textarea#comment")
    private WebElementFacade reviewField;

    @FindBy (css="input.submit")
    private WebElementFacade submitButton;

    public void clickOnReviewButton () {
        clickOn(reviewButton);
    }
    public void selectRating () {
        clickOn(rateStars);
    }

    public void writeComment (){
        typeInto(reviewField, "Salut lume :)");
    }

    public void clickOnSubmitButton() {
        clickOn(submitButton);
    }
}
