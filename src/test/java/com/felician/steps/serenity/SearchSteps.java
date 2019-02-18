package com.felician.steps.serenity;

import com.felician.pages.SearchPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchSteps extends ScenarioSteps {
    SearchPage searchPage;

    @Step
    public void clickResultedProduct (){
        searchPage.clickOnResultedProduct();
    }

}


