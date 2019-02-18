package com.felician.steps.serenity;

import com.felician.pages.ProductPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class ProductSteps extends ScenarioSteps {
    ProductPage productPage;


    @Step
    public void clickReviewButton () {
        productPage.clickOnReviewButton();
    }
    @Step
    public void selectRating () {
        productPage.selectRating();
    }
    @Step
    public void writeComment () {
        productPage.writeComment();
    }
    @Step
    public void clickSubmitButton () {
        productPage.clickOnSubmitButton();
    }

}
