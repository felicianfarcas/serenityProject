package com.felician.steps.serenity;

import com.felician.pages.OrderPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class OrderSteps extends ScenarioSteps {
    OrderPage orderPage;

    @Step
    public void  checkOrders(){
        Assert.assertTrue(orderPage.chechOrder("#190"));
    }

}
