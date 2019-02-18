package com.fast.steps.serenity;

import com.fast.pages.AddToCartPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class AddToCartSteps extends ScenarioSteps {
    AddToCartPage addToCartPage;

       @Step
    public void addAlbumToCart() {
        addToCartPage.selectProduct("Album");
    }

    @Step
    public void viewCart() {
        addToCartPage.viewCart();
    }
}