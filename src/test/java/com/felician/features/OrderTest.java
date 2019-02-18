package com.felician.features;

import com.felician.steps.serenity.LoginSteps;
import com.felician.steps.serenity.OrderSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class OrderTest {
    @Managed (uniqueSession = true)
    private WebDriver driver;

    @Steps
    LoginSteps loginSteps;
    OrderSteps orderSteps;

    @Test
    public void Order(){
        loginSteps.goToOrders();
        orderSteps.checkOrders();
    }

}
